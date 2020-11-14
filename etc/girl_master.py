N, M = map(int, input().split())

team_member, member_team = {}, {}

for i in range(N):
    team_name, mem_num = input(), int(input())
    team_member[team_name] = []

    for j in range(mem_num):
        mem_name = input()
        team_member[team_name].append(mem_name)
        member_team[mem_name] = team_name

for a in range(M):
    name, q = input(), int(input())

    if q ==1:
        print(member_team[name])
    else:
        for mem in sorted(team_member[name]):
            print(mem)


