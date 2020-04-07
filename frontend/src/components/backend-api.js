import axios from 'axios'

export const AXIOS = axios.create({
  baseURL: `/api`, // 添加了devServer.proxy之后这里也需要从http://localhost:8080改成/
  // headers: { // 添加了devServer.proxy之后这个header也就不需要了
  //   'Access-Control-Allow-Origin': 'http://localhost:8080'
  // }
})
