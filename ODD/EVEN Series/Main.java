lst = [0,0,2]
n = int(input())
if n <= 2:
  print(lst[n-1])
else:
  for i in range(3, n+1):
    if i%2==0:
      lst.append(lst[i-2] + 2)
    else:
      res = int(lst[i-1]/2)
      lst.append(res)
    
  print(lst[n-1])