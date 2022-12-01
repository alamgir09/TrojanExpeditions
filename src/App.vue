<template>
  <body>
    <!-- <div id="app"> -->
      <!-- <nav>
        <div class="menu-item">
          <router-link to="/">Home</router-link>
        </div>
        <div class="menu-item">
          <router-link to="/locations">Locations</router-link>
        </div>
        <div class="menu-item">
          <router-link to="/login">Log In</router-link>
        </div>
        <div class="menu-item">
          <router-link to="/forum">Forum</router-link>
        </div>
        <PageHeaderLogoDropdownVue style="position: absolute; right: 20px" />
      </nav>
    </div> -->
    <PageHeader/>
  </body>
  <router-view />
</template>

<script>
import PageHeader from "./components/PageHeader.vue";
// import PageHeaderLogoDropdownVue from "./components/PageHeaderLogoDropdown.vue";
export default {
  props: ["loggedIn"],
  components: {
    // PageHeaderLogoDropdownVue,
    PageHeader
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap");
nav {
  display: flex;
  align-items: center;
  justify-content: center;
  background-color: #8e7f7f;
}

nav .menu-item {
  font-family: "Roboto Slab", sans-serif;
  color: #fff;
  padding: 10px 20px;
  text-align: center;
  border-bottom: 3px solid transparent;
  display: flex;
  transition: 0.4s;
}

nav .menu-item a {
  color: inherit;
  text-decoration: none;
}

nav .menu-item a:hover {
  color: #d9d9d9;
}
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
#app {
  height: 100%;
  width: 100%;
  overflow-y: auto;
  position: relative;
}
body {
  margin: 0;
  color: rgba(0, 0, 0, 0.65);
  font-size: 14px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", "PingFang SC",
    "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial,
    sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
  font-variant: tabular-nums;
  line-height: 1.5;
  background-color: #fff;
  -webkit-font-feature-settings: "tnum";
  font-feature-settings: "tnum";
}
</style>
