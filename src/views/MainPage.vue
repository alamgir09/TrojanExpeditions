<template>
    <div id="mainPage">
        <main>
            <div class="search-box">
                <input name="" id="" type="text" class="search-bar" placeholder="Your favorite library">
            </div>
        </main>
    </div>
</template>

<style scoped>
* {
    box-sizing: border-box;
}
header {
    width: 100vw;
    height: 90px;
    background-color: #8E7F7F;
    align-content: center;
    padding: 22.5px;
}
main {
    display: flex;
    min-height: 100vh;
    align-content: center;
    justify-content: center;
}
.search-box {
    height: 50px;
    margin-top: 20vh;
    display: flex;
    text-align: center;
    justify-content: center;
    width: 60vw;
}
::placeholder {
    font-size: 14px;
    /*margin-top: auto;*/

}

.search-bar {
    display: block;
    width: 40%;
    padding: 15px;
    font-size: 20px;
    box-shadow: 0px 0px 16px rgba(0,0,0,0.25);
    appearance: none;
    border: none;
    background: none;
    outline: none;
    border-radius: 10px 10px 10px 10px;
}
</style>