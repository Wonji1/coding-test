A = [4, 4, 2, 5, 3, 4, 4, 4]
def solution(A):
    l_dic ={}
    r_dic = {}
    count = 0
    for i in A:
        if i in r_dic:
            r_dic[i] +=1
        else:
            r_dic[i] =1
    for j in range(len(A)):
        if A[j] in l_dic:
            l_dic[A[j]] +=1
        else:
            l_dic[A[j]] =1
        r_dic[A[j]] -= 1
        mx = max(l_dic.values())
        if mx == l_dic[A[j]]:
            idx = A[j]
        if l_dic[idx]> (j+1)/2 and r_dic[idx] > (len(A)-j-1)/2:
            count+=1
    return count

print(solution(A))