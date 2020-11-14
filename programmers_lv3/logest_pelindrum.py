s = "abcdcba"
def solution(s):
    answer = 0
    s=list(s)
    stack = []
    stack.append(s.pop(0))
    while s:
        cnt1, cnt2 = 0,0
        stack.append(s.pop(0))
        stack = stack[::-1]
        for i in range(len(stack)):
            if stack[:i+1] == s[:i+1]:
                cnt1 = (i+1) *2
        tmp = s[::-1]
        tmp.append(stack[0])
        tmp = tmp[::-1]
        for i in range(len(stack)):
            if stack[:i+1] == tmp[:i+1]:
                cnt2 = (i+1) *2 -1
        stack = stack[::-1]
        if answer < cnt1:
            answer = cnt1
        if answer < cnt2:
            answer = cnt2
    return answer

print(solution(s))