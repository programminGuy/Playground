s = input()
lst = list(s)
rlst =list(s)
rlst.reverse()

if lst == rlst:
  print(s+' is a palindrome')
else:
  print(s+' is not a palindrome')