<template>
  <div class="nav-bar nullify center">
    <div class="link-box">
      <h3 class="links"><router-link to="/" class="pages">TrojanExpeditions</router-link></h3>
      <h3 class="links">
        <router-link to="/locations" class="pages">Locations</router-link>
      </h3>
    </div>
    <div class="link-box">
      <h3 class="links"><router-link to="/forum" class="pages">Forum</router-link></h3>
      <PageHeaderLogoDropdownVue class="mr-8" />
    </div>
  </div>
</template>

<script>
import PageHeaderLogoDropdownVue from "./PageHeaderLogoDropdown.vue";
export default {
  components: {
    PageHeaderLogoDropdownVue,
  },
  data() {
    return {
      image: require("@/assets/tommytrojan.png"),
    };
  },
};
</script>

<style>
.center {
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.nav-bar {
  height: 50px;
  width: 100vw;
  background-color: #8e7f7f;
  color: white;
}
.link-box {
  height: 100%;
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.links {
  margin-top: 0%;
  margin-bottom: 0%;
  margin-left: 5%;
  margin-right: 5%;
}

.image {
  width: 30px;
  height: 30px;
  border-radius: 50%;
}
.pages {
  text-decoration: none;
  color: white;
}
</style>
