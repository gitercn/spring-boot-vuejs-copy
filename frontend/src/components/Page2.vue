<template>
  <div class="page2">
    <h1>This is page 2</h1>
    <br />
    <button @click="jumpBack()">Jump Back</button>
    <br />
    <input v-model="roomOnPage2.roomid" />
    <br />
    {{ this.$store.state.roomOnPage2.roomid }}
    <br />roomdetail:
    <br />
    <input v-model="roomOnPage2.roomdetail" />
    <br />
    {{ this.$store.state.roomOnPage2.roomdetail }}
    <button @click="changeRoomOnPage2">使用commit改值</button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      roomOnPage2: {
          roomid:"",
          roomdetail:""
      }
    };
  },
  methods: {
    jumpBack() {
      this.$router.push("/");
    },

    changeRoomOnPage2() {
      this.$store.commit("mutationsChangeRoomOnPage2", this.roomOnPage2);
    }
  }
};
</script>