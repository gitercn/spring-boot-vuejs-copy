import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import VModal from 'vue-js-modal'
Vue.use(VModal)

import vuetify from './plugins/vuetify';

// 通用的vue datatimepicker，可以用但是和vuetify不太协调
// import VueCtkDateTimePicker from 'vue-ctk-date-time-picker';
// import 'vue-ctk-date-time-picker/dist/vue-ctk-date-time-picker.css';
// Vue.component('VueCtkDateTimePicker', VueCtkDateTimePicker);

import DatetimePicker from 'vuetify-datetime-picker'
// (Optional) import 'vuetify-datetime-picker/src/stylus/main.styl'
 
Vue.use(DatetimePicker)

Vue.use(require('vue-moment'));

Vue.config.productionTip = false

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')
