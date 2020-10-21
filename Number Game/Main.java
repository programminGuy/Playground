N = int(input())
lst = list(map(int, input().strip().split()))[:N]

sum = 0 
for i in lst:
  sum = sum ^ i

if (sum == 0):
  print('JASBIR')
else:
  print('AMAN')  