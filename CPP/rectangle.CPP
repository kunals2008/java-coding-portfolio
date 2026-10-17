#include <iostream>

using namespace std;

int main()
{
  int l, b;
  cout<<"enter length ";
  cin>>l;
    cout<<"enter  breadth ";
	  cin>>b;
  int area= l*b;
  int peri= 2*(l+b);
  cout<<"area="<<area;
  cout<<"\nperi="<<peri;
  return 0;
}