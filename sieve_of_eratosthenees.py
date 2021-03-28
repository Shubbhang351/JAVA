import math

n = int(input())

primes = [True] * (n + 1)

primes[0],primes[1] = False,False

for i in range(2, int(math.sqrt(n)) + 1):
    if primes[i]:
        j = 2
        while i * j <= n:
            primes[i * j] = False
            j += 1

for i in range(len(primes)):
    if primes[i]:
        print(i)