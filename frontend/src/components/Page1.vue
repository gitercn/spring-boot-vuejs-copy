<template>
  <div class="page1">
    <h1>This is page 1</h1>
    <br />roomid:<br />
    <input v-model="roomOnPage1.roomid" />
    <br />
    {{ roomOnPage1.roomid }}
    <br />roomdetail:<br />
    <input v-model="roomOnPage1.roomdetail" />
    <br />
    {{ roomOnPage1.roomdetail }}
    <br />
    <button @click="insertRoomOnPage1">Insert to Database</button>
    <br />
    <h3>{{ responseData }}</h3>
    <button @click="jumpBack()">Jump Back</button>
    <br />
  </div>
</template>
<script>
import { AXIOS } from "./backend-api";
export default {
  data() {
    return {
      roomOnPage1: {
          roomid:"",
          roomdetail:""
      },
      responseData:[]
    };
  },
  methods: {
    jumpBack() {
      this.$router.push("/");
    },

    changeRoomOnPage1() {
      this.$store.commit("mutationsChangeRoomOnPage1", this.roomOnPage1);
    },
    insertRoomOnPage1() {
      AXIOS.post(`api/insertRoomOnPage1`, this.roomOnPage1)
        .then(response => {
          // JSON responses are automatically parsed.
          this.responseData = response.data;
        })
        .catch(e => {
          this.errors.push(e);
        });
    }
  }
};
</script>