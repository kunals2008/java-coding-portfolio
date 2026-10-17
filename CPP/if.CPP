  #include <iostream>
  #include <string>
using namespace std;

int main() 
{
  cout<<"Enter string"<<'\n';
  string name; 

 cin>>name;
 cout<<"size="<<name.size()<<'\n';
 if(name.size()>20)
 cout<<name<<" "<<"good";
else if(name.size()<20)
 cout<<name<<" "<<"bad";
else if(name.size()>50)
cout<<name<<" "<<"very good";
return 0;
}
  
 


