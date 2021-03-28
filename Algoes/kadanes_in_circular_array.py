def kadanes(a):
    res = a[0]
    ans = res
    for i in range(1,len(a)):
        res = max(a[i], res + a[i])
        if res > ans:
            ans = res
    return ans

def maxSumInCircularArray(a):
    # case 1 : CE are not wrapping {CE :- Contributing elements}

    CENonWrapping = kadanes(a)

    # case 2 : CE are wrapping.

    totalSum = sum(a)
    a = [-i for i in a]

    nonCESum = kadanes(a)

    CEWrapping = totalSum + nonCESum

    return max(CENonWrapping , CEWrapping)


if __name__ == '__main__':
    a = [8,-8,9,-9,10,-11,12]
    print(maxSumInCircularArray(a))
    