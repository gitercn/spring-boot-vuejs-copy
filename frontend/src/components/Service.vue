<template>
  <div class="service">
    <v-container fluid>
      <v-row>
        <v-col cols="12" md="3" lg="3">
          <v-btn block @click="jumpPage1()">Room</v-btn>
        </v-col>
        <v-col cols="12" md="3" lg="3">
          <v-btn block @click="jumpPage2()">Booking</v-btn>
        </v-col>
        <v-col cols="12" md="3" lg="3">
          <v-btn block @click="jumpPage2()">User</v-btn>
        </v-col>
      </v-row>

      
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
    jumpPage1() {
      this.$router.push("/Room");
    },
    jumpPage2() {
      this.$router.push("/Booking");
    },
    jumpPage3() {
      this.$router.push("/User");
    }
  }
};
</script>


<style scoped>
</style>
