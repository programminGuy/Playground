n = int(input())

for i in range(2, n+1):
  f = 1
  for j in range(2,i):
    if i%j == 0:
      f = 0
  if f == 0:
    pass
  else:
    print(i, end=' ')
    