t= int(input())
for i in range(t):
  count = 0
  n = int(input())
  while(n>0):
    n = n>>1
    count +=1 
  print(count)