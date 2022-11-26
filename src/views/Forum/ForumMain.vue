<template>
    <div class="forum-css">
    <div class="outer-frame">
        <div class="forum-container">
            <div class = "content-wrapper">
                <div class="forum-wrapper">
                    <div id="main-container" class="main-container">
                        <div class="l-panel">
                            <div class="topic-list">
                                <div class="border-wrapper">
                                    <div class="sub-header">
                                        <div class="sub-header-left">

                                        </div>
                                        <div class="search-wrapper2 search-input">

                                        </div>
                                    </div>
                                </div>
                                <div class="topic-list-container">
                                    <div class="topic-list-content">
                                        <div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">
                                                    <a href="" class="topic-info">
                                                        <img class="avatar"  src="">
                                                    </a>
                                                    <div class="topic-title-wrapper">
                                                        <div class="item-header">
                                                            <router-link to="">
                                                                <div class="title-container">
                                                                    <div class="title">
                                                                        Topic 1
                                                                    </div>
                                                                </div>
                                                            </router-link>
                                                        </div>
                                                        <div class="topic-info">
                                                            <span>
                                                                <span>
                                                                    created at:
                                                                </span>
                                                                <span>
                                                                    Last reply:
                                                                </span>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="wrapper">
                                                        <div class="icon-wrapper">
                                                            <svg>
                                                            </svg>
                                                            <div class="top">
                                                                99
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                            <div class="topic-item-wrap">
                                                <div class="topic-item">

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="r-panel">
                            <div class="tag-filter">
                                <div class="tag-header">
                                    <h1 class="tag-title">Tags</h1>
                                </div>
                                <div class="tag-panel">
                                    <span class="search-css search-box1 search-wrapper1 ">
                                        <span class="search-input search-box2 search-wrapper2">
                                            <input class="input" placeholder="Search for a tag">
                                        </span>
                                        <span class="search-icon">

                                        </span>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
</template>

<style scoped>
.default-sort:first-child{
    padding-left: 0px;
}
.default-sort{
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
.r-panel {
    flex: 0 0 auto;
    margin-left: 10px;
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

.topic-item-wrap .topic-item{
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
    margin-top: 19px;
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
.search-wrapper1{
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

input, button, select, optgroup, textarea {
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
a {
    background-color: transparent;
}
*, *::before, *::after {
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
}
*, *::before, *::after {
    -webkit-box-sizing: inherit;
    box-sizing: inherit;
}
div {
    display: block;
}

h1, h2, h3, h4, h5, h6 {
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
body {
    margin: 0;
    color: rgba(0, 0, 0, 0.65);
    font-size: 14px;
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'PingFang SC', 'Hiragino Sans GB', 'Microsoft YaHei', 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';
    font-variant: tabular-nums;
    line-height: 1.5;;
}
</style>