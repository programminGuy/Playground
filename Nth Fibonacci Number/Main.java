lst = [0,1,1]
n = int(input())
for i in range(3, n+1):
  lst.append(lst[i-1]+lst[i-2])
print(lst[n-1])