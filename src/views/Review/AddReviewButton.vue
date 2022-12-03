<template>
  <div id="app">
    <button type="button" class="submit add-button" @click="showModal">
      Add Review +
    </button>

    <div class="modal-backdrop" v-if="isModalVisible">
      <div class="modal">
        <header class="modal-header">
          <slot name="header"> Add A Location </slot>
          <button type="button" class="btn-close" @click="closeModal">x</button>
        </header>

        <section class="modal-body center">
          <form
            @submit.prevent="submitForm"
            v-if="!formSubmitted"
            class="form1"
          >
            <div class="inputs">
              <span>Your Display Name:</span>
              <input
                v-model="name"
                type="text"
                placeholder="Enter display name"
                style="width: 250px"
              />
            </div>
            <div class="inputs">
              <span>Review Comments:</span>
              <textarea
                v-model="comments"
                placeholder="Your Review"
                style="
                  width: 252px;
                  font-family: inherit;
                  border: 1px solid black;
                  border-radius: 5px;
                  padding: 5px;
                "
              ></textarea>
            </div>
            <div class="inputs">
              <span>Quiet Level:</span>
              <div style="display: flex; flex-direction: column">
                <label>{{ quiet }}</label>
                <input
                  type="range"
                  v-model="quiet"
                  style="width: 200px"
                  min="0"
                  max="5"
                  step="1"
                />
                <div class="center" style="width: 200px; height: 25px">
                  <font-awesome-icon
                    v-if="quiet >= '1'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="quiet >= '2'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="quiet >= '3'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="quiet >= '4'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="quiet >= '5'"
                    icon="fa-solid fa-star"
                  />
                </div>
              </div>
            </div>
            <div class="inputs">
              <span>Cleanliness Level:</span>
              <div style="display: flex; flex-direction: column">
                <label>{{ clean }}</label>
                <input
                  type="range"
                  v-model="clean"
                  style="width: 200px"
                  min="0"
                  max="5"
                  step="1"
                />
                <div class="center" style="width: 200px; height: 25px">
                  <font-awesome-icon
                    v-if="clean >= '1'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="clean >= '2'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="clean >= '3'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="clean >= '4'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="clean >= '5'"
                    icon="fa-solid fa-star"
                  />
                </div>
              </div>
            </div>
            <div class="inputs">
              <span>Good For Group Work:</span>

              <div>
                <input type="radio" v-model="groupwork" value="Yes" />
                <label>Yes</label>
              </div>
              <div>
                <input type="radio" v-model="groupwork" value="No" />
                <label>No</label>
              </div>
            </div>
            <div class="inputs">
              <span>Overall Rating:</span>
              <div style="display: flex; flex-direction: column">
                <label>{{ rating }}</label>
                <input
                  type="range"
                  v-model="rating"
                  style="width: 200px"
                  min="0"
                  max="5"
                  step="1"
                />
                <div class="center" style="width: 200px; height: 25px">
                  <font-awesome-icon
                    v-if="rating >= '1'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="rating >= '2'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="rating >= '3'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="rating >= '4'"
                    icon="fa-solid fa-star"
                  />
                  <font-awesome-icon
                    v-if="rating >= '5'"
                    icon="fa-solid fa-star"
                  />
                </div>
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
    <div v-if="formSubmitted">
      <div class="review">
        <div class="profilePhoto">
          <h4> {{ name }}</h4>
        </div>
        <div class="reviewMessage">
          {{ comments }}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;  Quietness &ensp;
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        &ensp; Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        &ensp; &ensp; &ensp; &ensp; &ensp; Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
          &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
          <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
          &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
          <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
          &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
          <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  components: {},
  data() {
    return {
      isModalVisible: false,
      formSubmitted: false,
      name: "",
      comments: "",
      quiet: "0",
      groupwork: "",
      clean: "0",
      rating: "0",
      openModal: true,
      loggedIn: localStorage.loggedIn,
    };
  },
  methods: {
    showModal(e) {
      this.loggedIn = localStorage.loggedIn;
      if (this.loggedIn == "false") {
        alert(
          "You must be a registered user to add a new review. Please login or register."
        );
        e.preventDefault();
      } else {
        this.isModalVisible = true;
        this.formSubmitted = false;
        this.name = "";
        this.comments = "";
        this.quiet = "0";
        this.groupwork = "";
        this.clean = "0";
        this.rating = "0";
      }
    },
    closeModal() {
      this.isModalVisible = false;
    },
    submitForm() {
      this.isModalVisible = false;
      this.formSubmitted = true;
      this.$emit("formSubmitted");
    },
    stopSubmission(e) {
      e.preventDefault();
    },
  },
};
</script>

<style scoped>
.checked {
  color: orange;
}
.stars {
  text-align: left;
}
.reviewMessage {
  padding-top: 10px;
  padding-bottom: 15px;
  margin-left: 70px;
  font-weight: normal;
  position:relative;left:80px;
  background-color: white;
  width: 80%;
  height:35%;
  border-radius: 3%;
  border: solid 2px black;
}
.review {
  font-size:20px;
  color:black;
  font-weight: bold;
  height: 170px;
  box-sizing: border-box;
  margin:25px;
  margin-bottom:0px;
  margin-left: 75px;
  margin-right: 75px;
  background-color: lightgray;
  padding-top: 30px;
}
.profilePhoto
{
  float: left;
  margin-left: 10px;
  width: 110px;
  height: 110px;
  border-radius: 100%;
  background-image: url("tommytrojan.png");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
  border: solid 2px;
  border-color: black;
  text-align: center;
  position:relative;bottom:15px;
  position:relative;left:10px;
}
.profilePhoto h4{
  position:relative;top:110px;
}
.stars {
  text-align: left;
}
input {
  border: 1px solid black;
  border-radius: 5px;
  width: 100%;
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
  height: 10%;
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
  height: 497px;
}
.modal-footer {
  display: flex;
  align-items: center;
  justify-content: center;
  border-top: 1px solid #eeeeee;
  background-color: #f6aa1c;
  padding: 5px;
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
  color: #f6aa1c;
  background-color: #621708;
  border-radius: 4px;
  border: none;
}
.add-button {
  margin-left: 75px;
  color: white;
  background-color: #8e7f7f;
}
</style>