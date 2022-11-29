import { createApp } from "vue";
import "vuetify/styles";
import { createVuetify } from "vuetify";
import * as components from "vuetify/components";
import * as directives from "vuetify/directives";
import App from "./App.vue";
import { createRouter, createWebHistory } from "vue-router";
import MainPage from "@/views/MainPage.vue";
import LocationsPage from "@/views/Locations/LocationsPage.vue";
import ReviewMain from "@/views/Review/ReviewMain.vue";
import '@mdi/font/css/materialdesignicons.css'
import ForumMain from "@/views/Forum/ForumMain.vue";
import LogIn from "@/views/LogIn.vue";
import RegisterPage from "@/views/RegisterPage.vue";

// import AddLocationButton from "@/views/Locations/AddLocationButton";
// import AddReviewButton from "@/views/Review/AddReviewButton";
import TopicPage from "@/views/Forum/TopicPage";
const vuetify = createVuetify({
    icons: {
        iconfont: 'mdiSvg', // 'mdi' || 'mdiSvg' || 'md' || 'fa' || 'fa4' || 'faSvg'
    },
    components,
    directives,
})
/* import the fontawesome core */
import { library } from "@fortawesome/fontawesome-svg-core";

/* import font awesome icon component */
import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: MainPage,
      props: true,
    },
    {
      path: "/forum",
      name: "forum",
      component: ForumMain,
      props: true,
    },
    {
      path: "/locations",
      name: "locations",
      component: LocationsPage,
      props: true,
    },
    {
      path: "/reviews",
      name: "reviews",
      component: ReviewMain,
      props: true,
    },
    {
      path: "/LogIn",
      name: "LogIn",
      component: LogIn,
      props: true,
    },
    {
      path: "/RegisterPage",
      name: "Register",
      component: RegisterPage,
      props: true,
    },
      {
          path: '/forum/topic1',
          name: 'topic1',
          component: TopicPage
      },
  ],
});

createApp(App)
    .component("font-awesome-icon", FontAwesomeIcon)
    .use(vuetify)
    .use(router)
    .mount('#app')
/* import specific icons */
import { faStar } from "@fortawesome/free-solid-svg-icons";

/* add icons to the library */
library.add(faStar);
