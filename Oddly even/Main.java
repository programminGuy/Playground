num = input()

l = len(num)
oddSum = 0
evenSum = 0
for i in range(l):
  if i % 2!=0:
    oddSum = oddSum + int(num[i])
  else:
    evenSum = evenSum + int(num[i])
print(abs(oddSum - evenSum))