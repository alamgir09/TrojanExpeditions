<template>
    <!-- Add icon library -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <h1>Leavey Library {{datastructure}}</h1>
        <!-- This is the html code below-->
        <div class="introduction">
            <div class="thumbnail">
                <img :src="require('./../Locations/img/Leavey.jpg')"/>
            </div>
            <div class="desc"> 651 W 35th St, Los Angeles, CA 90089</div>
        </div>
    <div class="summary">
        <h3>Summary</h3>
        <div class="summary_inner">
        <ul>
            Rating: 5 stars overall {{datastructure}}
            <br>
            Quiteness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            <br>
            Cleanliness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span>
            <br>
            Overall: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span>
            <br>
        </ul>
    </div>
    </div>
    <div class="recent">
        <h3>Top Liked Review</h3>
        <div class="recent_inner">
            Mary: Loved Leavey Library so much! It was amazing. Quiet and clean as well!
            <br>
            Quietness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span>   
            &emsp;Cleanliness: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            <br>
            Overall: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            <br>
        </div>
    </div>
    <AddReviewButton/>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Clark</h4>
        </div> 
        <div class="reviewMessage">
            Can’t believe i didn’t know about this place, a new go-to for sure {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Yaxi</h4>
        </div> 
        <div class="reviewMessage">
            This place sucks! Smelled so bad and there were questionable stains everywhere. Stay away! {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Frank</h4>
        </div> 
        <div class="reviewMessage">
            It was alright, overhyped tbh {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Clara</h4>
        </div> 
        <div class="reviewMessage">
            Amazing study place, I’ll let all my friends know about it. {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Mohammed</h4>
        </div> 
        <div class="reviewMessage">
            Perfect mix between a cozy cafe and rustic library. {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        </div>
    </div>
    
    <div class="review">
        <div class="profilePhoto">
            <h4>Matt</h4>
        </div> 
        <div class="reviewMessage">
            Very busy, made it hard to get work done. {{something}}
        </div>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Quietness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Cleanliness &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        Overall &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <div class="stars">
            &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &nbsp; &nbsp; &nbsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &emsp; &emsp; &emsp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
            &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
            <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star unchecked"></span> <span class="fa fa-star unchecked"></span>
        </div>
    </div>
    
    
</template>
    <!-- This is the js code below-->
    <script>
        // here we want to aggregate review rankings
        // also possibly create a sort function that sorts reviews by date posted
        // I'm assuming the data is stored in a structure called datastructure
        // function lastReview()
        // {
        //     return datastructure[-1]??
        // }
    
        // function starRating()
        // {
            // for loop iterating and changing star values
        // }
        import AddReviewButton from "./AddReviewButton.vue";
        export default {
        props: ["loggedIn"],
        components: {
            AddReviewButton
        },
};  
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

    .unchecked
    {
        color: white;
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
        padding-top:20px;
    }
    
    .summary_inner
    {
        margin-left: 23%;
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
        padding-top:20px;
    }
    
    .recent_inner
    {
        margin-left: 5%;
        margin-right: 5%;
    }
    .review
    {
        font-size:20px;
        color:black;
        font-weight: bold;
        height: 170px;
        box-sizing: border-box;
        margin:25px;
        margin-left: 75px;
        margin-right: 75px;
        background-color: lightgray;
        padding-top: 30px;
    }
    
    .reviewMessage
    {
        padding-top: 10px;
        padding-bottom: 15px;
        margin-left: 70px;
        font-weight: normal;
        position:relative;left:80px;
        background-color: white;
        width: 80%;
        border-radius: 3%;
        border: solid 2px black;
        z-index: 0;
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