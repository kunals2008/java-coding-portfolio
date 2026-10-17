#include <iostream>
using namespace std;
int main()
{
int year;
cout<<"Enter year";
cin>>year;
if(year %400 ==0)
cout<<" Leap Year ";
else if (year %4 ==0)
{
if(year%100 !=0)
cout<<" Leap Year ";
else
cout<<" NOT Leap Year ";
}
else
cout<<"NOT Leap Year";
return 0;
}
