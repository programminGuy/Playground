s1 = input()
s2 = input()
s3 = input()
s1 = s1.strip()
s2 = s2.strip()
sl1 = list(s1)
sl2 = list(s2)
s2 = s2.strip()
vowel = ['a','i','o','u','e', 'A', 'E', 'I', 'O','U']
for i in range(len(sl1)):
  if sl1[i] in vowel:
    sl1[i] = '$'
for i in range(len(sl2)):
  if sl2[i] not in vowel:
    sl2[i] = '#'
    
if(s3.lower()):
  s3.upper()
res = ''.join([str(ele) for ele in sl1])
res2 = ''.join([str(ele) for ele in sl2])

print(res+res2,end='')
print(s3.upper())