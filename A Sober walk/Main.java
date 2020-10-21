num = int(input())
x,y = 0,0
c = 'R'
for i in range(num):
  if c=='R':
    x = abs(x)+ 10
    y = abs(y)
    c = 'U'
  elif c=='U':
    y = y + 20
    c = 'L'
  elif c=='L':
    x = -(x+10)
    c = 'D'
  elif c=='D':
    y = -(y)
    c = 'R'
print(x,y)