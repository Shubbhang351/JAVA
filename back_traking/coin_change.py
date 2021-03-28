def coinChange(denom, amount, lastDenomIndex, ans):
    if amount == 0:
        print(ans)
        return

    for i in range(lastDenomIndex, len(denom)):
        if amount >= denom[i]:
            coinChange(denom, amount - denom[i], i, ans + str(denom[i]))

denom = [2,3,5]
amount = 7
lastDenomIndex = 0
ans = ''
coinChange(denom, amount, lastDenomIndex, ans)