n,results = 5,	[[4, 3], [4, 2], [3, 2], [1, 2], [2, 5]]
def solution(n, results):
    answer = 0
    wins, loses = {},{}
    for i in range(1,n+1):
        wins[i] = set()
        loses[i] = set()
    for a,b in results:
        wins[a].add(b)
        loses[b].add(a)
    for i in range(1,n+1):
        for loser in wins[i]:
            loses[loser].update(loses[i])
        for winner in loses[i]:
            wins[winner].update(wins[i])
    for i in range(1,n+1):
        if len(wins[i]) + len(loses[i]) == n-1:
            answer +=1
    return answer

print(solution(n,results))