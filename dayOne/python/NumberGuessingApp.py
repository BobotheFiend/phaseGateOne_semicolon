import random
session = int(input("Enter the number of times you want to guess: "))

count = 1
correct_Guess = 0
#second_guess = 0
trial = 1;
while(count < session):
    guess = random.randint(1,100)
    answer = guess
    print(answer)
    print(f"---------------------------Guess {count}---------------------------\n\n")
    user_guess = int(input("Guess the number?... "))

    if (user_guess == answer):
        correct_Guess +=1
    else:
        while((user_guess != answer) and (trial <= 5)):
            trial+=1
            if(user_guess < answer):
                user_guess = int(input("Wrong Guess!\nThe number is Higher than that.. Guess Again\nGuess the number?... "))
                if (user_guess == answer):
                    count+1
                    correct_Guess +=1

            else:
                if(user_guess > answer):
                    user_guess = int(input("Wrong Guess!\nThe number is Lower than that.. Guess Again\nGuess the number?... "))
                    if(user_guess == answer):
                        count+=1
                        correct_Guess+=1
       
    count+=1
if (trial == 1):
    print("Lengendary")
elif(trial == 2):
    print("Excellent")
elif(trial >= 3 and trial <= 4):
    print("Good")
elif(trial == 5):
    print("Close")
else:
    print("No win = Better Luck Next Time!!")


