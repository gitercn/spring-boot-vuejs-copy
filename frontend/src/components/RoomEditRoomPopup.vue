<template>
  <v-dialog v-model="dialog" max-width="600px">
    <template v-slot:activator="{ on }">
      <v-btn v-on="on" color="primary">Edit Room</v-btn>
    </template>

    <v-card>
      <v-card-title>Edit Room</v-card-title>
      <v-card-text class="px-3">
        <v-form>
          <v-text-field v-model="meetingroomitem.meetingroomkey" label="Room Key"></v-text-field>
          <v-text-field v-model="meetingroomitem.meetingroomid" label="Room ID"></v-text-field>
          <v-text-field v-model="meetingroomitem.capacity" label="Capacity"></v-text-field>
          <!-- <v-text-field v-model="room.starttm" label="Start Time"></v-text-field>
          <v-text-field v-model="room.endtm" label="End Time"></v-text-field> -->
          <v-textarea v-model="meetingroomitem.topic" label="Topic"></v-textarea>
          <v-btn @click="editRoom">Edit</v-btn>
          {{responseData}}
        </v-form>
      </v-card-text>
    </v-card>
  </v-dialog>
</template>

<script>
import { AXIOS } from "./backend-api";

export default {
  props: {
    meetingroomitem: {
      type: Object
    }
  },
  data() {
    return {
      dialog: false,
      room: { meetingroomkey: "", meetingroomid: "", capacity: "", starttm: "", endtm: "", topic: "", updatetm: "", createtm: "" },
      responseData: ""
    };
  },
  methods: {
    editRoom() {
      AXIOS.post(`api/updateMeetingroom`, this.meetingroomitem)
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