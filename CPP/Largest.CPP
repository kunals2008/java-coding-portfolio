#include <iostream>
using namespace std;
int main()
{
int a, b, c;
int big;
cout<<"Enter values of a, b, c ";
cin>>a>>b>>c;
if(a>b)
{
if(a>c)
big=a;
else
big=c;
}
else
{
if(b>c)
big =b;
else
big =c;
}
cout<<"Largest among them is "<<big;
return 0;
}