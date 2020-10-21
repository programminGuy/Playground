m, n = input().split()

m = int(m)
n = int(n)

for i in range(m,n+1):
  if n>=100:
    print("%03d" %i, end=" ")
  elif n>=10:
    print("%02d" %i, end=" ")
  else:
    print("%d" %i, end= " ")