a = [1,2,3,9,8,7,6,5,4,12,11,16,15]
a.sort()

i = 0
j = len(a) - 1
ans1 = []

while i < j:
    if (a[i] + a[j]) == 15:
        ans1.append([a[i],a[j]])
        i += 1
        j -= 1
    elif (a[i] + a[j]) < 15:
        i += 1
    else:
        j -= 1

for i in ans1:
    print(i)


print("\n-------------------\n")
ans = []
a = [1,2,3,9,8,7,6,5,4,12,11,16,15]
for i in range(len(a)):
    for j in range(i + 1,len(a)):
        if (a[i] + a[j]) == 15:
            ans.append([a[i],a[j]])

print(len(ans1) == len(ans))

for i in ans:
    print(i)

