l = [int(x) for x in input().split()]

res = l[0]

start = [0 for i in range(len(l))]

ans = res

end = 0

for i in range(1,len(l)):

    if l[i] + res >= l[i]:
        start[i] = start[i - 1]
    else:
        start[i] = i

    res = max(l[i] , res + l[i])

    if res > ans:
        end = i
        ans = res
print(start)

print(ans)