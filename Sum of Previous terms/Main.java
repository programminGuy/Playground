lst = [1,2,3]
n = int(input())
if n>30:
  print('Invalid Input')
else:
  for i in range(3, n+1):
  	res = lst[i-1] + lst[i-2]
  	lst.append(res)
  print(lst[n-1])