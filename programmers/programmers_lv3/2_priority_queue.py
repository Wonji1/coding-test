operations = ['I 1', 'I 2', 'I 3', 'I 4', 'I 5', 'I 6', 'I 7', 'I 8', 'I 9', 'I 10', 'D 1', 'D -1', 'D 1', 'D -1', 'I 1', 'I 2', 'I 3', 'I 4', 'I 5', 'I 6', 'I 7', 'I 8', 'I 9', 'I 10', 'D 1', 'D -1', 'D 1', 'D -1']
import heapq
def solution(operations):
    heap = []
    for i in operations:
        a = i.split(' ')
        if a[0] == 'I':
            heapq.heappush(heap,int(a[1]))
        else:
            if heap:
                if a[1] == '-1':
                    heapq.heappop(heap)
                else:
                    heap.pop(heap.index(max(heap)))
    if not heap:
        return [0,0]
    return [max(heap),min(heap)]

print(solution(operations))