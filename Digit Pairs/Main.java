def bit(n):
	min=999
	max=0
	while(n!=0):
		rem = n%10
		if(min>rem):
			min =rem 
		if(max<rem):
			max=rem
		n = n // 10
	ans = (max*11 + min*7)%100
	return ans
size = int(input())
is_true = True
if size > 0 and size <= 500:
    lst = []
    lst = list(map(int, input().strip().split()))[:size] 
    for i in range(size):
        temp = lst[i]
        temp = str(temp)
        l = len(temp)
        if l != 3:
            print("Invalid Input")
            is_true = False
            break
        lst[i] = bit(lst[i])
    msb_count = 0 
    pairs = 0
    for i in range(size):
        msb_count=0;
        #x = i + 2
        for j in range(i+2, size, 2):
            if lst[i] == 0:
                break
            elif lst[i]//10 == lst[j]//10:
                msb_count = msb_count + 1
                lst[j] = 0;
                if(msb_count<=2):
                    pairs = pairs + 1
    if is_true == True:
        print(pairs)
else:
	print("Invalid Input")