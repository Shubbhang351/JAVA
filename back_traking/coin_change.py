def coinChange_Combination_amount_respect(denom, amount, lastDenomIndex, ans):
    if amount == 0:
        print(ans)
        return

    for i in range(lastDenomIndex, len(denom)):
        if amount >= denom[i]:
            coinChange_Combination_amount_respect(denom, amount - denom[i], i, ans + str(denom[i]))

def coinChangePermutation(denom, amount, ans):
    if amount == 0:
        print(ans)
        return
    
    for i in range(len(denom)):
        if denom[i] <= amount:
            coinChangePermutation(denom, amount - denom[i] , ans + str(denom[i]))



def coinChange_Combination_coin_respect(denom, amount, i, ans):
    # positive base case
    if amount == 0:
        print(ans)
        return
    
    # negative base case
    if amount < 0 or i >= len(denom):
        return
    
    # current (i th) coin can contribute in amount
    coinChange_Combination_coin_respect(denom, amount - denom[i], i, ans + str(denom[i]) + ' ')

    # current (i th) coin can not contribute in amount
    coinChange_Combination_coin_respect(denom, amount, i + 1, ans)

    

denom = [2,3,5]
amount = 7
lastDenomIndex = 0
ans = ''
coinChange_Combination_amount_respect(denom, amount, lastDenomIndex, ans)
print("----------------")
coinChangePermutation(denom, amount, ans)
print("\n------------\n")
coinChange_Combination_coin_respect(denom, amount, 0, "")