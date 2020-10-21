#include<iostream>
using namespace std;
bool isPalindrome(string s)
{
	for(int i = 0, j = s.size()-1; i<j; i++, j--)
    {
    	if(s[i] != s[j])
          return false;
    }
  return true;
}

void frontRotate(string& str)
{
	string s1= str;
  	for(int i = 0; i<str.size(); i++)
    {
    	s1[i] = str[(i+1) % str.size()];
    }
  str = s1;
}

void backRotate(string& str)
{
	string s2= str;
  	s2[0] = str[str.size()-1];
    for(int i=str.size(); i>0; i--)
 	{
    	s2[i] = str[i-1];
    }
  str = s2;
}
int main(){
  int test;
  cin>>test;
  while(test--)
  {
    int res = -1;
  	string str, s1, s2;
    cin>>str;
    if(isPalindrome(str))
      cout<<0<<endl;
    else
    {
    	s1 = s2 = str;
      	for(int j = 0; j<str.size(); j++)
        {
          frontRotate(s1);
      	  backRotate(s2);
      	  if(isPalindrome(s1) or isPalindrome(s2))
          {
        	res = j + 1;
            break;
          }
        }
      cout<<res<<endl;
    }
  }
  return 0;
}