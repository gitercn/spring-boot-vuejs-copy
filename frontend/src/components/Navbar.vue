<template>
  <nav>
    <v-app-bar app>
        <!-- <v-app-bar-title>
            Title
        </v-app-bar-title> -->
        <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
        <v-toolbar-title>
            Room Booking
        </v-toolbar-title>
        <v-spacer></v-spacer>
        <v-btn>
            <span>Sign Out</span>
            <!-- <v-icon right>exit_to_app</v-icon> -->
        </v-btn>
    </v-app-bar>

    <v-navigation-drawer app v-model="drawer">
        <p>test</p>
    </v-navigation-drawer>
  </nav>
</template>

<script>
export default {
    data(){
        return{
            drawer: false,
        }
    }
};
</script>

<style>
</style>