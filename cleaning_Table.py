t = int(input())

for i in range(t):
    n,m = map(int,input().split())
    c = [int(x) for x in input().split()]
    l = [0 for i in range(400)]
    
    for i in c:
        l[i - 1] += 1
      
    table = [0 for i in range(n)]
    ans = 0
    k = 1
    for i in range(len(c)):
        if k < n:
            table[k - 1] = c[i]
            l[c[i] - 1] -= 1
            ans += 1
            k += 1
        else:
            oo = []
            f = 0
            for j in range(len(table)):
                if c[i] == table[j]:
                    f = 1
                    break
                oo.append(l[table[j] - 1])
            
            if f == 1:
                continue

            p = oo.index(min(oo))
            table[p] = c[i]
            l[c[i] - 1] -= 1
            ans += 1
    print(ans)
