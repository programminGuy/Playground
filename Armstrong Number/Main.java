n = input()
lst = list(n)
l = len(lst)
sum = 0
for i in lst:
  i = int(i)
  sum = sum + pow(i,l)
if sum == int(n):
  print("ARMSTRONG")
else:
  print("NOT AN ARMSTRONG")