try:
  test = int(input())
  if test > 0:
    for i in range(test):  
      f, b, t, d =  map(int, input().split())
      currpos= 0
      timere = 0
      count = 0
      ans = 0
      remainDis = 0
      if (f>=b or d==0 or t ==0) :
        print("Cannot park")
      else:
        while(1):
          if((currpos + b)<d):
            currpos = currpos + b
          else:
            remainDis = d - currpos
            timere = remainDis * t
            break
          currpos = currpos - f
          count +=1
        ans = count * (f+b) * t + timere
        print(ans)
  else:
    print("Invalid test case")
except:
  print("Invalid test case")
    