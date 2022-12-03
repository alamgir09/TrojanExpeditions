<template>
  <div>
    <button type="button" class="submit add-button" @click="showModal">
      Add Location +
    </button>
    {{ review }}

    <div class="modal-backdrop" v-if="isModalVisible">
      <div class="modal">
        <header class="modal-header">
          <slot name="header"> Add A Location </slot>
          <button type="button" class="btn-close" @click="closeModal">x</button>
        </header>

        <section class="modal-body center">
          <form
            @submit.prevent="submitForm"
            v-if="isModalVisible"
            class="form1"
          >
            <div class="inputs">
              <span>Location Name:</span>
              <input
                v-model="name"
                type="text"
                placeholder="Enter location name"
                style="width: 250px"
              />
            </div>
            <div class="inputs">
              <span>Location Directions/Room #:</span>
              <input
                v-model="directions"
                type="text"
                placeholder="Describe how to get to location/room #"
                style="width: 250px"
              />
            </div>

            <div class="inputs">
              <span>Location Description/Notes:</span>
              <input
                v-model="description"
                type="description"
                placeholder="Enter description"
                style="width: 250px"
              />
            </div>
            <div class="inputs">
              <span>Reservation Required:</span>

              <div class="radios">
                <input type="radio" v-model="reservation" value="Yes" />
                <label>Yes</label>
              </div>
              <div class="radios">
                <input type="radio" v-model="reservation" value="No" />
                <label>No</label>
              </div>
            </div>
            <div class="inputs">
              <span>Good For Group Work:</span>

              <div class="radios">
                <input type="radio" v-model="groupwork" value="Yes" />
                <label>Yes</label>
              </div>
              <div class="radios">
                <input type="radio" v-model="groupwork" value="No" />
                <label>No</label>
              </div>
            </div>
          </form>
        </section>

        <footer class="modal-footer">
          <button
            class="submit"
            type="submit"
            value="Submit"
            @click="submitForm"
          >
            Submit
          </button>
        </footer>
      </div>
    </div>
    <div v-if="reviewAdded">
      <div class="responsive">
        <div class="gallery">
          <div class="thumbnail">
            <router-link to="/hoose/reviews">
              <img :src="image" style="height: object-fit" />
            </router-link>
          </div>
          <div class="desc">Tutor Hall Cafe</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
  components: {},
  data() {
    return {
      isModalVisible: false,
      formSubmitted: false,
      name: "",
      directions: "",
      description: "",
      reservation: "",
      groupwork: "",
      openModal: true,
      loggedIn: localStorage.getItem("loggedIn"),
      image: require("@/assets/tommytrojan.png"),
      reviewAdded: localStorage.getItem("reviewAdded"),
    };
  },
  methods: {
    showModal(e) {
      this.loggedIn = localStorage.getItem("loggedIn");
      if (this.loggedIn == "true") {
        this.isModalVisible = true;
        this.formSubmitted = false;
        this.name = "";
        this.directions = "";
        this.description = "";
        this.reservation = "";
        this.groupwork = "";
        localStorage.setItem("reviewAdded", "true");
        e.preventDefault();
      } else {
        alert(
          "You must be a registered user to add a new location. Please login or register."
        );
      }
    },
    closeModal() {
      this.isModalVisible = false;
    },
    submitForm() {
      this.reviewAdded = localStorage.getItem("reviewAdded");
      console.log(this.reviewAdded);
      this.isModalVisible = false;
      this.formSubmitted = true;
      this.$emit("formSubmitted");
    },
  },
};
</script>

<style scoped>
div.gallery {
  border: 1px solid #ccc;
}
/*must use 900 600 image*/
.thumbnail {
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

.responsive {
  padding: 20px 20px;
  float: left;
  width: 24.99999%;
}
.radios {
  display: flex;
  justify-content: center;
  align-items: center;
}
input {
  border: 1px solid black;
  border-radius: 5px;
  padding-left: 5px;
}
.form1 {
  width: 100%;
}
.nullify {
  margin: 0px;
  padding: 0px;
}
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
.inputs {
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-right: 0px;
  margin-bottom: 2%;
}
.modal-backdrop {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: rgba(0, 0, 0, 0.3);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 10;
}

.modal {
  background: #ffffff;
  box-shadow: 2px 2px 20px 1px;
  overflow-x: auto;
  display: flex;
  flex-direction: column;
  width: 500px;
  height: 300px;
}

.modal-footer {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
  border-top: 1px solid #eeeeee;
  background-color: #f6aa1c;
}

.modal-header {
  padding: 15px;
  display: flex;
  position: relative;
  border-bottom: 1px solid #eeeeee;
  color: #621708;
  justify-content: space-between;
  background-color: #f6aa1c;
}

.modal-body {
  position: relative;
  padding: 20px 10px;
}

.btn-close {
  position: absolute;
  top: 0;
  right: 0;
  border: none;
  font-size: 20px;
  padding: 10px;
  cursor: pointer;
  font-weight: bold;
  color: #621708;
  background: transparent;
}

.submit {
  width: 125px;
  height: 25px;
  color: white;
  background-color: #8e7f7f;
  border-radius: 4px;
  border: none;
}

.add-button {
  margin-top: 20px;
  margin-left: 20px;
}
</style>
