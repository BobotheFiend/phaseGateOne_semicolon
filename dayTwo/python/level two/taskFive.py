number = int(input("Enter a number: "))
number_two = int(input("Enter a Second Number: "))
number_three = int(input("Enter a Third Number: "))
largest = number

if(number_two > largest):
    largest = number_two
    print(f"The largest is {number_two}")
if(number_three > largest):
    largest = number_three
    print(f"The largest is {number_three}")
else:
    print(f"The largest is {number}")
