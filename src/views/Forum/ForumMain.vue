<template>
  <div class="forum-css">
    <div class="outer-frame">
      <div class="forum-container">
        <div class="content-wrapper">
          <div class="forum-wrapper">
            <div id="main-container" class="main-container">
              <div class="l-panel">
                <div class="topic-list">
                  <div class="border-wrapper">
                    <div class="sub-header">
                      <div class="sub-header-left">
                        <div class="sort-wrapper sort-css">
                          <label class="highlight-sort">
                            <input
                              type="checkbox"
                              class="sort sort-css"
                              checked
                            />
                            Hottest
                          </label>
                          <label class="normal-sort">
                            <input
                              type="checkbox"
                              class="sort sort-css"
                              checked
                            />
                            Latest to oldest
                          </label>
                          <label class="normal-sort">
                            <input
                              type="checkbox"
                              class="sort sort-css"
                              checked
                            />
                            Most views
                          </label>
                        </div>
                      </div>
                      <v-btn
                        class="mx-2"
                        fab
                        dark
                        color="blue-grey"
                        @click="newPost"
                      >
                        <v-icon class="add-topic-button" color="white">
                          mdi-plus
                        </v-icon>
                      </v-btn>
                    </div>
                  </div>

                  <div
                    id="post2"
                    class="topic-list-container"
                    data-show="false"
                  >
                    <div class="topic-list-content">
                      <div>
                        <div class="topic-item-wrap">
                          <div class="topic-item">
                            <a href="" class="topic-info">
                              <div class="avatar"></div>
                            </a>
                            <div class="topic-title-wrapper">
                              <div class="item-header">
                                <router-link to="/forum/topic7">
                                  <div class="title-container">
                                    <div class="title">This is so cool</div>
                                  </div>
                                </router-link>
                              </div>
                              <div class="topic-info">
                                <span>
                                  <router-link to=""> marywang </router-link>
                                  <span>
                                    Created at: 12:04pm on 11/26/2022
                                    <p></p>
                                  </span>
                                  <span>
                                    Last reply: 9:05am on 11/27/2022
                                  </span>
                                </span>
                              </div>
                            </div>
                            <div class="wrapper">
                              <div class="icon-wrapper">
                                <div class="top">1</div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div id="post2" class="topic-list-container">
                    <div class="topic-list-content">
                      <div>
                        <div class="topic-item-wrap">
                          <div class="topic-item">
                            <a href="" class="topic-info">
                              <div class="avatar"></div>
                            </a>
                            <div class="topic-title-wrapper">
                              <div class="item-header">
                                <router-link to="/forum/topic7">
                                  <div class="title-container">
                                    <div class="title">
                                      This is an amazing website.
                                    </div>
                                  </div>
                                </router-link>
                              </div>
                              <div class="topic-info">
                                <span>
                                  <router-link to=""> yax11111 </router-link>
                                  <span>
                                    Created at: 12:04pm on 11/26/2022
                                    <p></p>
                                  </span>
                                  <span>
                                    Last reply: 9:05am on 11/27/2022
                                  </span>
                                </span>
                              </div>
                            </div>
                            <div class="wrapper">
                              <div class="icon-wrapper">
                                <div class="top">1</div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-content">
                    <div>
                      <div class="topic-item-wrap">
                        <div class="topic-item">
                          <a href="" class="topic-info">
                            <div class="avatar"></div>
                          </a>
                          <div class="topic-title-wrapper">
                            <div class="item-header">
                              <router-link to="/forum/topic4">
                                <div class="title-container">
                                  <div class="title">
                                    Bathrooms are broken at Leavey... again
                                  </div>
                                </div>
                              </router-link>
                            </div>
                            <div class="topic-info">
                              <span>
                                <router-link to=""> booklover2002 </router-link>
                                <span>
                                  Created at: 3:37pm on 11/27/2022
                                  <p></p>
                                </span>
                                <span> Last reply: 1:55pm on 11/30/2022 </span>
                              </span>
                            </div>
                          </div>
                          <div class="wrapper">
                            <div class="icon-wrapper">
                              <div class="top">-265</div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-content">
                    <div>
                      <div class="topic-item-wrap">
                        <div class="topic-item">
                          <a href="" class="topic-info">
                            <div class="avatar"></div>
                          </a>
                          <div class="topic-title-wrapper">
                            <div class="item-header">
                              <router-link to="/forum/topic5">
                                <div class="title-container">
                                  <div class="title">
                                    To the blonde guy in the red shirt at Doheny
                                    earlier today...
                                  </div>
                                </div>
                              </router-link>
                            </div>
                            <div class="topic-info">
                              <span>
                                <router-link to=""> studygirl10 </router-link>
                                <span>
                                  Created at: 11:18pm on 11/6/2022
                                  <p></p>
                                </span>
                                <span> Last reply: 4:00pm on 11/27/2022 </span>
                              </span>
                            </div>
                          </div>
                          <div class="wrapper">
                            <div class="icon-wrapper">
                              <div class="top">177</div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-content">
                    <div>
                      <div class="topic-item-wrap">
                        <div class="topic-item">
                          <a href="" class="topic-info">
                            <div class="avatar"></div>
                          </a>
                          <div class="topic-title-wrapper">
                            <div class="item-header">
                              <router-link to="/forum/topic1">
                                <div class="title-container">
                                  <div class="title">
                                    Anyone working at SAL today?
                                  </div>
                                </div>
                              </router-link>
                            </div>
                            <div class="topic-info">
                              <span>
                                <router-link to=""> codemaster789 </router-link>
                                <span>
                                  Created at: 10:26am on 12/1/2022
                                  <p></p>
                                </span>
                                <span> Last reply: 12:43pm on 12/1/2022 </span>
                              </span>
                            </div>
                          </div>
                          <div class="wrapper">
                            <div class="icon-wrapper">
                              <div class="top">31</div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-content">
                    <div>
                      <div class="topic-item-wrap">
                        <div class="topic-item">
                          <a href="" class="topic-info">
                            <div class="avatar"></div>
                          </a>
                          <div class="topic-title-wrapper">
                            <div class="item-header">
                              <router-link to="/forum/topic2">
                                <div class="title-container">
                                  <div class="title">
                                    Why does Leavey smell so bad???
                                  </div>
                                </div>
                              </router-link>
                            </div>
                            <div class="topic-info">
                              <span>
                                <router-link to="">
                                  smellycoder35079
                                </router-link>
                                <span>
                                  Created at: 11:03am on 11/29/2022
                                  <p></p>
                                </span>
                                <span> Last reply: 5:49pm on 11/30/2022 </span>
                              </span>
                            </div>
                          </div>
                          <div class="wrapper">
                            <div class="icon-wrapper">
                              <div class="top">78</div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-content">
                    <div>
                      <div class="topic-item-wrap">
                        <div class="topic-item">
                          <a href="" class="topic-info">
                            <div class="avatar"></div>
                          </a>
                          <div class="topic-title-wrapper">
                            <div class="item-header">
                              <router-link to="/forum/topic3">
                                <div class="title-container">
                                  <div class="title">
                                    Has Fertitta ever not been completely
                                    booked?
                                  </div>
                                </div>
                              </router-link>
                            </div>
                            <div class="topic-info">
                              <span>
                                <router-link to="">
                                  themarsha11man
                                </router-link>
                                <span>
                                  Created at: 8:37pm on 11/29/2022
                                  <p></p>
                                </span>
                                <span> Last reply: 2:23pm on 11/30/2022 </span>
                              </span>
                            </div>
                          </div>
                          <div class="wrapper">
                            <div class="icon-wrapper">
                              <div class="top">22</div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>

                  <div class="topic-list-container">
                    <div class="topic-list-content">
                      <div>
                        <div class="topic-item-wrap">
                          <div class="topic-item">
                            <a href="" class="topic-info">
                              <div class="avatar"></div>
                            </a>
                            <div class="topic-title-wrapper">
                              <div class="item-header">
                                <router-link to="/forum/topic6">
                                  <div class="title-container">
                                    <div class="title">
                                      Question about Fertitta study rooms
                                    </div>
                                  </div>
                                </router-link>
                              </div>
                              <div class="topic-info">
                                <span>
                                  <router-link to="">
                                    themarsha11man
                                  </router-link>
                                  <span>
                                    Created at: 3:59pm on 11/25/2022
                                    <p></p>
                                  </span>
                                  <span>
                                    Last reply: 9:39am on 11/26/2022
                                  </span>
                                </span>
                              </div>
                            </div>
                            <div class="wrapper">
                              <div class="icon-wrapper">
                                <div class="top">6</div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div
    id="post"
    class="add-topic-page add-topic-page-css"
    data-appear="false"
    data-fullscreen="false"
    style="height: 50%"
  >
    <div class="bottom-contain-container">
      <div class="topic-editor-base">
        <div class="topic-editor topic-editor-css">
          <div class="editor-header">
            <div class="editor-header-left">
              <span class="wrapper3 title-input title-input-css">
                <input
                  class="input2"
                  placeholder="Enter your topic title ..."
                  value
                />
              </span>
            </div>
            <div class="editor-header-right">
              <v-btn depressed class="close-button" @click="closePost">
                Close
              </v-btn>
              <v-btn
                :loading="loading3"
                :disabled="loading3"
                color="blue-grey"
                class="post-button white--text"
                @click="showPost"
              >
                Post
                <v-icon class="send-icon"> mdi-send </v-icon>
              </v-btn>
            </div>
          </div>
        </div>
        <v-textarea
          clearable
          variant="outlined"
          clear-icon="mdi-close-circle"
          rows="12"
          counter="250"
          :rules="rules"
        >
        </v-textarea>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data: () => ({
    image: require("@/assets/tommytrojan.png"),
    rules: [(v) => v.length <= 250 || "Max 250 characters!"],
    loader: null,
    loading3: false,
    closed: false,
    loggedIn: localStorage.getItem("loggedIn"),
  }),
  watch: {
    loader() {
      const l = this.loader;
      this[l] = !this[l];
      setTimeout(() => (this[l] = false), 3000);
      this.loader = null;
    },
  },
  methods: {
    showPost() {
      if (this.loggedIn == "true") {
        const page = document.querySelector("#post2");
        page.dataset.show = "true";
        this.closePost();
      } else {
        alert("You must be logged in to post.");
      }
    },
    newPost() {
      const page = document.querySelector("#post");
      page.dataset.appear = "true";
    },
    closePost() {
      const page = document.querySelector("#post");
      page.dataset.appear = "false";
    },
  },
};
</script>

<style scoped>
.topic-list-container[data-show="false"] {
  display: none;
}
.send-icon {
  margin-left: 5px;
}
.post-button {
  margin-right: -1px;
}
.close-button {
  margin-right: 20px;
}
.editor-header-right {
  -webkit-box-flex: 0;
  -ms-flex: 0 0 auto;
  flex: 0 0 auto;
  margin-left: 10px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}
.input2:hover {
  color: #263238;
  border-color: #263238;
}
.title-input-css .input2 {
  padding: 8.85px 13px;
  font-size: 14px;
}
.input2:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgb(155 181 206 / 40%);
  box-shadow: 0 0 0 2px rgb(155 181 206 / 40%);
}
.input2 {
  width: 100%;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  color: #546e7a;
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  font-weight: 300;
  -o-text-overflow: ellipsis;
  text-overflow: ellipsis;
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.wrapper3 {
  display: inline-block;
  position: relative;
}
.title-input {
  -webkit-box-flex: 1;
  -ms-flex: 1;
  flex: 1;
}

.editor-header-left {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 0;
  -ms-flex: 0 1 500px;
  flex: 0 1 500px;
}
.editor-header {
  margin: 20px 0 15px 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}
.topic-editor-css {
  margin: auto 10px;
}
.topic-editor-base .topic-editor-css {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  -webkit-box-flex: 1;
  -ms-flex: 1;
  flex: 1;
  margin-bottom: 10px;
  min-height: 0;
}
.topic-editor-base {
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
}
.add-topic-page-css[data-appear="false"] {
  min-height: 0 !important;
  height: 0 !important;
  opacity: 0;
}
.add-topic-page-css:hover {
  -webkit-box-shadow: 0 0 50px 0 rgb(0 0 0 / 30%);
  box-shadow: 0 0 50px 0 rgb(0 0 0 / 30%);
}
.add-topic-page-css[data-appear="true"] {
  opacity: 1;
}
.add-topic-page-css {
  -webkit-transition: 0.4s all !important;
  -o-transition: 0.4s all !important;
  transition: 0.4s all !important;
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  z-index: 147;
  border-top: 1px solid #dddddd;
  background: white;
  min-height: 200px;
  height: auto;
  -webkit-box-shadow: 0 0 50px 0 rgb(0 0 0 / 15%);
  box-shadow: 0 0 50px 0 rgb(0 0 0 / 15%);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.normal-sort {
  height: 24px;
  font-size: 12px;
  color: rgb(55, 71, 79);
  opacity: 0.4;
  font-weight: 400;
  position: relative;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  cursor: pointer;
  transition: all 0.18s ease-in-out 0s;
  outline: 0px;
  padding: 0px 12px;
}
.normal-sort:not(:first-child)::before {
  content: "";
  height: 40%;
  width: 1px;
  background: rgb(238, 238, 238);
  position: absolute;
  top: 50%;
  left: 0px;
  transform: translateY(-50%);
  display: block;
  z-index: 1;
  opacity: 1;
}
.sort {
  display: none;
}
input[type="checkbox"] {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  padding: 0;
}
input:not([type="range"]),
label,
select,
summary,
textarea {
  -ms-touch-action: manipulation;
  touch-action: manipulation;
}
.highlight-sort:first-child {
  padding-left: 0px;
}
.highlight-sort {
  height: 24px;
  font-size: 12px;
  color: rgb(55, 71, 79);
  opacity: 1;
  font-weight: 500;
  position: relative;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  cursor: pointer;
  transition: all 0.18s ease-in-out 0s;
  outline: 0px;
  padding: 0px 12px;
}

.default-sort:first-child {
  padding-left: 0px;
}
.default-sort {
  height: 24px;
  font-size: 12px;
  color: rgb(55, 71, 79);
  opacity: 1;
  font-weight: 500;
  position: relative;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  cursor: pointer;
  transition: all 0.18s ease-in-out 0s;
  outline: 0px;
  padding: 0px 12px;
}

.sub-header-left {
  -webkit-box-flex: 1;
  -ms-flex: 1 1 auto;
  flex: 1 1 auto;
}

.sub-header {
  background: #fafafa;
  padding: 0 20px;
  height: 40px;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.top {
  color: #455a64;
  width: 70px;
}

.forum-css {
  position: relative;
  z-index: 0;
  display: flex;
  height: 100%;
  width: 100%;
  min-width: 992px;
  flex-direction: column;
  overflow: hidden;
  -webkit-font-smoothing: antialiased;
}
.outer-frame {
  position: relative;
  display: flex;
  flex-direction: column;
  flex: 1 1 0%;
  z-index: 0;
  min-height: 0px;
}
.forum-container > div {
  max-width: 1240px;
  margin: 0px auto;
}
.forum-container {
  display: flex;
  flex-direction: column;
  flex: 1 1 auto;
  z-index: 0;
  overflow-y: auto;
  background-color: rgb(245, 245, 245);
}
.content-wrapper {
  width: 100%;
}
.forum-wrapper {
  margin: 10px 0px 40px;
}

.main-container {
  display: flex;
}
.title {
  color: #212121;
  font-size: 16px;
  cursor: pointer;
  overflow: hidden;
  -o-text-overflow: ellipsis;
  text-overflow: ellipsis;
  white-space: pre;
}
.l-panel {
  flex: 1 1 auto;
  min-width: 0px;
}
.border-wrapper {
  border-bottom: 1px solid #eeeeee;
}
.topic-list {
  background: white;
  box-shadow: rgb(0 0 0 / 10%) 0px 1px 2px 0px;
  margin-bottom: 40px;
  border-radius: 3px;
}
.topic-list-container {
  display: flex;
  flex: 1 0 auto;
  flex-direction: column;
}
.topic-list-content {
  position: relative;
}
.topic-item-wrap {
  border-bottom: 1px solid #eeeeee;
}
.topic-title-wrapper {
  -webkit-box-flex: 1;
  -ms-flex: 1;
  flex: 1;
  min-width: 0;
}
.topic-info {
  color: #9e9e9e;
  font-size: 12px;
}

.topic-item-wrap .topic-item {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 80px;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  -webkit-box-pack: start;
  -ms-flex-pack: start;
  justify-content: flex-start;
  -webkit-transition: background-color 500ms linear;
  -o-transition: background-color 500ms linear;
  transition: background-color 500ms linear;
}
.title-container {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  margin-bottom: 4px;
}
.item-header {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  margin-bottom: 4px;
}
.avatar {
  width: 40px;
  height: 40px;
  border-radius: 50%;
  margin-left: 15px;
  margin-right: 20px;
  background-image: url("tommytrojan.png");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
}
.profilePhoto {
  float: left;
  margin-top: 15px;
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
}
.wrapper {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.icon-wrapper {
  margin-left: 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
  -ms-flex-align: center;
  align-items: center;
}

.tag-filter {
  background-color: white;
  box-shadow: rgb(0 0 0 / 10%) 0px 1px 2px 0px;
  padding-bottom: 15px;
  /*margin-top: 19px;*/
  width: 230px;
  border-radius: 3px;
}
.tag-header {
  padding: 0px 15px;
  border-bottom: 1px solid rgb(238, 238, 238);
  display: flex;
  -webkit-box-align: center;
  align-items: center;
  height: 50px;
}
.tag-title {
  color: rgb(97, 97, 97);
  font-size: 14px;
  font-weight: 600;
  margin-bottom: 0px;
}
.tag-panel {
  padding: 0px 15px;
}
.search-css {
  width: 100%;
  margin-top: 10px;
}
.search-wrapper1 {
  display: inline-block;
  position: relative;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.search-wrapper1 .search-input {
  width: 100%;
}
.search-wrapper2 {
  display: inline-block;
  position: relative;
}
.search-wrapper1 .search-box1 input {
  padding-right: 32px;
}
.search-box2 .input {
  padding: 6.3px 10px;
  font-size: 12;
}
.input {
  width: 100%;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  color: #546e7a;
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  font-weight: 300;
  -o-text-overflow: ellipsis;
  text-overflow: ellipsis;
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.input:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgb(251 192 46 / 40%);
  box-shadow: 0 0 0 2px rgb(251 192 46 / 40%);
}
button,
input {
  overflow: visible;
}
input,
button,
select,
optgroup,
textarea {
  margin: 0;
  color: inherit;
  font-size: inherit;
  font-family: inherit;
  line-height: inherit;
}
a {
  color: #1890ff;
  text-decoration: none;
  background-color: transparent;
  outline: none;
  cursor: pointer;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
}
input[type="checkbox" i] {
  background-color: initial;
  cursor: default;
  appearance: auto;
  box-sizing: border-box;
  margin: 3px 3px 3px 4px;
  padding: initial;
  border: initial;
}
input {
  writing-mode: horizontal-tb !important;
  text-rendering: auto;
  color: fieldtext;
  letter-spacing: normal;
  word-spacing: normal;
  line-height: normal;
  text-transform: none;
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  text-align: start;
  appearance: auto;
  -webkit-rtl-ordering: logical;
  cursor: text;
  background-color: field;
  margin: 0em;
  padding: 1px 2px;
  border-width: 2px;
  border-style: inset;
  border-color: -internal-light-dark(rgb(118, 118, 118), rgb(133, 133, 133));
  border-image: initial;
}
a {
  background-color: transparent;
}
*,
*::before,
*::after {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
*,
*::before,
*::after {
  -webkit-box-sizing: inherit;
  box-sizing: inherit;
}
div {
  display: block;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  margin-top: 0;
  margin-bottom: 0.5em;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
}
h1 {
  font-size: 2em;
  margin: 0.67em 0;
}
h1 {
  display: block;
  font-size: 2em;
  margin-block-start: 0.67em;
  margin-block-end: 0.67em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
  font-weight: bold;
}
p,
input,
textarea,
select,
button {
  font-size: 14px;
  font-weight: 400;
}
body {
  margin: 0;
  color: rgba(0, 0, 0, 0.65);
  font-size: 14px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", "PingFang SC",
    "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial,
    sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
  font-variant: tabular-nums;
  line-height: 1.5;
}
</style>
