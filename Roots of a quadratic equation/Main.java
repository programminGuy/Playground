import math
a=int(input())
b=int(input())
c=int(input())
discriminant = b*b - 4*a*c
        
if (discriminant > 0):
    x1 = (-b + math.sqrt(discriminant)) / (2*a)
    x2 = (-b - math.sqrt(discriminant)) / (2*a)
    print("root1 =",end=" ")
    print('%.2f'%x1,end=" ")
    print(" root2 =",end=" ")
    print('%.2f'%x2);
        
elif (discriminant == 0):
    x1 = (-b + math.sqrt(discriminant)) / (2*a)
    print("root1 =",end=" ")
    print('%.2f'%x1,end=" ")
    print(" root2 =",end=" ")
    print('%.2f'%x1);
    
else:
    realPart = -b/(2*a);
    imaginaryPart =math.sqrt(-discriminant)/(2*a)
    print("root1 =",end=" ")
    print('%.2f '%realPart,end="")
    print("+",end=" ")
    print('%.2f'%imaginaryPart,end="i")
    print("  root2 =",end=" ")
    print('%.2f '%realPart,end="")
    print("-",end=" ")
    print('%.2f'%imaginaryPart,end="i")