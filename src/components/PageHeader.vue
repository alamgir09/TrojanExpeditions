<template>
  <div class="nav-bar nullify center">
    <div class="link-box">
      <h5 class="links">ProjectName</h5>
      <h5 class="links">Locations</h5>
    </div>
    <div class="link-box">
      <h5 class="links">Forum</h5>
      <img
        src="../assets/tommytrojan.png"
        alt="tommy trojan"
        class="image links"
      />
    </div>
  </div>
</template>

<script>
export default {
  data() {},
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
  background-color: #f6aa1c;
  color: #621708;
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
</style>
