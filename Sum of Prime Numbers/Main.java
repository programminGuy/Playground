l = int(input())
u = int(input())
sum = 0
def check_prime(n):
  if n<=1:
    return False
  else:
    for i in range(2,n):
      if n%i==0:
        return False
    return True
for i in range(l+1,u):
  if(check_prime(i)):
    #print(i)
    sum = sum + i
print(sum)