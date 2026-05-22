def findNumber(collections, target):
    numbers = []
#    counter = 0
    for count in range(len(collections)):
        for counter in range(count+1, len(collections)):
            if((collections[count] + collections[counter]) == target):
#                numbers.append(counter)
#                numbers.append(count)
                return [collections[count], collections[counter]]
#                counter+=1     
#            return collections
        return numbers

numbers = [8,6,12,4,-2]

print(findNumber(numbers,6))

def duplicate(numbers):
#    count = 0
    output = []
    for number in numbers:
        if (number not in output):
            output.append(number)
    return output

#numbers = [9,5,1,9,4,5,1,7]
#print(duplicate(numbers))

def letter(animals):
    new_list = []
    nu_consonants = []
    vowels = ["a","e","i","o","u"]
    for word in animals:
        for letters in vowels:
            if letters in word and word not in new_list:
                new_list.append(word) 
                break
            else:
                nu_consonants.append([word])
                break
            
    return new_list

animals = ["fly","bug","ant"]
print(letter(animals))
