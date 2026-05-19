
print(f"\nThe Sum of numbers")
sum_input = 0
user_input = int(input("Enter a number [input 0 to stop]:"))
if (user_input != 0):
    while(user_input != 0):
        sum_input += user_input
        user_input = int(input("Enter a number to get its sum: "))
        print(f"{user_input}", end= " + ")

print("=",sum_input)
