def binarySearch(arr, l, r, x): 

	while l <= r: 

		mid = l + (r - l) // 2; 
		
		# Check if x is present at mid 
		if arr[mid] == x: 
			return mid 

		# If x is greater, ignore left half 
		elif arr[mid] < x: 
			l = mid + 1

		# If x is smaller, ignore right half 
		else: 
			r = mid - 1
	
	# If we reach here, then the element 
	# was not present 
	return mid

t = int(input())

for test in range(t):
    n,k = map(int,input().split())
    l = [int(x) for x in input().split()]

    l.sort()
    c = [i for i in l]
    if sum(c) < 2 * k:
        print(-1)
        continue

    oo = k

    s = sum(c)

    ans = 0

    u = []

    while oo > 0:
        print(oo)
        if s > oo:
            a = binarySearch(c,0,len(c) - 1,oo)
            if c[a] >= oo:
                u.append(c[a])
                ans += 1
                c.pop(a)
                break
            else:
                oo = oo - c[a]
                s = s - c[a]
                u.append(c[a])
                c.pop(a)
                ans += 1

