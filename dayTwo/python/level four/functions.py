def add(number_one, number_two):
    return number_one + number_two

def even_checker(number):
    if(number % 2 == 0):
        return (f"{number} is Even")
    return (f"{number} is not Even")

def square(number):
    return number**2

def to_fahrenheit(celsius):
    converter = (celsius * 9/5) + 32
    return converter;

def prime_checker(number):
    if(number == 1):
        return false;
    for count in range(2, int(number**0.5)):
        if (number % count == 0):
            return False;
    return True;

def largest(number_one, number_two, number_three):
    largest = number_one
    
    if largest < number_two:
        largest = number_two
    
    if largest < number_three:
        largest = number_three

    return largest;

def simple_interest(principle, rate, time):
    convert_from_rate = rate/100;
    interest = (principle * convert_from_rate * time)//100
    return interest

def rectangle_area(length, width):
    return length * width

def reverse(number):
    to_string = str(number)[::-1]
    reversed_number = int(to_string)
    return reversed_number


print(add(2,2));
    
print(even_checker(9));

print(square(10));

print(to_fahrenheit(50));

print(prime_checker(3));

print(largest(33,55,4));

print(simple_interest(10000,10, 3));

print(rectangle_area(3,10));

print(reverse(4321));


 
