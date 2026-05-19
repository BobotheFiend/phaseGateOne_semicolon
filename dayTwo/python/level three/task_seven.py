
print(f"\nThe Sum of 5 numbers")
sum = 0
for count in range(1, 5+1):
    number = int(input("Enter a number to get its sum: "))
    sum += number
    print(f"{number}", end= " + ")

print("=",sum)
