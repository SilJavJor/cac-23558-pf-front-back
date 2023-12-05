// //

// (function() {
//     //a partir de que punto del scroll vertical de la ventana mostrará el botón
//     const ishow = 100;

//     const $divtop = document.getElementById("div-totop")
    
//     window.addEventListener("scroll", function() {
//         if(document.documentElement.scrollTop > ishow){
//             $divtop.style.display = "inherit"
//         }
//         else {
//             $divtop.style.display = "none"
//         }
//     })
// })()

// $(document).ready(function(){ irArriba(); }); //Hacia arriba

// function irInicio(){
//   $('.ir-arriba').click(function(){ $('body,html').animate({ scrollTop:'0px' },1000); });
//   $(window).scroll(function(){
//     if($(this).scrollTop() > 0){ $('.ir-arriba').slideDown(600); }else{ $('.ir-arriba').slideUp(600); }
//   });
//   $('.ir-abajo').click(function(){ $('body,html').animate({ scrollTop:'1000px' },1000); });
// }



/*  */

// window.onscroll = function(){
//   console.log(document.documentElement.scrollTop);
//   if(document.documentElement.scrollTop > 100) {
//     document.querySelector('.go-top-container').classList.add('show');
     
//   }
//   else{
//     document.querySelector('.go-top-container').classList.remove('show');
//   }
// }
 
// document.querySelector('.go-top-container').addEventListener('click', () => {
//   window.scrollTo({
//     top: 0,
//     behavior: 'smooth'
//   });
// });

// Espera a que el documento esté completamente cargado
// document.addEventListener("DOMContentLoaded", function() {
//   var arrowButton = document.getElementById("arrowButton");
//   var rotationCount = 0;

//   // Agrega un event listener para el evento de rotación del mouse
//   document.addEventListener("wheel", function(event) {
//       rotationCount += Math.abs(event.deltaY);

//       // Muestra el botón después de la segunda rotación del mouse
//       if (rotationCount > 2) {
//           arrowButton.classList.remove("d-none");
//       }
//   });

//   // Agrega un event listener para el clic en el botón
//   arrowButton.addEventListener("click", function() {
//       // Desplázate a la primera sección de la página
//       window.scrollTo({
//           top: 0,
//           behavior: "smooth"
//       });
//   });
// });

// document.addEventListener("DOMContentLoaded", function() {
//   var arrowButton = document.getElementById("arrowButton");
//   var rotationCount = 0;

//   document.addEventListener("wheel", function(event) {
//       rotationCount += Math.abs(event.deltaY);

//       if (rotationCount > 2) {
//           arrowButton.classList.remove("hidden");
//       }
//   });

//   arrowButton.addEventListener("click", function() {
//       window.scrollTo({
//           top: 0,
//           behavior: "smooth"
//       });
//   });
// });

// $(document).ready(function(){

// 	$('.ir-arriba').click(function(){
// 		$('body, html').animate({
// 			scrollTop: '0px'
// 		}, 300);
// 	});

// 	$(window).scroll(function(){
// 		if( $(this).scrollTop() > 0 ){
// 			$('.ir-arriba').slideDown(300);
// 		} else {
// 			$('.ir-arriba').slideUp(300);
// 		}
// 	});

// });

window.onscroll = function(){
    console.log(document.documentElement.scrollTop);
    if(document.documentElement.scrollTop > 100) {
      document.querySelector('.go-top-container').classList.add('show');
      
    }
    else{
      document.querySelector('.go-top-container').classList.remove('show');
    }
  }
  
  document.querySelector('.go-top-container').addEventListener('click', () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth'
    });
  });