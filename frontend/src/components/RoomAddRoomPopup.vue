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
          <v-datetime-picker label="Select Starttime" v-model="room.starttm">
            <template slot="dateIcon">
              <v-icon>mdi-calendar-outline</v-icon>
            </template>
            <template slot="timeIcon">
              <v-icon>mdi-clock-outline</v-icon>
            </template>
          </v-datetime-picker>
          <v-datetime-picker label="Select Endtime" v-model="room.endtm">
            <template slot="dateIcon">
              <v-icon>mdi-calendar-outline</v-icon>
            </template>
            <template slot="timeIcon">
              <v-icon>mdi-clock-outline</v-icon>
            </template>
          </v-datetime-picker>
          <!-- <VueCtkDateTimePicker v-model="room.starttm" /> -->
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
      room: {
        meetingroomkey: "",
        meetingroomid: "",
        capacity: "",
        starttm: null,
        endtm: null,
        topic: "",
        updatetm: new Date(),
        createtm: new Date()
      },
      responseData: ""
    };
  },
  methods: {
    addRoom() {
      console.log(this.room);
      console.log(typeof(this.room.starttm));
      console.log(this.room.starttm instanceof Date);
      AXIOS.post(`api/insertMeetingroom`, this.room)
        .then(response => {
          // JSON responses are automatically parsed.
          this.responseData = response.data;
          this.dialog = false;
          // this.$router.go(0);
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