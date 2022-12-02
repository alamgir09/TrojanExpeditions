<template>
    <!-- Add icon library -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <h1>Hoose Library {{datastructure}}</h1>
        <!-- This is the html code below-->
        <div class="introduction">
            <div class="thumbnail">
                <img :src="require('./../Locations/img/Hoose.jpg')"/>
            </div>
            <div class="desc"> Mudd Hall, 3709 Trousdale Pkwy, Los Angeles, CA 90089</div>
        </div>
    <div class="summary">
        <h3>SUMMARY</h3>
        <div class="summary_inner">
        <ul>
            Rating: 5 stars overall {{datastructure}}
            <br>
            Quiteness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span><span class="fa fa-star"></span>
            <br>
            Cleanliness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span><span class="fa fa-star checked"></span>
            <br>
            Overall: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span><span class="fa fa-star"></span>
            <br>
        </ul>
    </div>
    </div>
    <div class="recent">
        <h3>Top Liked Review</h3>
        <div class="recent_inner">
            Mary: My favorite spot on campus to get work done! Always clean and never too busy. 
            <br>
            Quietness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span><span class="fa fa-star checked"></span>   
            &emsp;Cleanliness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span><span class="fa fa-star checked"></span>
            <br>
            Overall: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span><span class="fa fa-star checked"></span>
            <br>
        </div>
    </div>

    <AddReviewButton/>
    
    <div class="big_review">
        <div class="profilePhoto">
            Clark
        </div> 
        <div class="reviewMessage">
            Came here once and never going back, It was loud outside, the bathroom didn’t work, and the librarian was creepy. Avoid at all costs.  {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
        </div>
        
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            Yaxi
        </div>
        <div class="reviewMessage">
            Love Hoose! Can get a little hot inside in the summer without AC but if it’s below 75 this is where you’ll find me. {{something}}
        </div> 
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked "></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
        </div>

    </div>
    
    <div class="review">
        <div class="profilePhoto">
            Frank
        </div> 
        <div class="reviewMessage">
            Very nice if you don’t mind a little noise, but if you need quiet go somewhere else.  {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
        </div>
        
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            Clara
        </div> 
        <div class="reviewMessage">
            This place has everything! Love having the coffee shop for late nights. You’ll be seeing me here all of finals week! {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            Mohammed
        </div> 
        <div class="reviewMessage">
            Wouldn’t expect it from the outside but this place is quite nice. If it were a little quieter it would be better. {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span> <span class="fa fa-star"></span> <span class="fa fa-star"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star "></span> <span class="fa fa-star "></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            Matt
        </div> 
        <div class="reviewMessage">
            Hoose library has saved my grades more than once. Great place to lock in. {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star"></span>
        </div>
    </div>
    
    
    </template>
    <!-- This is the js code below-->
    <script>
        import AddReviewButton from "./AddReviewButton.vue";
        export default {
        props: ["loggedIn"],
        components: {
            AddReviewButton
        }}
        
    </script>
    <!-- This is the css code below-->
    <style scoped>
    
    h1
    {
        text-align: center;
        color: black;
        font-weight: bold;
    }
    
    h3
    {
        font-size: 30px;
        text-align: center;
        margin-bottom: 0px;
    }
    
    .checked
    {
        color:orange;
    }
    
    h1{
        margin-top: 10px;
    }
    .introduction
    {
        border: 1px solid #ccc;
        width: 700px;
        margin: 0 auto;
        margin-bottom: 50px;
        margin-top: 20px;
        background-color: lightgray;
        color:black;
        
    }
    
    .introduction_inner
    {
        color: white;
        text-align:center;
        margin: 100px;
        bottom: 610px;
        left: 340px;
        position:absolute;
        border: thin solid black;
        background-color: black;
        border-radius: 5%;
    }
    
    .summary
    {
        font-weight: bold;
        font-size: 20px;
        color:black;
        width: 550px;
        height: 215px;
        box-sizing: border-box;
        text-align: left;
        margin-left: 60px;
        margin-bottom: 50px;
        float:left;
        border-radius: 5%;
        background-color: lightgray;
    }
    
    .summary_inner
    {
        margin-left: 10px;
    }
    
    .recent
    {
        font-weight: bold;
        font-size: 20px;
        color:black;
        width: 550px;
        height: 215px;
        box-sizing: border-box;
        margin-left:650px ;
        margin-bottom: 50px;
        border-radius: 5%;
        background-color: lightgray;
    }
    
    .recent_inner
    {
        margin-left: 10px;
    }
    .review
    {
        font-size:20px;
        color:black;
        font-weight: bold;
        height: 170px;
        text-align: center;
        box-sizing: border-box;
        margin:25px;
        margin-left: 75px;
        margin-right: 75px;
        background-color: lightgray;
    }
    .big_review
    {
        font-size:20px;
        color:black;
        font-weight: bold;
        height: 200px;
        text-align: center;
        box-sizing: border-box;
        margin:25px;
        margin-left: 75px;
        margin-right: 75px;
        background-color: lightgray;
    }
    
    .reviewMessage
    {
        padding-top: 15px;
        padding-bottom: 40px;
        padding-left: 40;
        padding-right: 40;
        font-weight: normal;
    }
    
    .profilePhoto
    {
        float: left;
        margin-top: 15px;
        margin-left: 10px;
        width: 110px;
        height: 110px;
        border-radius: 100%;
        background-color: white;
        background-image: something;

    }
    
    .stars
    {
        text-align: left;
    }
    
    div.desc {
      padding: 15px;
      text-align: center;
    }
    
    img {
      width: 100%;
      height: auto;
    }
    
    .thumbnail{
      width: 600 px;
      height: 400 px;
      overflow: hidden;
    }
    </style>