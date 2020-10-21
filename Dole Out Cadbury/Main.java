import math as Math
minLength = int(input())
maxLength = int(input())
minWidth = int(input())
maxWidth = int(input())

pos = []
for x in range(minLength, maxLength+1):
    pos.append(x*minWidth)
    pos.append(x*maxWidth)
    
count = 0

for i in pos:
  res = Math.floor((Math.sqrt(i)))
  count = count + res
        
print(count)
