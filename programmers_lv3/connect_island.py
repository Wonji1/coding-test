n, costs = 4, [[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]

def solution(n, costs):
    # kruskal algorithm
    ans = 0
    costs.sort(key = lambda x:x[2])
    route = set([costs[0][0]])

    while len(route) != n:
        for i, cost in enumerate(costs):
            if cost[0] in route and cost[1] in route:
                continue
            if cost[0] in route or cost[1] in route:
                ans += cost[2]
                route.update([cost[0],cost[1]])
                costs[i] = [-1,-1,-1]
    return ans

print(solution(n,costs))