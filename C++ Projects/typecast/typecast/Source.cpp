//typecast.cpp - forcing type changes
#include <iostream>
int main()
{
	using namespace std;
	int auks, bats, coots;
	//the following statement adds the values as a double
	//then converts the result to int
	
	auks = 19.99 + 11.99;

	//these statements add values as int
	bats = (int) 19.99 + (int) 11.99; //old C syntax

	coots = int(19.99) + int(11.99); //new C++ syntax

	cout << "auks = " << ", bats = " << bats;
	cout << ", coots = " << coots << endl;

	char ch = 'Z';
	
	cout << "The code for " << ch << " is "; //print as char
	cout << int(ch) << endl; //print as int

	//using static cast
	cout << "Yes, the code is ";
	cout << static_cast<int>(ch) << endl;

	system("pause");
	return 0;
}