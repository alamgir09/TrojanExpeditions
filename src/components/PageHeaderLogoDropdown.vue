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

      <v-list>
        <v-list-item v-for="(item, index) in items" :key="index"
          ><v-list-item-title
            ><router-link :to="item.link">{{
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
    };
  },
};
</script>
