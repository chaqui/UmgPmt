/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
	$(document).on('ready',function()
		{ $("#impreso").click(fuction(e){
                   $("#menu").css("opacity","0%");
                   $("#body").css("background-color","#ffffff");
                   window.print();
                });
                });

