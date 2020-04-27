<template>
  <nav>
    <v-app-bar app>
      <!-- <v-app-bar-title>
            Title
      </v-app-bar-title>-->
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>Room Booking</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn>
        <span>Sign Out</span>
        <!-- <v-icon right>exit_to_app</v-icon> -->
      </v-btn>
    </v-app-bar>

    <v-navigation-drawer app v-model="drawer">
      <v-list>
        <v-list-item v-for="link in links" :key="link.text" router :to="link.route">
          <v-list-item-action>
            <v-icon>{{link.icon}}</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>{{link.text}}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
  </nav>
</template>

<script>
export default {
  data() {
    return {
      drawer: false,
      links: [
        { icon: 'mdi-view-dashboard', text: 'Dashboard', route: '/' },
        { icon: 'mdi-book', text: 'Room', route: '/Room' },
        { icon: 'mdi-account', text: 'User', route: '/account' },
        { icon: 'mdi-account', text: 'Account1', route: '/Page1' },
        { icon: 'mdi-account', text: 'Account2', route: '/Page2' },
        { icon: 'mdi-account', text: 'Account3', route: '/Page3' },
      ]
    };
  }
};
</script>

<style>
</style>