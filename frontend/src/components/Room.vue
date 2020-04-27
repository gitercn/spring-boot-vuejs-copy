<template>
  <v-container>
    <v-row class="ma-3">
      <RoomAddRoomPopup/>
      <!-- <v-btn>
        Add Room
      </v-btn> -->

    </v-row>

    <v-card class="ma-3 pa-2" v-for="item in responseData" :key="item.meetingroomid">
      <v-row>
        <v-col cols="12" md="1">
          <div>Room Key</div>
          <div>{{ item.meetingroomkey }}</div>
        </v-col>
        <v-col cols="12" md="1">
          <div>Room ID</div>
          <div>{{ item.meetingroomid }}</div>
        </v-col>
        <v-col>
          <div>Capacity</div>
          <div>{{ item.capacity }}</div>
        </v-col>
        <!-- <v-col cols="12" md="2">
          <div>Start Time</div>
          <div>{{ item.starttm }}</div>
        </v-col>
        <v-col cols="12" md="2">
          <div>End Time</div>
          <div>{{ item.endtm }}</div>
        </v-col> -->
        <v-col>
          <div>Topic</div>
          <div>{{ item.topic }}</div>
        </v-col>
        <v-col>
          <div>Creater</div>
          <div>{{ item.creater }}</div>
        </v-col>
      </v-row>
      <v-row cols="12">
        <v-divider dark></v-divider>
      </v-row>
    </v-card>
  </v-container>
</template>

<script>
import { AXIOS } from "./backend-api";
import RoomAddRoomPopup from "./RoomAddRoomPopup";

export default {
  components: {
    RoomAddRoomPopup
  },
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