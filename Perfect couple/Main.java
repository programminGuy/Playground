import sys


def check_sum_and_display(arr, size,summ):
    for i in range (0,size-1):
        for j in range (0,size):
            if(summ == (int(arr[i]) + int(arr[j]))):
                print("Perfect couple:",end=" "),
                print(arr[i],end=" ")
                print(arr[j])
                sys.exit()
        
    print("No perfect couple found!")


size = int(input())
arr= input().split()
    
summ = int(input()) 
check_sum_and_display(arr, size, summ)
 
