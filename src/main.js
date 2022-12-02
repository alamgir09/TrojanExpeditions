import { createApp } from "vue";
import "vuetify/styles";
import { createVuetify } from "vuetify";
import * as components from "vuetify/components";
import * as directives from "vuetify/directives";
import App from "./App.vue";
import { createRouter, createWebHistory } from "vue-router";
import MainPage from "@/views/MainPage.vue";
import LocationsPage from "@/views/Locations/LocationsPage.vue";
import AnnenbergReview from "@/views/Review/AnnenbergReview.vue";
import CPAReview from "@/views/Review/CPAReview.vue";
import DohenyReview from "@/views/Review/DohenyReview.vue";
import EngineeringReview from "@/views/Review/EngineeringReview.vue";
import FertittaReview from "@/views/Review/FertittaReview.vue";
import HooseReview from "@/views/Review/HooseReview.vue";
import LeaveyReview from "@/views/Review/LeaveyReview.vue";
import SALReview from "@/views/Review/SALReview.vue";
import ReviewMain from "@/views/Review/ReviewMain.vue";
import '@mdi/font/css/materialdesignicons.css'
import ForumMain from "@/views/Forum/ForumMain.vue";
import LogIn from "@/views/LogIn.vue";
import RegisterPage from "@/views/RegisterPage.vue";

// import AddLocationButton from "@/views/Locations/AddLocationButton";
// import AddReviewButton from "@/views/Review/AddReviewButton";
import TopicPage1 from "@/views/Forum/TopicPage1";
import TopicPage2 from "@/views/Forum/TopicPage2";
import TopicPage3 from "@/views/Forum/TopicPage3";
import TopicPage4 from "@/views/Forum/TopicPage4";
import TopicPage5 from "@/views/Forum/TopicPage5";
import TopicPage6 from "@/views/Forum/TopicPage6";
import TopicPage7 from "@/views/Forum/TopicPage7";
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

      path: "/annenberg/reviews",

      name: "annenberg",

      component: AnnenbergReview,

      props: true,

    },

    {

      path: "/cpa/reviews",

      name: "cpa",

      component: CPAReview,

      props: true,

    },

    {

      path: "/doheny/reviews",

      name: "doheny",

      component: DohenyReview,

      props: true,

    },

    {

      path: "/engineering/reviews",

      name: "engineering",

      component: EngineeringReview,

      props: true,

    },

    {

      path: "/fertitta/reviews",

      name: "fertitta",

      component: FertittaReview,

      props: true,

    },

    {

      path: "/hoose/reviews",

      name: "hoose",

      component: HooseReview,

      props: true,

    },

    {

      path: "/leavey/reviews",

      name: "leavey",

      component: LeaveyReview,

      props: true,

    },

    {

      path: "/sal/reviews",

      name: "sal",

      component: SALReview,

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
      component: TopicPage1
      },
      {
      path: '/forum/topic2',
      name: 'topic2',
      component: TopicPage2
      },
      {
      path: '/forum/topic3',
      name: 'topic3',
      component: TopicPage3
      },
      {
      path: '/forum/topic4',
      name: 'topic4',
      component: TopicPage4
      },
      {
      path: '/forum/topic5',
      name: 'topic5',
      component: TopicPage5
      },
      {
      path: '/forum/topic6',
      name: 'topic6',
      component: TopicPage6
      },
      {
      path: '/forum/topic7',
      name: 'topic7',
      component: TopicPage7
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
