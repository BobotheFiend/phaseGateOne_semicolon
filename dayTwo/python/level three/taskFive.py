number = int(input("Enter a number to get its factorial: "))

print(f"\nThe factorial of {number}")
factorial = 1
for count in range(number, 0, -1):
    factorial *= count
    print(f"{count} ", end= " x ")
#    print (factorial)

print("=",factorial)
