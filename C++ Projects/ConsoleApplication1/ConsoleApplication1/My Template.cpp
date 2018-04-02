/*
PROGRAM NAME: instr2.cpp
PROGRAM PURPOSE: 
DATE WRITTEN:
PROGRAMMER:
*/
#include <iostream>
using namespace std;
int main() {
	const int ARSIZE = 20;
	char name[ARSIZE];
	char dessert[ARSIZE];

	cout << "Enter your name:\n";
	cin.getline(name, ARSIZE);
	
	cout << "Enter your favorite dessert:\n";
	cin.getline(dessert, ARSIZE);

	cout << "I have some delicious " << dessert;
	cout << name;

	system("pause");
	return 0;
}