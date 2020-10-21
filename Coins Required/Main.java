n = int(input())
fiveCoin = int((n-4)/5)

if (n-(fiveCoin*5)) % 2== 0:
    oneCoin = 2
else:
    oneCoin = 1

twoCoin = int((n -5*fiveCoin - oneCoin)/2)
total = oneCoin + twoCoin + fiveCoin

print(total,fiveCoin,twoCoin,oneCoin)
