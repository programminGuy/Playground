from collections import Counter

n = int(input())
lst =[]
res = []
for i in range(n):
  lst.append(int(input()))
  
dic= Counter(lst);
for i in dic:
  if dic[i] == 1:
    res.append(i)
    
res.sort()
print(*res)
  