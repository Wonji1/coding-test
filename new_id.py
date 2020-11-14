import re
# 대문자 --> 소문자
# 소문자, 숫자, 빼기, 밑줄, 마침표   - _ . 제외 다 삭제
# 마침표 두개 이상 --> 한개
# 마침표 처음 or 끝 --> 제거
# 빈 문자열 --> a 대입
# 16 이상은 제거 15번째가 . 일경우 제거
# 2 이하면 마지막 문자 복사
new_id = input()

def is_sp(tmp):
    ret = re.compile('[^a-z0-9-_.]')

    return ret.sub('',tmp)

def many_one(tmp):
    for i in range(1,len(tmp)):
        if i>= len(tmp): return tmp
        while tmp[i] =='.' and tmp[i-1] == '.':
            tmp = tmp[:i-1] + tmp[i:]
            if i>= len(tmp): break
    return tmp

def solution(new_id):
    answer, tmp = '', ''
    #소문자로 변환
    tmp = new_id.lower()
    #소문자, 숫자, 뺴기, 밑줄, 마침표 확인
    tmp = is_sp(tmp)
    #마침표 한개로 바꾸기
    tmp = many_one(tmp)
    #마침표 첫 끝
    if tmp:
        if len(tmp) == 1 and tmp[0] == '.': tmp = ''
        else:
            if tmp[0] == '.': tmp =tmp[1:]
            if tmp[-1] == '.': tmp = tmp[:-1]
    #빈 문자열 a 대입
    if not tmp: tmp = 'a'
    #16 이상은 제거
    if len(tmp) >=16: tmp = tmp[:15]
    if tmp[-1] == '.': tmp = tmp[:14]
    if len(tmp) <=2:
        while len(tmp) != 3:
            tmp += tmp[-1]
    answer = tmp

    return answer

print(solution(new_id))