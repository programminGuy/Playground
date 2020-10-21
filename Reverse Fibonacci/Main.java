lst = [0,1,1]

n = int(input())
for i in range(3,n):
  lst.append(lst[i-1]+lst[i-2]) 
       
for i in range(n - 1, -1 , -1):   
  print(lst[i],end=" ")  
