bridge_length, weight, truck_weights = 100 ,10, [10,10,10,10,10,10,10,10,10,10]

def solution(bridge_length, weight, truck_weights):
    answer, ck = 0, 0
    first_tw = len(truck_weights)
    across, across_ing = [], [0] *bridge_length
    truck_weights = truck_weights[::-1]
    while len(across) != first_tw:
        if across_ing and across_ing[0] ==0:
            del across_ing[0]
        else: 
            across.append(across_ing[0])
            del across_ing[0]
        if across_ing:
            if across_ing and truck_weights and sum(across_ing) + truck_weights[-1] <= weight:
                across_ing.append(truck_weights.pop())
            else:
                across_ing.append(0)
        answer +=1

    return answer
