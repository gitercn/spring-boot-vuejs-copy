<template>
  <div class="page2popup">
    <!-- <h1>This is page 2 Popup</h1>
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
    <button @click="changeRoomOnPage2">使用commit改值</button> -->
    <p>我是子组件</p>
    <slot>
        <p>如果父组件没有插件内容，我就默认显示 https://blog.csdn.net/qq_36407748/article/details/80150741</p>
    </slot>
  </div>
</template>
<script>
export default {
  // name: "page2popup",
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