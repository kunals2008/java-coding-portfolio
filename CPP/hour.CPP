#include <iostream>

using namespace std;

int main()
{
int hour;
cout<<"enter hour ";
cin>>hour;
if(hour>=18)
cout<<"Good Evening";
else if(hour>=12)
cout<<"Good Afternoon";
else
cout<<"Good Morning";
return 0;
}
