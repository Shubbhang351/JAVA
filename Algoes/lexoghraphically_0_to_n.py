def lexioCounting(curr,n):
    if curr > n:
        return
    else:
        print(curr)
        i = 0
        if curr == 0:
            i = 1
        while i <= 9:
            lexioCounting(curr * 10 + i,n)
            i += 1

if __name__ == "__main__":
    lexioCounting(0,1000)