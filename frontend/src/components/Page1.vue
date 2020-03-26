<template>
  <div class="page1">
    <h1>This is page 1</h1>
    <br />
    <button @click="jumpBack()">Jump Back</button>
  </div>
</template>
<script>
export default {
  methods: {
    jumpBack() {
      this.$router.push("/");
    }
  }
};
</script>