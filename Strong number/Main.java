def strongNum(n):
  fact = [1,2,6]
  for i in range(3, n):
    fact.append(fact[i-1] * (i+1))
  return fact[n-1]
  
num = input()
lst = list(num)
sum = 0
for i in lst:
  sum = sum + strongNum(int(i))
if sum == int(num):
  print('Yes')
else:
  print('No')
#strongNum(num)