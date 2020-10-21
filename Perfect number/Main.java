num = int(input())
lst = []
for i in range(1, num):
  if num % i == 0:
    lst.append(i)
if sum(lst) == num:
  print("Yes")
else:
  print('No')