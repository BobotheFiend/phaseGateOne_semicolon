user_number = int(input("Enter a Score: "))

if(user_number >= 50 and user_number <= 100):
    print(f"{user_number} Student passed!")
elif(user_number >= 0 and user_number < 50):
    print(f"{user_number} Student Failed!")
else:
    print("Invalid Grade Score!")

