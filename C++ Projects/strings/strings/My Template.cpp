/*
PROGRAM NAME: strings.cpp
PROGRAM PURPOSE: Make our strings in C++
DATE WRITTEN: 2/11/16
PROGRAMMER: Nathan
*/
#include <iostream>
#include <cstring> //Used for the strlen() function

using namespace std;
int main() {
	const int Size = 15;
	char name1[Size]; //empty array
	char name2[Size] = "C++owboy"; //declared and initialized array
	//NOTE: some implementations (IDEs) may require the static keyword
	
	cout << "Howdy" << name2;
	cout << "! What's your name?\n";
	cin >> name1;

	cout << strlen(name1) << " letters and is stored\n";
	cout << " in an array of " << sizeof(name1) << " bytes.\n";

	cout << "Your initial is " << name1[0] << ".\n";

	name2[3] = '\0'; //set element 3 to null character
	
	cout << "Here are the first 3 characters of my name: ";
	cout << name2 << endl;

	system("pause");
	return 0;
}