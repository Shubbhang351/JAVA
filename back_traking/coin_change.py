def coinChangeCombination(denom, amount, lastDenomIndex, ans):
    if amount == 0:
        print(ans)
        return

    for i in range(lastDenomIndex, len(denom)):
        if amount >= denom[i]:
            coinChangeCombination(denom, amount - denom[i], i, ans + str(denom[i]))

def coinChangePermutation(denom, amount, ans):
    if amount == 0:
        print(ans)
        return
    
    for i in range(len(denom)):
        if denom[i] <= amount:
            coinChangePermutation(denom, amount - denom[i] , ans + str(denom[i]))

denom = [2,3,5]
amount = 7
lastDenomIndex = 0
ans = ''
coinChangeCombination(denom, amount, lastDenomIndex, ans)
print("----------------")
coinChangePermutation(denom, amount, ans)