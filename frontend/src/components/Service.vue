<template>
  <div class="service">
    <button @click="callRestServicea()">Button A</button>

    <h3>{{ postsa }}</h3>

    <button @click="callRestServiceb()">Button B</button>
    <br />roomid :
    <br />
    <input v-model="room.roomid" />
    <br />
    {{ room.roomid }}
    <br />roomdetail:
    <br />
    <input v-model="room.roomdetail" />
    <br />
    {{ room.roomdetail }}
    <h3>{{ postsb }}</h3>

    <button @click="callRestServicec()">Button C</button>
    <br />roomidc :
    <br />
    <input v-model="roomc.roomid" />
    <br />
    {{ roomc.roomid }}
    <br />
    {{ roomc.roomdetail }}
    <h3>{{ postsc }}</h3>
    <br />
    <button @click="jumpPage1()">Jump Page 1</button>
  </div>
</template>

<script>
import { AXIOS } from "./backend-api";

export default {
  name: "hello",

  data() {
    return {
      postsa: [],
      postsb: [],
      postsc: [],
      errors: [],
      room: {
        roomid: "",
        roomdetail: ""
      },
      roomc: {
        roomid: "",
        roomdetail: ""
      }
    };
  },
  methods: {
    // Fetches posts when the component is created.
    callRestServicea() {
      AXIOS.get(`api/helloa`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsa = response.data;
        })
        .catch(e => {
          this.errors.push(e);
        });
    },
    callRestServiceb() {
      AXIOS.post(`api/hellob`, this.room)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsb = response.data;
        })
        .catch(e => {
          this.errors.push(e);
        });
    },
    callRestServicec() {
      AXIOS.post(`api/helloc`, this.roomc)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsc = response.data;
        })
        .catch(e => {
          this.errors.push(e);
        });
    },
    jumpPage1(){
      this.$router.push("/Page1")
    }
  }
};
</script>


<style scoped>
</style>
