s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"

def solution(s):
    answer = []
    a = s[2:-2].replace('},{', '-').split('-')
    a.sort(key = len)
    for i in range(len(a)):
        b = a[i].split(',')
        for j in range(len(b)):
            if int(b[j]) not in answer:
                answer.append(int(b[j]))
    return answer

print(solution(s))