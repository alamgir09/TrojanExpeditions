<template>
  <div class="text-center">
    <v-menu open-on-hover>
      <template v-slot:activator="{ props }">
        <img
          :src="image"
          alt="tommy trojan"
          v-bind="props"
          class="links image"
        />
      </template>

      <v-list v-if="loggedIn == 'true'" style="padding: 0px">
        <v-list-item
          ><router-link to="/" class="dropdown-items">
            <v-list-item-title @click="logout"
              >Log Out</v-list-item-title
            ></router-link
          >
        </v-list-item>
      </v-list>
      <v-list v-else>
        <v-list-item v-for="(item, index) in items" :key="index"
          ><v-list-item-title
            ><router-link :to="item.link" class="dropdown-items">{{
              item.title
            }}</router-link></v-list-item-title
          >
        </v-list-item>
      </v-list>
    </v-menu>
  </div>
</template>
<script>
export default {
  data() {
    return {
      image: require("@/assets/tommytrojan.png"),
      items: [
        { title: "Login", link: "LogIn" },
        { title: "Register", link: "RegisterPage" },
      ],
      loggedIn: localStorage.loggedIn,
    };
  },
  methods: {
    logout() {
      localStorage.loggedIn = false;
      this.loggedIn = localStorage.loggedIn;
      console.log(this.loggedIn);
    },
  },
};
</script>
<style>
.links {
  margin-top: 10%;
  margin-bottom: 0%;
  margin-left: 5%;
  margin-right: 5%;
}

.image {
  width: 30px;
  height: 30px;
  border-radius: 50%;
}

.dropdown-items {
  text-decoration: none;
  color: black;
}
</style>
