def fib(n):
    f=[0,0,1]
    for i in range(3, n+1):
         ans = ((i-1)*(f[i-1] + f[i-2]))%100000007
         f.append(ans)
    
    return f[n]

n=int(input())
print(fib(n))
