test = int(input())
for i in range(test):
  t, p = map(int, input().split())
  if t >= p:
    print(1)
  else:
    PA = p//t
    PB = PA + 1
    TB = p%t
    TA = t - TB
    fact = [1,1]
    for i in range(2, p+2):
      fact.append(i * fact[i-1]) 
    noOfDividing = fact[p] // ((fact[PA]**TA) * (fact[PB]**TB) * fact[TA] * fact[TB])
    if PB >= 4:
      noOfArrangement = int(noOfDividing*(fact[PA-1]/2) ** TA * (fact[PB - 1]/2)** TB)
    else:
      noOfArrangement = noOfDividing
      
    print(noOfArrangement)
    
    
 