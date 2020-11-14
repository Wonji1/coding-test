phone_book = 	["123", "456", "789"]

#phoneBook.sort(key=lambda x: len(x))
def solution(phone_book):
    for i in range(len(phone_book)):
        for j in range(len(phone_book)):
            if i != j and len(phone_book[i]) <=len(phone_book[j]):
                if phone_book[i] == phone_book[j][:len(phone_book[i])]:
                    return False
    
    return True

print(solution(phone_book))