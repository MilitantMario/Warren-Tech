/*
PROGRAM NAME: strtype1.cpp
PROGRAM PURPOSE: Demonstrates the C++ String Class
DATE WRITTEN: 2/19/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
#include <string> //make string class avaliable
using namespace std;
int main() {
	char charr1[20]; //"c-style string"
	char charr2[20] = "jaguar";

	string str1; //empty string object
	string str2 = "panther"; //initialized string object

	cout << "Enter a kind of feline: ";
	cin >> charr1;

	cout << "Enter another kind of feline: ";
	cin >> str1;

	cout << "Here are some felines:\n";
	cout << charr1 << " " << charr2 << " " << str1 << " " << str2
		<< endl;

	cout << "The third letter in " << charr2 << " is "
		<< charr2[2] << endl;

	cout << "The third letter in " << str2 << " is "
		<< str2[2] << endl;

	system("pause");
	return 0;
}