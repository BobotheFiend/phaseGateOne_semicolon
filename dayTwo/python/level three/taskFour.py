number = int(input("Enter a number to see it's multiplication table\nEnter number: "))

print("----------------------{number}Multiplication Table----------------------\n")
for count in range(1,12+1):
    multiplication = number * count
    print(f"\t\t{number}\t x \t{count}\t = \t{multiplication}")
