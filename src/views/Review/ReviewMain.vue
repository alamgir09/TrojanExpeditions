<template>
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <h1>Leavey Library {{datastructure}}</h1>
    <!-- This is the html code below-->
    <div class="introduction">
        <div class="introduction_inner"> is where I'll include the picture of the study room, and a short introduction of it. Then I'll include the aggregated rankings
        on the left and the right with the recent reviews
        </div>
</div>
<div class="summary">
    <h3>SUMMARY</h3>
    <div class="summary_inner">
        This is for aggregated reviews
    <ul>
        Rating: 5 stars overall {{datastructure}}
        <br>
        Filter 1: {{datastructure}}<span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        <br>
        Filter 2: {{datastructure}} <span class={{star1}}></span> <span class={{star2}}></span> <span class={{star3}}></span> <span class={{star4}}></span> <span class={{star5}}></span> 
        <br>
        Filter 3: {{datastructure}} <span class="fa fa-star"></span>
        <br>
    </ul>
</div>
</div>
<div class="recent">
    <h3>Latest Review</h3>
    <div class="recent_inner">
        Just fetch the latest review, text only
    </div>
</div>

<div class="review">
    <div class="profilePhoto">
        Photo here
    </div> 
    <div class="reviewMessage">
        Text goes here {{something}}
    </div>
    &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
    Filter 1 &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
    Filter 2 &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
    Filter 3 &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
    <div class="stars">
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &nbsp; &ensp; &ensp; &ensp; &ensp;
        <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
        &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp; &ensp;
        <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span> <span class="fa fa-star checked"></span>
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
.introduction
{
    color:black;
    margin: auto;
    font-size: 15px;
    font-weight: bold;
    width: 600px;
    height: 400px;
    border-radius: 5%;
    box-sizing: border-box;
    margin-bottom:50px;
    background-color: lightgray;
}

.introduction_inner
{
    text-align:center;
    margin: 100px;
    bottom: 220px;
    width:500px;
    height: 100px;
    left: 365px;
    position:absolute;
    border: thin solid black;
}

.summary
{
    font-weight: bold;
    font-size: 20px;
    color:black;
    width: 600px;
    height: 215px;
    box-sizing: border-box;
    text-align: left;
    margin-left: 75px;
    margin-bottom: 250px;
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
    width: 600px;
    height: 215px;
    box-sizing: border-box;
    margin-left:763px ;
    margin-bottom: 250px;
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
    height: 150px;
    text-align: center;
    box-sizing: border-box;
    margin:75px;
    margin-bottom: 50px;
    background-color: lightgray;
}

.reviewMessage
{
    padding-top: 10px;
    padding-bottom: 40px;
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

</style>