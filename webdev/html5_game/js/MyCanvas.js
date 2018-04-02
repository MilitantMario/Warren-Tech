// JavaScript Document
window.onload = myCanvas;
function myCanvas();
{
	var canvas = document.getElementById("myCanvas");
	var ctx = canvas.getContext("2d");
	
	canvas.width = canvas.height = 200;
	
	//draw two blue circles for eyes
	ctx.fillstyle = "blue";
	ctx.beginPath();
	ctx.arc(50, 50, 25, 0, Math.PI * 2, true);
	ctx.arc(150, 50, 25, 0, Math.PI * 2, true);
	ctx.fill();
	//draw a red rectangle
		ctx.fillStyle = "red";
		ctx.beginPath();
		ctx.moveTo(100, 75);
		ctx.lineTo(75, 125);
		ctx.lineTo(125, 125);
		ctx.fill();
	
	//draw a greeen semi-circle
	ctx.strokeStyle = "green";
	ctx.beginPath();
		ctx.scale(1, 0.5);
		ctx.arc(100, 300, 75, Math.PI, 0, true);
	ctx.closePath();
	ctx.stroke();
}