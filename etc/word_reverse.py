S = input()
tmp, ans = "", ""
sp = False

for i in S:
    if i == " ":
        if sp == False:
            ans += tmp[::-1] + " "
            tmp = ""
        else:
            ans += " "
    elif i == "<":
        sp = True
        ans += tmp[::-1] + "<"
        tmp = ""
    elif i == ">":
        sp = False
        ans += ">"
    else:
        if sp == True:
            ans += i
        else:
            tmp += i

ans += tmp[::-1]

print(ans)
