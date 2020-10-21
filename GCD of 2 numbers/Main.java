n = int(input())
m = int(input())

if n<m:
  n,m = m,n
res = m
for i in range(1, n):
  if m % i == 0:
    if n % i == 0:
      res = i
      
print(res)