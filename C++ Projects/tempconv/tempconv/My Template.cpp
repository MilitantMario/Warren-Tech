/*
PROGRAM NAME: tempconv.cpp
PROGRAM PURPOSE: Convert Degrees to Celcius
DATE WRITTEN: 2/16/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
using namespace std;
double ftoc(double);
int main() {
	double fahrenheit;
	double celsius;

	cout << "Enter your degrees in Fahrenheit: ";
	cin >> fahrenheit;

	celsius = ftoc(fahrenheit);

	cout << endl;

	cout << "Here is your conversion: " << celsius << endl;

	system("pause");
	return 0;
}

double ftoc(double fahrenheit) {
	return ((fahrenheit - 32) * 5/9);
}