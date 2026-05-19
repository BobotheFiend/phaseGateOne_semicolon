year_input = int(input("Enter a year: "))


if(year_input % 4 == 0 or year_input % 400 == 0):
    print(f"{year_input} is a Leap year!")

else:
    print(f"{year_input} Not a Leap year!")
