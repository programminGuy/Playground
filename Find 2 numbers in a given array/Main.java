#include <iostream>
using namespace std;

int main() 
{
   int n, i, ele1, ele2;
  int arr[20], r1=-1, r2=-1;
   cin>>n;
   for(i = 0; i<n; i++)
   {
   		cin>>arr[i];
   }
   cin>>ele1;
  cin>>ele2;
  for(i=0; i<n; i++)
  {
  	if (ele1==arr[i])
    {
      r1 = i;
    }
    if (ele2==arr[i])
    {
      r2 = i;
    }
  }
  cout<<"Element 1 index = "<<r1<<endl;
  cout<<"Element 2 index = "<<r2;
    return 0;
}