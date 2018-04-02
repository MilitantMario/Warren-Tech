/*
PROGRAM NAME: instr3.cpp
PROGRAM PURPOSE: demonstrates reading more than one word.
DATE WRITTEN: 2/16/16
PROGRAMMER: Nathan Nieuwenhuis
*/
#include <iostream>
using namespace std;
int main() {
	const int ARSIZE = 20;
	char name[ARSIZE];
	char dessert[ARSIZE];

	cout << "Enter your name:\n";
	cin.get(name, ARSIZE).get();

	cout << "Enter your favorite dessert:\n";
	cin.get(dessert, ARSIZE).get();
	
	cout << "I have some delicious " << dessert;
	cout << " for you, " << name << ".\n";

	system("pause");
	return 0;
}