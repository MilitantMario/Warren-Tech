/*
PROGRAM NAME: arrayone.cpp
PROGRAM PURPOSE: 
DATE WRITTEN: 
PROGRAMMER: Nate Nieuwenhuis
*/
#include <iostream>
using namespace std;
int main() {
	//Declare an array
	int yams[3];

	//Give the array a value at element 0
	yams[0] = 7; //put 7 in element 0
	
	yams[1] = 8;
	yams[2] = 6;
	//yams[3] = 8;


	//A different way to declare an init arrays
	int yamcosts[3] = { 20, 30, 5 };

	//NOTE: if your C++ compiler or translator can't initialize
	// this array, use static int yamcosts[3] instead of
	//yamcosts[3]

	cout << "Total yams = ";
	cout << yams[0] + yams[1] + yams[2] << endl;

	cout << "The package with " << yams[1] << "yams costs ";
	cout << yamcosts[1] << " cents per yam./n";

	int total = (yams[0] * yamcosts[0]) +
		(yams[1] * yamcosts[1]) +
		(yams[2] * yamcosts[2]);

	cout << "The total yam expense is " << total << " cents.\n";

	cout << "\nSize of yams array = " << sizeof yams;

	cout << "Size of one element = " << sizeof yams[0];
	cout << " bytes.\n";


	system("pause");
	return 0;
}