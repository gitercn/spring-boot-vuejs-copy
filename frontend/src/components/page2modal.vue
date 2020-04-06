<template>
  <modal name="page2modal">
    <!-- 参考教程：https://blog.csdn.net/asing1elife/article/details/89248946 -->
    <!-- https://github.com/Dream4ever/knowledge-base/issues/35 -->
    This is Page 2 Popup

    <br />roomid:<br />
    <input v-model="roomOnPage2.roomid" />
    <br />roomdetail:<br />
    <input v-model="roomOnPage2.roomdetail" />
    <br />
    <v-btn @click="changeRoomOnPage2">Update Room On Page2</v-btn>
    <br />
    <v-btn @click="insertRoomOnPage2">Update to Database</v-btn>
    <h3>{{ responseData }}</h3>
  </modal>
</template>
<script>
import { AXIOS } from "./backend-api";
export default {
  // name: "page2popup",
  data() {
    return {
      responseData:[],
      roomOnPage2: {
          roomid:"",
          roomdetail:""
      }
    };
  },
  methods: {
    changeRoomOnPage2() {
      this.$store.commit("mutationsChangeRoomOnPage2", this.roomOnPage2);
    },
    insertRoomOnPage2() {
      AXIOS.post(`api/insertRoom`, this.roomOnPage2)
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