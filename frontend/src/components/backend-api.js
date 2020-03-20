import axios from 'axios'

export const AXIOS = axios.create({
  baseURL: `/`, // 添加了devServer.proxy之后这里也需要从http://localhost:8080改成/
  headers: {
    'Access-Control-Allow-Origin': 'http://localhost:8080'
  }
})
