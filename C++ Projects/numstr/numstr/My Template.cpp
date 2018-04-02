/*
PROGRAM NAME: numstr.cpp
PROGRAM PURPOSE: demonstrates following number input with line input
DATE WRITTEN: 2/16/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
using namespace std;
int main() {
	cout << "What year was our house build?\n";
	int year;
	cin >> year; //get year from user
	cin.get();

	cout << "What is its street address?\n";
	char address[80]; //c-style string
	cin.getline(address, 80);
	cout << "Year built: " << year << endl;
	cout << "Address: " << address << endl;
	cout << "Done!\n";

	system("pause");
	return 0;
}