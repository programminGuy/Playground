n = int(input())
l = len(str(n))
temp = n
while(l):
  new = int(temp % 10)
  temp = temp/10
  l -=1
  print(new,end='')