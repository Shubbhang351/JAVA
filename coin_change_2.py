def findMin(V,deno):
	
	# All denominations of Indian Currency
	
	n = len(deno)
	
	# Initialize Result
	ans = []

	# Traverse through all denomination
	i = n - 1
	while(i >= 0):
		
		# Find denominations
		while (V >= deno[i]):
			V -= deno[i]
			ans.append(deno[i])

		i -= 1

	# Print result
	for i in range(len(ans)):
		print(ans[i], end = " ")

l = [1,5,2,5,1]
l.sort()
n = 3
findMin(n,l)