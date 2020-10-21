#include <iostream>
using namespace std;
int lcm(int a,int b)
{
	int i, gcd;
   for (i = 1; i <= a && i <= b; i++)
   {
     if(a%i==0 && b%i==0)
     {
   		gcd = i;
     }
     
   }
  return (a*b)/gcd;
}
int main() 
{
   int n,i,l;
   cin>>n;
   int ar[n];
  
   for(i=0; i<n; i++)
   {
   		cin>>ar[i];
   }
  l = ar[0];
   for(i=1; i<n; i++)
   {
   		l = lcm(l,ar[i]);
   }
   cout<<l;
    return 0;
}