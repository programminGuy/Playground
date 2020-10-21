n = int(input())
i = 0
res = 0
while(n):
  temp = n % 10
  res =res + ( temp * pow(2, i))
  n = n//10
  i= i+1
  

print(res)