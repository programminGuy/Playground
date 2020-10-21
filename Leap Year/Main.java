year = int(input())

if year % 400!=0 or year %4 != 0:
  print('NOT LEAP YEAR')
else:
  print("LEAP YEAR")