/*
PROGRAM NAME: strtype3.cpp
PROGRAM PURPOSE: Demonstrates string class features
DATE WRITTEN: 2/19/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
#include <string>
using namespace std;
int main() {
	char charr1[20];
	char charr2[20] = "jaguar";
	string str1;
	string str2 = "panther";

	//charr1 = charr2 ILLEGAL!
	//use strcpy() to copy the array
	strcpy_s(charr1, charr2);

	str1 = str2;

	str1 += " paste"; //words for string objects
	
	strcat_s(charr1, " juice");

	int len1 = str1.size();

	int len2 = strlen(charr1);

	cout << "The string " << str1 << " contains "
		<< len1 << " characters.\n";

	cout << "The string " << charr1 << " contains "
		<< len2 << " characters.\n";


	system("pause");
	return 0;
}