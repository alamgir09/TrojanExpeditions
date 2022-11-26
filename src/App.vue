<template><PageHeader /> <AddReviewButton /></template>

<script>
import PageHeader from "./components/PageHeader.vue";
// import AddLocationButton from "./components/AddLocationButton.vue";
import AddReviewButton from "./components/AddReviewButton.vue";

export default {
  name: "App",
  components: {
    PageHeader,
    // AddLocationButton,
    AddReviewButton,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
