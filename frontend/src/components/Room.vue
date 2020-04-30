<template>
  <v-container>
    <v-row class="ma-3">
      <RoomAddRoomPopup />
      <v-btn color="primary" class="mx-2" @click="vcardactions = !vcardactions">Edit/Delete Room</v-btn>
    </v-row>

    

    <v-card class="ma-3 pa-2" v-for="item in responseData" :key="item.meetingroomkey">
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
        </v-col>-->
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
      <v-card-actions v-if="vcardactions">
        <RoomEditRoomPopup v-bind:meetingroomitem = "item" />
        <!-- <v-btn color="primary" class="ml-2">Edit Room</v-btn> -->
        <v-btn color="primary" class="ml-2" @click="deletemeetingroom({meetingroomkey : item.meetingroomkey})">Delete Room</v-btn>
      </v-card-actions>
    </v-card>
  </v-container>
</template>

<script>
import { AXIOS } from "./backend-api";
import RoomAddRoomPopup from "./RoomAddRoomPopup";
import RoomEditRoomPopup from "./RoomEditRoomPopup";

export default {
  components: {
    RoomAddRoomPopup,
    RoomEditRoomPopup
  },
  data() {
    return {
      projects: [],
      responseData: [],
      vcardactions: false
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
  },
  methods: {
    deletemeetingroom(deleteMeetingroomVO){
      AXIOS.post(`api/deleteMeetingroom`, deleteMeetingroomVO)
      .then(response => {
        // JSON responses are automatically parsed.
        this.responseData = response.data;
        console.log(this.responseData);
        this.$router.go(0);
      })
      .catch(e => {
        this.errors.push(e);
      });
    }
  }
};
</script>

<style>
</style>