def solve(s1,s2):
    s3 = ""
    s4 = ""
    t = 0
    for i in range(len(s1) - 1, - 1, -1):
        if s1[i] == '#':
            t += 1
        else:
            if t > 0:
                t -= 1
            else:
                s3 = s1[i] + s3
    t = 0
    for i in range(len(s2) - 1, - 1, -1):
        if s2[i] == '#':
            t += 1
        else:
            if t > 0:
                t -= 1
            else:
                s4 = s2[i] + s4
    print(s3)
    print(s4)

s1 = input()
s2 = input()
solve(s1,s2)

"""
'#' refers to backspace

input :- a1 = 'a##bc' , a2 = 'd#g#c'
output :- true
exp :- a1 become 'c' and a2 also become 'c'

"""