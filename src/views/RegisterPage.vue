<template>
  <div class="background">
    <h1 class="title">Register</h1>
    <div class="outer-form">
      <form action="submit" class="form">
        <div class="inputs">
          <h3>USC Email:</h3>
          <input type="email" style="width: 150px" required v-model="email" />
        </div>
        <div class="inputs">
          <h3>Password:</h3>
          <input
            type="password"
            style="width: 150px"
            required
            v-model="password"
          />
        </div>
        <div class="inputs">
          <h3>Major:</h3>
          <input type="text" style="width: 150px" required v-model="major" />
        </div>
        <div class="inputs">
          <button class="login-btn" @submit="checkInputs">Register</button>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      email: "",
      password: "",
      major: "",
    };
  },
  methods: {
    checkInputs(e) {
      if (this.email == "" && this.password == "" && this.major == "") {
        alert("You must fill out ALL fields.");
        e.preventDefault();
      } else if (!this.email.includes("@usc.edu")) {
        alert("Please use your USC email");
        e.preventDefault();
      }
    },
  },
};
</script>
<style scoped>
input {
  border: 1px solid black;
  border-radius: 5px;
  padding-left: 5px;
  padding-right: 5px;
}

.title {
  width: 40%;
  text-align: center;
  position: absolute;
  top: 10%;
  margin-left: 30%;
}
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
.background {
  height: 100vh;
  width: 100vw;
  background-color: white;
  position: relative;
}
.outer-form {
  width: 40%;
  height: 30%;
  border: 3px solid black;
  border-radius: 10px;
  position: absolute;
  top: 20%;
  left: 30%;
}
.form {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  width: 100%;
  height: 100%;
}
.inputs {
  width: 50%;
  height: 50px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.login-btn {
  height: 30px;
  width: 100%;
  border-radius: 5px;
  border: none;
  background-color: #8e7f7f;
  color: white;
}
</style>
