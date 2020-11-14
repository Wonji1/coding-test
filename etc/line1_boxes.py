boxes = [[1, 2], [2, 1], [3, 3], [4, 5], [5, 6], [7, 8]]
def solution(boxes):
    answer = 0
    boxes.sort()
    ans_tmp = [[0 for _ in range(2)] for _ in range(len(boxes)+1)]
    for i in range(len(boxes)-1):
        for j in range(len(boxes)):
            if boxes[i][0] != boxes[i][1] and boxes[j][0] != boxes[j][1] and boxes[i][0] == boxes[j][1]:
                boxes[i][1], boxes[j][1] = boxes[j][1], boxes[i][1]
  
    for i in range(len(boxes)):
        if boxes[i][0] != boxes[i][1]:
            answer += 1
    return answer

print(solution(boxes))