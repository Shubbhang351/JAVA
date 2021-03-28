# find no. of triangles form from the elements of an unsorted array
# Input :- [3,5,4]
# output :- 1
# 
# Input :- [6,4,9,7,8]
# output :- 10 
def noOfTriangles(a):
    a.sort()
    count = 0
    for i in range(len(a) - 1,-1,-1):
        l = 0
        r = i - 1
        while l < r:
            if a[l] + a[r] > a[i]:
                count += r - l
                r -= 1
            else:
                l += 1
    return count

if __name__ == '__main__':
    a = [6,4,9,7,8]
    print(noOfTriangles(a))