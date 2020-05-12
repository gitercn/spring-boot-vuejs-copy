import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import VModal from 'vue-js-modal'
Vue.use(VModal)

import vuetify from './plugins/vuetify';

// 通用的vue datetimepicker，可以用但是和vuetify不太协调
// import VueCtkDateTimePicker from 'vue-ctk-date-time-picker';
// import 'vue-ctk-date-time-picker/dist/vue-ctk-date-time-picker.css';
// Vue.component('VueCtkDateTimePicker', VueCtkDateTimePicker);

// Vuetify风格的datetimepicker，但是只能接受Date格式，对于json的ISO格式不能识别
// import DatetimePicker from 'vuetify-datetime-picker'
// // (Optional) import 'vuetify-datetime-picker/src/stylus/main.styl'
 
// Vue.use(DatetimePicker)


// 这个vue-datetime也不好用
// vue-datetime
// import { Datetime } from 'vue-datetime'
// // You need a specific loader for CSS files
// import 'vue-datetime/dist/vue-datetime.css'
 
// Vue.use(Datetime)
// import { Datetime } from 'vue-datetime';
// // You need a specific loader for CSS files
// import 'vue-datetime/dist/vue-datetime.css'
 
// Vue.component('datetime', Datetime);



Vue.use(require('vue-moment'));

Vue.config.productionTip = false

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')
