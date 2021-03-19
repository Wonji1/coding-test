files = ['img12.png', 'img10.png', 'img02.png', 'img1.png', 'IMG01.GIF', 'img2.JPG']

# 문자열 .replace(바꿀단어, 뭐로바꿀지, 몇개바꿀지(앞에서부터))
def solution(files):
    answer, tmp = [], []
    files = [(v,i) for i, v in enumerate(files)]
    for i in files:
        a,head, number, tail ='','','',''
        for h in range(len(i[0])):
            if i[0][h].isdecimal():
                head = i[0][:h]
                a = i[0].replace(head,'',1)
                break
        for n in range(len(a)):
            if not a[n].isdecimal():
                number = a[:n]
                tail = a.replace(number,'',1)
                break
        if a == '': head = i
        if tail == '': number = a
        tmp.append([head.lower(),(int(number)),i[1]])
        tmp.sort()
    for t in tmp:
        answer.append(files[t[2]][0])
    return answer

print(solution(files))