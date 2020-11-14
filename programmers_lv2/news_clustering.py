str1, str2 = 'handshake', 'shake hands'

def solution(str1, str2):
    answer = 0
    str1, str2  = str1.lower(), str2.lower()
    str1_tmp, str2_tmp= [], []
    for i in range(1, len(str1)):
        if ord(str1[i]) < 97 or ord(str1[i]) > 122 or ord(str1[i-1]) < 97 or ord(str1[i-1]) > 122:
            continue
        else:
            str1_tmp.append(str1[i-1]+str1[i])
    for j in range(1, len(str2)):
        if ord(str2[j]) < 97 or ord(str2[j]) > 122 or ord(str2[j-1]) < 97 or ord(str2[j-1]) > 122:
            continue
        else:
            str2_tmp.append(str2[j-1]+str2[j])
    if len(str1_tmp) == 0 and len(str2_tmp) == 0:
        return 65536
    else:
        hap = str1_tmp[::]
        hap2 = str1_tmp[::]
        for k in str2_tmp:
            if k in hap2:
                hap2.remove(k)
            else:
                hap.append(k)
        hap = len(hap)
        gyo = len(str1_tmp + str2_tmp) - hap

    return int((gyo / hap) * 65536)

print(solution(str1, str2))