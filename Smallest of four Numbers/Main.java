a, b, c, d = input().split()
a = int(a)
b = int(b)
c = int(c)
d = int(d)
if a<b and a<c and a<d:
  print(a)
elif b<c and b<d:
  print(b)
elif c<d:
  print(c)
else:
  print(d)