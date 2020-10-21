n = int(input())
lst = input().split()
t = input()
res = 0
for i in range(n):
  if t==lst[i]:
    res = i
if res:
  print(res+1)
else:
  print(t,'isn\'t present in the array.')