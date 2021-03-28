import re

s = input()

s = re.sub("([\\w])\\1+",r'\1',s)
print(s)