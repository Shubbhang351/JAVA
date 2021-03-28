import math
def binPower(a=1,b=1):
    res = 1
    while b > 0:
        if b & 1:
            res = res * a
        a = a * a
        b = b >>1
    return res

def modulo(a=1,b=1,m=1):
    a = a % m
    res = 1
    while b > 0:
        if b & 1:
            res = res * a % m
        a = a * a % m
        b = b >> 1
    return res

def root(a,b):
    return a**(b**-1)

def factor(a):
    odd = []
    even = []
    all = []
    for i in range(1,a + 1): 
        if a % i == 0:
            all.append(i)
            if i % 2 == 0:
                even.append(i)
            else:
                odd.append(i)
    print("all factors","length :-",len(all)," sum of all factor :-",sum(all))
    print(all)
    print("all even","length :-",len(even)," sum of all even :-",sum(even))
    print(even)
    print("all odd","length :-",len(odd)," sum of all odd  :-",sum(odd))
    print(odd)

def factorial(a):
    f = 1
    while a > 0:
        f = f * a
        a = a - 1
    print(f)
    s = str(f)
    c = 0
    for i in range(len(s) - 1,-1,-1):
        if s[i] == "0":
            c += 1
        else:
            break
    print("no. of trailing 0's :- ",c)


while True:
    print("\n")
    print("press 1 for a^b")
    print("press 2 for a ^ b % m")
    print("press 3 for a ^ (1 / b)")
    print("press 4 for Factors of a")
    print("press 5 for factorial of a")
    print("press 6 for 1 to n prime")
    print("\n")
    i = input("Enter your response : ")
    if i == "1":
        print("welcome to BinPower we find   a^b")
        a = int(input("Enter a : "))
        b = int(input("Enter b : "))
        print("\n-------------------------------\n")
        print(binPower(a,b))
        print("\n-------------------------------\n")
    elif i == "2":
        print("welcome to Modulo we find   a^b % m")
        a = int(input("Enter a : "))
        b = int(input("Enter b : "))
        m = int(input("Enter c : "))
        print("\n-------------------------------\n")
        print(modulo(a,b,m))
        print("\n-------------------------------\n")
    elif i == "3":
        print("welcome to root we find    a ^ (1 / b)")
        a = int(input("Enter a : "))
        b = int(input("Enter b : "))
        print("\n-------------------------------\n")
        print(root(a,b))
        print("\n-------------------------------\n")
    
    elif i == "4":
        print("welcome to factors we find    a ")
        a = int(input("Enter a : "))
        print("\n-------------------------------\n")
        factor(a)
        print("\n-------------------------------\n")
    elif i == "5":
        print("welcome to factorial we find    a!")
        a = int(input("Enter a : "))
        print("\n-------------------------------\n")
        factorial(a)
        print("\n-------------------------------\n")
    elif i == "6":
        print("welcome to 1 to n prime")
        
        n = input("Enter n : ")
        n = int(n)
        print("\n-------------------------------\n")
        for i in range(1,n + 1):
            for j in range(2,i):
                if i % j == 0:
                    break
            else:
                print(i,end=" ")
        print()
        print("\n-------------------------------\n")
    elif i not in "123":
        break
