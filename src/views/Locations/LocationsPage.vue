<template>
    <div class="responsive">
  <div class="gallery">
    <div class="thumbnail">
    <a target="_blank" href="../Review/ReviewMain.vue">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
  </div>
    <div class="desc">Leavey Library</div>
  </div>
</div>


<div class="responsive">
  <div class="gallery">
    <div class="thumbnail">
    <a target="_blank" href="img/Hoose.jpg">
      <img src="img/Hoose.jpg" alt="Hoose">
    </a>
  </div>
    <div class="desc">Hoose Librar</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
  <div class="thumbnail">
    <a target="_blank" href="img/Doheny.jpg">
      <img src="img/Doheny.jpg" alt="Doheny">
    </a>
  </div>
    <div class="desc">Doheny Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="img/Leavey.jpg">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
    <div class="desc">Leavey Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="img/Leavey.jpg">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
    <div class="desc">Leavey Library</div>
  </div>
</div>


<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="img/Leavey.jpg">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
    <div class="desc">Leavey Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="img/Leavey.jpg">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
    <div class="desc">Leavey Library</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <a target="_blank" href="img/Leavey.jpg">
      <img src="img/Leavey.jpg" alt="Leavey">
    </a>
    <div class="desc">Leavey Library</div>
  </div>
</div>

<div class="clearfix"></div>
</template>


<style scoped>
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