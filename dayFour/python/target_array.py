def findNumber(collections, target):
    numbers = []
        for count in range(len(collections)):
            if((collections[counter] + collections[count]) == target):
                numbers.append(counter)
                numbers.append(count)
                counter+=1
                count+=1
                break     
#            return collections
        return collections
#    return collections;

numbers = [8,6,12,4,-2]

print(findNumber(numbers,6))

def duplicate(numbers):
    count = 0
    for number in range(1,10):
    
