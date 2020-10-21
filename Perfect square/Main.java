import math
num = int(input())

n = math.sqrt(num)

if(n-math.floor(n) == 0):
  print('YES')
else:
  print('NO')