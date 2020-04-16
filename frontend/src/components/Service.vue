<template>
  <div class="service">
    <v-container fluid>
      <v-row>
        <v-col cols="12" md="6" lg="3">
          <v-btn block>1</v-btn>
        </v-col>
        <v-col cols="12" md="6" lg="3">
          <v-btn block>1</v-btn>
        </v-col>
      </v-row>

      <v-btn @click="callRestServicea()">Button A</v-btn>

      <h3>{{ postsa }}</h3>

      <v-btn @click="callRestServiceb()">Button B</v-btn>
      <br />roomid :
      <br />
      <v-text-field v-model="room.roomid" />
      <br />
      {{ room.roomid }}
      <br />roomdetail:
      <br />
      <v-text-field v-model="room.roomdetail" />
      <br />
      {{ room.roomdetail }}
      <h3>{{ postsb }}</h3>

      <v-btn @click="callRestServicec()">Button C</v-btn>
      <br />roomidc :
      <br />
      <v-text-field v-model="roomc.roomid" />
      <br />
      {{ roomc.roomid }}
      <br />
      <h3>{{ postsc }}</h3>
      <br />
      <v-btn @click="jumpPage1()">Jump Page 1</v-btn>
      <br />
      <v-btn @click="jumpPage2()">Jump Page 2</v-btn>
      <br />
      <v-btn @click="jumpPage3()">Jump Page 3</v-btn>
    </v-container>
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
    jumpPage1() {
      this.$router.push("/Page1");
    },
    jumpPage2() {
      this.$router.push("/Page2");
    },
    jumpPage3() {
      this.$router.push("/Page3");
    }
  }
};
</script>


<style scoped>
</style>
