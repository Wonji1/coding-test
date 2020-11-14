n, fast , direction = 6, ['B','C'] , [3,-2]
def solutuon(n,fast,direction):
    circle = [[chr(66+i),0] for i in range(n-1)]
    sul = ['A',1]
    stop = 0
    for i in range(len(direction)):
        if circle[stop+direction[i]][0] not in fast:
            circle[stop+direction[i]], sul = sul, circle[stop+direction[i]]
            sul[1] +=1
            
        else:
            sul[1] +=1
        
        stop += direction[i]
        if stop <0:
            while stop<0:
                stop+=5
        else:
            stop = stop %5
    return circle

print(solutuon(n,fast,direction))