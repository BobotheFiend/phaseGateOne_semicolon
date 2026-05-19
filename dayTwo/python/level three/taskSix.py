number = int(input("Enter a number to get its sum: "))

print(f"\nThe Sum of {number}")
sum = 0
for count in range(number, 0, -1):
    sum += count
    print(f"{count}", end= " + ")

print("=",sum)
