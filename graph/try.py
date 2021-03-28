# t = int(input())
# for i in range(t):
#     x,y,n = map(int,input().split())
#     i = 0
#     d = 0
#     while i < n:
#         i += x
#         if i >= n:
#             d += 1
#             break
#         d += 1
#         i -= y
#     print(d)

def foo(x):
    x[0] = ['def']
    x[1] = ['abc']
    return id(x)

a = 15
print(format("hello","10s"),end='&')