/*
PROGRAM NAME: instr1.cpp
PROGRAM PURPOSE: reading more than one string
DATE WRITTEN: 2-11-16
PROGRAMMER: Nathan
*/
#include <iostream>
using namespace std;
int main() {
	const int ArSize = 20;
	char name[ArSize];
	char dessert[ArSize];

	cout << "Enter your name:\n";
	cin >> name;

	cout << "Enter your favorite dessert:\n";
	cin >> dessert;

	cout << "I have some delicious " << dessert;
	cout << " for you, " << name << ".\n";

	system("pause");
	return 0;
}