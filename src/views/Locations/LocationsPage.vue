<template>
<AddLocationButton/>
    <div class="responsive">
  <div class="gallery">
    <div class="thumbnail">
      <router-link to="/leavey/reviews">
        <img :src="require('./img/Leavey.jpg')"/>
      </router-link>
  </div>
    <div class="desc">Leavey Library</div>
  </div>
</div>


<div class="responsive">
  <div class="gallery">
    <div class="thumbnail">
    <router-link to="/hoose/reviews">
      <img :src="require('./img/Hoose.jpg')"/>
    </router-link>
  </div>
    <div class="desc">Hoose Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
  <div class="thumbnail">
    <router-link to="/doheny/reviews">
      <img :src="require('./img/Doheny.jpg')"/>
    </router-link>
  </div>
    <div class="desc">Doheny Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <router-link to="/cpa/reviews">
      <img :src="require('./img/CPA.jpg')"/>
    </router-link>
    <div class="desc">CPA</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <router-link to="/engineering/reviews">
      <img :src="require('./img/Engineering.jpg')"/>
    </router-link>
    <div class="desc">Engineering Library</div>
  </div>
</div>


<div class="responsive">
  <div class="gallery">
    <router-link to="/annenberg/reviews">
      <img :src="require('./img/Annenberg.jpg')"/>
    </router-link>
    <div class="desc">Annenberg Hall</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <router-link to="/sal/reviews">
      <img :src="require('./img/SAL.jpg')"/>
    </router-link>
    <div class="desc">SAL</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <router-link to="/fertitta/reviews">
      <img :src="require('./img/Fertitta.jpg')"/>
    </router-link>
    <div class="desc">Fertitta Hall</div>
  </div>
</div>

<div class="clearfix"></div>
</template>

<script>
import AddLocationButton from "./AddLocationButton.vue";
// import PageHeaderLogoDropdownVue from "./components/PageHeaderLogoDropdown.vue";
export default {
  props: ["loggedIn"],
  components: {
    AddLocationButton
  },
};

</script>


<style scoped>
.div-button {
  margin-top: 10px;
  width: 100%;
  display: flex;
  justify-content: right;
  padding-right: 20px;
}

div.gallery {
  border: 1px solid #ccc;
  
}
/*must use 900 600 image*/
.thumbnail{
  width: 600 px;
  height: 400 px;
  overflow: hidden;
}

div.gallery:hover {
  border: 1px solid #777;
}

div.gallery img {
  width: 100%;
  height: auto;
  overflow: hidden;
}

div.desc {
  padding: 15px;
  text-align: center;
}

* {
  box-sizing: border-box;
}

.responsive {
  padding: 20px 20px;
  float: left;
  width: 24.99999%;
}

@media only screen and (max-width: 700px) {
  .responsive {
    width: 49.99999%;
    margin: 20px 20px;
  }
}

@media only screen and (max-width: 500px) {
  .responsive {
    width: 100%;
  }
}

.clearfix:after {
  content: "";
  display: table;
  clear: both;
}
</style>