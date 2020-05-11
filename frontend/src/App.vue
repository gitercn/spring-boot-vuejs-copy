<template>
  <v-app>
    
    <Navbar/>
    <v-content>

        <router-view />

    </v-content>
  </v-app>
</template>

<script>
import Navbar from "@/components/Navbar"; // @指代src文件夹

export default {
  name: "App",

  components: {
    Navbar
  },

  data: () => ({
    //
  })
};
</script>
