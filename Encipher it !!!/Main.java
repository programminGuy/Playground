a1 = input()
a2 = int(input())
r = (90 - ord(a1)) + a2
if a1>='A' and a1<='Z':
  n = (ord(a1)-64) + a2 
else:
  n = (ord(a1)-96)+a2

if n<=26:
  n = n 
else:
  n = n%26

if a1>='A' and a1<='Z':
  n = n + 64
else:
  n = n + 96
print(chr(n))
