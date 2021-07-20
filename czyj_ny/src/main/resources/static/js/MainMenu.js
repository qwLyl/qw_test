$(function () {
    AddCssUri("css/MainMenu.css"); /// <reference path="item.css" />

    //AddScriuptUri(url);
});
//$(".MainMenu-Top-a").click(function () {
function MainMenu_TopClick(obj){
	//alert("ok");
    $(".MainMenu-Top").removeClass("MainMenu-Top-active");
    $(".MainMenu-Top").children('div').remove();
    $(obj).addClass("MainMenu-Top-active");
    
}
//});

function AddScriuptUri(url) {
    var se = document.createElement('script');
    se.src = uri;
    document.head.appendChild(se);
}
function AddCssUri(uri) {
    var ce = document.createElement('link');
    ce.href = uri;
    ce.rel = "stylesheet";
    ce.type = "text/css";
    document.head.appendChild(ce);
}