import math

n = int(input())
if n <=1:
  flag = 1
else:
  for i in range(2, n):
    if n%i==0:
      flag = 1
      break
    else:
      flag = 0
    
if flag == 1:
  print('0.00')
else:
  print("%.2f"%math.sqrt(n))