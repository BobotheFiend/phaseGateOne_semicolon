number = int(input("Enter a number: "))
number_two = int(input("Enter a Second Number: "))

largest = number

if(number_two > largest):
    largest = number_two
    print(f"The largest is {number_two}")
else:
    print(f"The largest is {number}")
