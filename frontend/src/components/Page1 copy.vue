<template>
  <div class="page1">
    <h1>This is page 1</h1>
    <br />
    <button @click="jumpBack()">Jump Back</button>
    <br />
    <input v-model="roomOnPage1.roomid" />
    <br />
    {{ this.$store.state.roomOnPage1.roomid }}
    <br />roomdetail:
    <br />
    <input v-model="roomOnPage1.roomdetail" />
    <br />
    {{ this.$store.state.roomOnPage1.roomdetail }}
    <button @click="changeRoomOnPage1">使用commit改值</button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      roomOnPage1: {
          roomid:"",
          roomdetail:""
      }
    };
  },
  methods: {
    jumpBack() {
      this.$router.push("/");
    },

    changeRoomOnPage1() {
      this.$store.commit("mutationsChangeRoomOnPage1", this.roomOnPage1);
    }
  }
};
</script>