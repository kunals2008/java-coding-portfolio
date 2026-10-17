#include <iostream>

using namespace std;

int main()
{

int marks;
char grade;
cout<<"Enter marks ";
cin>>marks;

if(marks>=90)
grade='A';
else if(marks>=80)
grade='B';
else if(marks>=70)
grade='C';
else if(marks>=60)
grade='d';
else if(marks>=50)
grade='E';
else
grade='F';

cout<<"Grade "<<grade;
return 0;
}