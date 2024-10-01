// Adding functionality and animated click effect to the navbar_menu
const menu = document.querySelector('#mobile-menu');
const menuLinks = document.querySelector('.navbar__menu');

menu.addEventListener('click', function(){
    menu.classList.toggle('is-activve');
    menuLinks.classList.toggle('active');
})

// Functionality for testimony Slide
var testimonyBtn = document.getElementsByClassName("testimony__btn");
var testimonySlide = document.getElementById("testimony__slide");

testimonyBtn[0].onclick = function(){
    testimonySlide.style.transform = "translateX(0px)";
    // Change the size of the active indicator
    for(i=0;i<4; i++){
        testimonyBtn[i].classList.remove("active"); // To remove active class name
    }
    this.classList.add("active"); // To add the same class name on the active button
}
testimonyBtn[1].onclick = function(){
    testimonySlide.style.transform = "translateX(-800px)";
    for(i=0;i<4; i++){
        testimonyBtn[i].classList.remove("active"); 
    }
    this.classList.add("active"); 
}
testimonyBtn[2].onclick = function(){
    testimonySlide.style.transform = "translateX(-1600px)";
    for(i=0;i<4; i++){
        testimonyBtn[i].classList.remove("active"); 
    }
    this.classList.add("active"); 
}
testimonyBtn[3].onclick = function(){
    testimonySlide.style.transform = "translateX(-2400px)";
    for(i=0;i<4; i++){
        testimonyBtn[i].classList.remove("active");
    }
    this.classList.add("active"); 
}
