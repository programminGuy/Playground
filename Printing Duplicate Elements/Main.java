n=int(input())
arr = []
arr = input().split()

for i in range(0, len(arr)):  
    for j in range(i+1, len(arr)):  
        if(arr[i] == arr[j]):  
            print(arr[j],end=" ");  