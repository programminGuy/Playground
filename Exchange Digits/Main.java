from itertools import permutations

value, compare = input().split()
compare = int(compare)
a = str(value)

a = ''.join(sorted(a))
b = str(compare)
if len(a)<len(b):
  print(-1)
else:
  result = -1
  premlist = permutations(a)
  for i in premlist:
    str1 = ''.join(i)
    n = int(str1)
    if n > compare:
      result = str1
      break
  print(result)