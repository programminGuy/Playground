fact = [1,2,6]
n = int(input())
for i in range(3,n):
  fact.append(fact[i-1] * (i+1))
print(fact[n-1])