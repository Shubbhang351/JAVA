def coinChangeProblem(coins,V):
    coins.sort()
    m = len(coins) - 1
    ans = 0
    while m > -1:
        coinValue = coins[m]
        m -= 1
        maxAmount = (V // coinValue) * coinValue
        if maxAmount > 0:
            ans += V // coinValue
            V -= maxAmount
        
        if V == 0:
            break
    else:
        return -1
    return ans


print(coinChangeProblem([9,6,5,1],11))