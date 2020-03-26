import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
// import Hello1 from '../views/Hello1.vue'
import Service from '../components/Service.vue'
import Page1 from '../components/Page1.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/',
    name: 'Service',
    component: Service
  },
  {
    path: '/Page1',
    name: 'Page1',
    component: Page1
  },
  // {
  //   path: '/hello1',
  //   name: 'Hello1',
  //   component: Hello1
  // },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
