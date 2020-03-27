<template>
  <div class="page3">
    <h1>This is page 3</h1>
    <br />roomid:
    <br />
    {{ this.$store.state.roomOnPage2.roomid }}
    <br />roomdetail:
    <br />
    {{ this.$store.state.roomOnPage2.roomdetail }}
    <br />
    <button @click="openPage2Modal">Show Popup</button>
    <page2modal/>

    <br />
    <input type="date">
    <br />
    <br />
    <v-row justify="center">
    <v-date-picker v-model="picker"></v-date-picker>
    </v-row>
    <br />
    <button @click="jumpBack()">Jump Back</button>
  </div>
</template>
<script>
import page2modal from "./page2modal.vue";

export default {
  // name: "page2",
  components:{
    page2modal,
  },
  data() {
    return {
    };
  },
  methods: {
    jumpBack() {
      this.$router.push("/");
    },

    openPage2Modal(){
      this.$modal.show('page2modal')
    }
  }
};
</script>