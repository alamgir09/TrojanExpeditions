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
import ForumMain from "@/views/Forum/ForumMain.vue";
import LogIn from "@/views/LogIn.vue";
import RegisterPage from "@/views/RegisterPage.vue";

const vuetify = createVuetify({
  components,
  directives,
});
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
  ],
});

createApp(App)
  .component("font-awesome-icon", FontAwesomeIcon)
  .use(vuetify)
  .use(router)
  .mount("#app");
/* import specific icons */
import { faStar } from "@fortawesome/free-solid-svg-icons";

/* add icons to the library */
library.add(faStar);
