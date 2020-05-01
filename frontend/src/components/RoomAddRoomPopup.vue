<template>
  <v-dialog v-model="dialog" max-width="600px">
    <template v-slot:activator="{ on }">
      <v-btn v-on="on" color="primary">Add Room</v-btn>
    </template>

    <v-card>
      <v-card-title>Add Room</v-card-title>
      <v-card-text class="px-3">
        <v-form>
          <v-text-field v-model="room.meetingroomkey" label="Room Key"></v-text-field>
          <v-text-field v-model="room.meetingroomid" label="Room ID"></v-text-field>
          <v-text-field v-model="room.capacity" label="Capacity"></v-text-field>
          <!-- <v-text-field v-model="room.starttm" label="Start Time"></v-text-field>
          <v-text-field v-model="room.endtm" label="End Time"></v-text-field> -->
          <VueCtkDateTimePicker v-model="room.starttm" />
          <v-textarea v-model="room.topic" label="Topic"></v-textarea>
          <v-btn @click="addRoom">Add</v-btn>
          {{responseData}}
        </v-form>
      </v-card-text>
    </v-card>
  </v-dialog>
</template>

<script>
import { AXIOS } from "./backend-api";

export default {
  data() {
    return {
      dialog: false,
      room: { meetingroomkey: "", meetingroomid: "", capacity: "", starttm: null, endtm: "", topic: "", updatetm: "", createtm: "" },
      responseData: ""
    };
  },
  methods: {
    addRoom() {
      AXIOS.post(`api/insertMeetingroom`, this.room)
        .then(response => {
          // JSON responses are automatically parsed.
          this.responseData = response.data;
          this.dialog = false;
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