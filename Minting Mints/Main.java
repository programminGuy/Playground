mints, l = map(int, input().split())
total = 0
lst =  [mints]

for i in range(l-1):
  total = sum(lst)
  lst.append(total-1)
print(sum(lst))