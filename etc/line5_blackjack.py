cards = [1, 4, 10, 6, 9, 1, 8, 13]

def solution(cards):
    answer = 0
    dealer, player, showcard = 0, 0, 0
    for i in range(len(cards)):
        if cards[i] >= 11: cards[i] = 10
    while len(cards) >=0:
        if len(cards)>=4:
            player = cards[0] + cards[2]
            dealer = cards[1] + cards[3]
            if (cards[0] ==1 or cards[2] ==1) and player +10 <=21: player += 10
            if (cards[1] ==1 or cards[3] ==1) and dealer +10 <=21: dealer += 10
            
            showcard = cards[3]
            del cards[0:4]
            if player ==21 :
                answer += 2
                continue
            while player<21:
                if player == 21: answer += 3
                elif player > 21:
                    answer -= 2
                    break
                else:
                    if (showcard == 1 or showcard == 7) and player < 17:
                        player += cards[0]
                        if cards[0] == 1 and player + 10 <=21: player += 10
                        del cards[0]
                    elif showcard == 4 or showcard == 5 or showcard == 6: break
                    elif (showcard == 2 or showcard == 3) and player <12: 
                        player += cards[0]
                        del cards[0]
                    else: break
                    if player > 21:
                        answer -= 2
            while dealer < 17:
                dealer += cards[0]
                if dealer == 21: answer -= 3
                elif dealer > 21:
                    answer += 2
                    break
            print(dealer)
            print(player)
            if dealer > player: answer -=2
            elif dealer < player: answer +=2
                
        else: break
    return answer

print(solution(cards))