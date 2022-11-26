<template>
  <div class="background">
    <h1 class="title">Login</h1>
    <div class="outer-form">
      <form action="submit" class="form">
        <div class="inputs">
          <h3>Email:</h3>
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
          <button class="login-btn" @click="checkInputs">Login</button>
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
    };
  },
  methods: {
    checkInputs(e) {
      if (!this.email.includes("@usc.edu")) {
        alert("Please use your USC email");
        e.preventDefault();
      }
    },
  },
};
</script>
<style>
.title {
  width: 40%;
  text-align: center;
  position: absolute;
  top: 10%;
  left: 30%;
}
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
.background {
  height: 100%;
  width: 100%;
  background-color: #f6aa1c;
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
  justify-content: space-around;
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
  background-color: #621708;
  color: #f6aa1c;
}
</style>
