<template>
  <div class="hello">
    <button class=”Search__button” @click="callRestService()">CALL Spring Boot REST backend service</button>
    <h3>{{ response }}</h3>
  </div>
</template>

<script>
import axios from 'axios'

data ();{
  return {
    response: [],
    errors: []
  }
}

callRestService ();{
  axios.get(`api/hello`)
    .then(response => {
      // JSON responses are automatically parsed.
      this.response = response.data
    })
    .catch(e => {
      this.errors.push(e)
    })
}

</script>