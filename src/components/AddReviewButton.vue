<template>
  <div id="app">
    <button type="button" class="submit" @click="showModal">
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
                style="width: 252px; font-family: inherit"
              ></textarea>
            </div>
            <div class="inputs">
              <span>Quiet Level:</span>
              <div style="display: flex; align-items: center">
                <label>{{ quiet }}</label>
                <input type="range" v-model="quiet" style="width: 200px" />
              </div>
            </div>
            <div class="inputs">
              <span>Cleanliness Level:</span>
              <div style="display: flex; align-items: center">
                <label>{{ clean }}</label>
                <input type="range" v-model="clean" style="width: 200px" />
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
      <h3>Your Location Submission Details:</h3>
      <p>Your Display Name: {{ name }}</p>
      <p>Review Comments: {{ comments }}</p>
      <p>Quietness Level: {{ quiet }}</p>
      <p>Groupwork: {{ groupwork }}</p>
      <p>Cleanliness Level: {{ clean }}</p>
      <p>Overall Rating: {{ rating }}</p>
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
    };
  },
  methods: {
    showModal() {
      this.isModalVisible = true;
      this.formSubmitted = false;
      this.name = "";
      this.comments = "";
      this.quiet = "0";
      this.groupwork = "";
      this.clean = "0";
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
}

.modal {
  background: #ffffff;
  box-shadow: 2px 2px 20px 1px;
  overflow-x: auto;
  display: flex;
  flex-direction: column;
  width: 500px;
  height: 400px;
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
  color: #f6aa1c;
  background-color: #621708;
  border-radius: 4px;
  border: none;
}
</style>
