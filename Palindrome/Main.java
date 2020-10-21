n = input()
lst1 = list(n)
lst2 = list(n)
lst2.reverse()

if lst1 == lst2:
  print('Palindrome')
else:
  print('Not a Palindrome')