
   


def myPrint(l):
    print("---------------------")
    for i in range(len(l)):
        for j in range(len(l[i])):
            print(l[i][j],end=" ")
        print()
    print("---------------------")

n,m = map(int,input().split())
l = []
for i in range(n):
    col = [int(x) for x in input().split()]
    l.append(col)

s = [[0 for i in range(m)] for j in range(n)]
oo = [[0 for i in range(m)] for j in range(n)]

aa =[]
for i in range(len(l)):
    for j in range(len(l[i])):
        if l[i][j] == 2:
            aa.append([i,j])
            s[i][j] = 0
        elif l[i][j] == 1:
            s[i][j] = float('inf')
        else:
            s[i][j] = 'x'

myPrint(l)
myPrint(s)

print(aa)

for i in range(len(aa)):
    a = aa[i][0]
    b = aa[i][1]
    s[a][b] = 0
    solve(a,b,l,s,oo,s[a][b],n,m)

myPrint(s)