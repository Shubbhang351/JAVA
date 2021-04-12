def numDecodings(s: str) -> int:
        for j in range(len(s)):
            if s[j] != '0':
                s = s[j:]
                break
        print(s)
        if len(s) > 0:
            
            return solve(s,0)
        return 0

def solve(s,i):
        if s[i] == '0':
            print(">>>")
            return 0
        elif i >= len(s) - 1:
            return 1
        else:
            l = 0
            r = 0
            if int(s[i]) in range(1,27):
                if i + 1 >= len(s):
                    l = 1
                else:
                    l = solve(s,i + 1)
            if int(s[i] + s[i + 1]) in range(1,27):
                if i + 2 >= len(s):
                    r = 1
                else:
                    r = solve(s,i + 2)
            return l + r

s = "226"
print(numDecodings(s))