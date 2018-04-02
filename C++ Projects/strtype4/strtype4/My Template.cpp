/*
PROGRAM NAME: strtype4.cpp
PROGRAM PURPOSE: 
DATE WRITTEN: 2/23/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
#include <cstring>
#include <string>
using namespace std;
int main() {
	char charr[20]; //c-style string
	string str; //string object

	cout << "Length of string in charr before input: "
		<< strlen(charr) << endl;

	cout << "Length of string in str before input: "
		<< str.size() << endl;

	cout << "Enter a line of text:\n";
	cin.getline(charr, 20);

	cout << "You entered: " << charr << endl;

	//prompt user for string object input
	cout << "Enter another line of text:\n";
	getline(cin, str);

	cout << "You entered: " << str << endl;

	cout << "Length of string in charr after input: "
		<< strlen(charr) << endl;

	cout << "Length of string in str after input: "
		<< str.size() << endl;

	system("pause");
	return 0;
}