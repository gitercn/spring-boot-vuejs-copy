import Vue from 'vue'
import VueRouter from 'vue-router'
// import Hello1 from '../views/Hello1.vue'
import Service from '../components/Service.vue'
// import Booking from '../components/Booking.vue'
import Room from '../components/Room.vue'

Vue.use(VueRouter)

const routes = [
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
    path: '/Room',
    name: 'Room',
    component: Room
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
