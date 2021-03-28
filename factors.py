import re

a = "010101010"
for match in re.finditer("010",a):
    print(match.start(),"<--->",match.end())
    