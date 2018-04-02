window.onload = getMyLocation;

function getMyLocation()
{
	if(navigator.geolocation)
	{
		navigator.geolocation.getCurrentPosition(displayLocation);
	}
	else
	{
		alert("Oops! No geolocation support.");
	}
}

var map;

function showMap(coords)
{
	var googleLatAndLong = 
		new google.maps.LatLng(coords.latitude, coords.longitude);
	
	//Required Google map options
	var mapOptions = 
	{
		zoom: 10,
		center: googleLatAndLong,
		mapTypeID: google.maps.MapTypeID.ROADMAP
	};
	
	var mapDiv = document.getElementById("map");
	map = new google.maps.Map(mapDiv, mapOptions);
	
}

function displayLocation(position)
{
	var latitude = position.coords.latitude;
	var longitude = position.coords.longitude;
	//Finds the id
	var div = document.getElementById("location");
	//Write the data out to the page
	div.innerHTML = "You are at latitude: " + latitude + ", longitude " + longitude;
	
	var ourCoords = 
	{
		latitude: 37.4030,
		longitude: -121.9700
	};
	
	var km = computeDistance(position.coords, ourCoords);
	var kilos = km.toFixed(2);
	var mi = km * 0.621;
	var miles = mi.toFixed(2);
	
	var distance = document.getElementById("distance");
	
	distance.innerHTML = "You are " + kilos + " km  " +
	"and " + miles + " miles from Levi's Stadium";	
	
	showMap(position.coords);
}

function computeDistance(startCoords, destCoords)
{
	var startLatRads = degreesToRadians(startCoords.latitude);
	var startLongRads = degreesToRadians(startCoords.longitude);
	var destLatRads = degreesToRadians(destCoords.latitude);
	var destLongRads = degreesToRadians(destCoords.longitude);
	
	var Radius = 6371; //radius of the earth in km
	var distance = Math.acos(Math.sin(startLatRads) * Math.sin(destLatRads) + Math.cos(startLatRads) * Math.cos(destLatRads) * Math.cos(startLongRads - destLongRads)) * Radius;
	return distance;	
}

function degreesToRadians(degrees)
{
	var radians = (degrees * Math.PI) / 180;
	return radians;
}












