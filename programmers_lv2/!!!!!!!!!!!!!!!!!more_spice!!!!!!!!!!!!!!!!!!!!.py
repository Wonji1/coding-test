import heapq
scoville, K = [2, 1, 8, 9, 10, 12], 7

# heapq 를 쓰면 꺼내 쓰기 편하고 push하면 정렬해서 들어감
def solution(scoville, K):
    data = []
    for s in scoville:
        heapq.heappush(data, s)
    answer = 0
    while len(data) >0:
        if data[0] >= K:
            return answer
        a= heapq.heappop(data)
        if data != []:
            b =heapq.heappop(data)
            heapq.heappush(data,a + (b *2))
        answer +=1    
    return -1

print(solution(scoville,K))