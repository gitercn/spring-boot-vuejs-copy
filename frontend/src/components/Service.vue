<template>
  <div class="service">

    <button class=”Search__button” @click="callRestServicea()">Button A</button>

    <h3>{{ postsa }}</h3>

    <button class=”Search__button” @click="callRestServiceb()">Button B</button>

    <h3>{{ postsb }}</h3>

    <button class=”Search__button” @click="callRestServicec()">Button C</button>

    <h3>{{ postsc }}</h3>

  </div>
</template>

<script>
import {AXIOS} from './backend-api'

export default {
  name: 'hello',

  data () {
    return {
      postsa: [],
      postsb: [],
      postsc: [],
      errors: []
    }
  },
  methods: {
    // Fetches posts when the component is created.
    callRestServicea () {
      AXIOS.get(`api/helloa`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsa = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    callRestServiceb () {
      AXIOS.get(`api/hellob`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsb = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    },
    callRestServicec () {
      AXIOS.get(`api/helloc`)
        .then(response => {
          // JSON responses are automatically parsed.
          this.postsc = response.data
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
  }
}

</script>


<style scoped>
</style>
