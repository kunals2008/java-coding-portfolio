#include <iostream>
using namespace std;
int main()
{
char grade;
cout<<"Enter grade ";
cin>>grade;
switch(grade)
{
case 'A':
cout<<"Excellent";
break;
case 'B':
cout<<"Very Good";
break;
case 'C':
cout<<"Good";
break;
case 'D':
cout<<"Average";
break;
case 'E':
cout<<"Below Average";
break;
default:
cout<<"Invalid Grade ";
}
return 0;
}