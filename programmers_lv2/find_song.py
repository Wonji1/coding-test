m, musicinfos = 	"CC#BCC#BCC#BCC#B", ["03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"]

def solution(m, musicinfos):
    answer = ''
    dic = {}
    for i in range(len(musicinfos)):
        tmp =[]
        m = m.replace('C#', 'c')
        m = m.replace('D#', 'd')
        m = m.replace('F#', 'f')
        m = m.replace('G#', 'g')
        m = m.replace('A#', 'a')
        musicinfos[i] = musicinfos[i].replace('C#', 'c')
        musicinfos[i] = musicinfos[i].replace('D#', 'd')
        musicinfos[i] = musicinfos[i].replace('F#', 'f')
        musicinfos[i] = musicinfos[i].replace('G#', 'g')
        musicinfos[i] = musicinfos[i].replace('A#', 'a')
        j, count = 0,0
        musicinfos[i] = musicinfos[i].split(',')
        cnt = (int(musicinfos[i][1][:2]) - int(musicinfos[i][0][:2])) * 60 + (int(musicinfos[i][1][3:]) - int(musicinfos[i][0][3:]))
        musicinfos[i][3] = list(musicinfos[i][3])

        for _ in range(cnt):
            if j >= len(musicinfos[i][3]):
                j -= len(musicinfos[i][3])
            tmp.append(musicinfos[i][3][j])
            j+=1

        if m in ''.join(tmp):
            if cnt in dic:
                dic[cnt].append(musicinfos[i][2])
            else:
                dic[cnt] = [musicinfos[i][2]]


    if dic: 
        return dic[max(dic)][0]
    else:
        return '(None)'
print(solution(m,musicinfos))