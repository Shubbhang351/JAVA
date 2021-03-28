t = int(input())

for i in range(t):
    n1,n2,m = map(int,input().split())
    l = [0 for i in range(m)]
    ans = 0
    while n1 != 0 or n2 != 0:
        minEle = min(n1,n2)
        if minEle >= m:
            oo = 0
            for i in range(m - 1,-1,-1):
                if l[i] == 0:
                    oo = i + 1
                    l[i] = 1
                    break
            else:
                break
            n1 -= oo
            n2 -= oo
        else:
            oo = 0
            for i in range(minEle - 1,-1,-1):
                if l[i] == 0:
                    oo = i + 1
                    l[i] = 1
                    break
            else:
                break
            n1 -= oo
            n2 -= oo
    print(n1+n2)


