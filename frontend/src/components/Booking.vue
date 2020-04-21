<template>
  <v-container>
    <v-card>
      <v-row class="pa-2" v-for="item in responseData" :key="item.meetingroomid">
        <v-col cols="12" md="6">
          <div>Room Number</div>
          <div>{{ item.meetingroomid }}</div>
        </v-col>
        <v-col cols="12" md="2">
          <div>Book Time</div>
          <div>{{ item.createtm }}</div>
        </v-col>
        <v-col>
          <div>Usage</div>
          <div>{{ item.topic }}</div>
        </v-col>
        <v-col>
          <div>User</div>
          <div>{{ item.creater }}</div>
        </v-col>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
import { AXIOS } from "./backend-api";

export default {
  data() {
    return {
      projects: [],
      responseData: []
    };
  },
  created() {
    AXIOS.post(`api/getAllRoom`)
      .then(response => {
        // JSON responses are automatically parsed.
        console.log(response.data);
        this.responseData = response.data;
        console.log(this.responseData);
      })
      .catch(e => {
        this.errors.push(e);
      });
  }
};
</script>

<style>
</style>