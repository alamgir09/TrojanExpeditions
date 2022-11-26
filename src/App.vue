<template><PageHeader /></template>

<script>
import PageHeader from "./components/PageHeader.vue";

export default {
  name: "App",
  components: {
    PageHeader,
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
