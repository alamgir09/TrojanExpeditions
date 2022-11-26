<template><PageHeader /> <LogIn /></template>

<script>
import PageHeader from "./components/PageHeader.vue";
import LogIn from "./LogIn.vue";

export default {
  name: "App",
  components: {
    PageHeader,
    LogIn,
  },
};
</script>

<style>
html,
body {
  height: 100vh;
  width: 100vw;
  margin: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  height: inherit;
  width: inherit;
}
</style>
