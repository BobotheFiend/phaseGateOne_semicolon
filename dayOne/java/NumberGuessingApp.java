public class NumberGuessingApp{
    public static void main (String... args){

        java.util.Random shuffler = new java.util.Random();
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("How many questsion do you want to guess: ");
        int session = inputCollector.nextInt();

        int answer = 0;
        int count = 1;
        int correctScore = 0;
        int oneTime = 0;
        int twoTries = 0;
        int threeTries = 0;
        int fourTries = 0;
        int fiveTries = 0;
        while(count < session){
            
            int question = 1 + shuffler.nextInt(100)+1;

            answer = question;

            System.out.printf("-----------------------------Game %d-----------------------------%n%n", count);
            System.out.println("Guess the number :) .... ");
        
        
     System.out.print("Enter your Guess....  ");
     int userAttempts = inputCollector.nextInt();
     if (userAttempts < 0 && userAttempts > 100){
        System.out.println(" This number is out of Guess Range!");
     }

        if (userAttempts == answer){
            count++;
            correctScore++;
            oneTime++;
        }
        else{
            if(userAttempts > answer){
                System.out.print("Wrong Guess!\nThe number is lower than that.. Guess Again\nEnter your Guess....  ");
                userAttempts = inputCollector.nextInt();

                 if (userAttempts < 0 && userAttempts > 100){
        System.out.println(" This number is out of Guess Range!");
                 }

                    if(userAttempts == answer){
                    count++; correctScore++; twoTries++;
                    }
            }

                else{
                  if(userAttempts > answer){        
                    System.out.print("Wrong Guess!\nThe number is lower than that.. Guess Again\nEnter your Guess....  ");
                    userAttempts = inputCollector.nextInt();

                    if (userAttempts < 0 && userAttempts > 100){
                    System.out.println(" This number is out of Guess Range!");
                    }

                    if(userAttempts == answer){
                    count++;
                    correctScore++;
                    threeTries++;
                    }
                 }
                    else{
                       if(userAttempts < answer){
                          System.out.print("Wrong Guess!\nThe number is Higher than that.. Guess Again\nEnter your Guess....  ");
                          userAttempts = inputCollector.nextInt();

                         if (userAttempts < 0 && userAttempts > 100){
                          System.out.println(" This number is out of Guess Range!");
                         }
                         if(userAttempts == answer){
                           count++; correctScore++; fourTries++;
                         }

                         else{
                            if(userAttempts > answer){        
                            System.out.print("Wrong Guess!\nThe number is lower than that.. Guess Again\nEnter your Guess....  ");
                            userAttempts = inputCollector.nextInt();

                            if (userAttempts < 0 && userAttempts > 100){
                            System.out.println(" This number is out of Guess Range!");
                            }

                            if(userAttempts == answer){
                              count++;
                              correctScore++;
                              fourTries++;
                            }
                            
                            else{
                                  if(userAttempts < answer){
                                  System.out.print("Wrong Guess!\nThe number is Higher than that.. Guess Again\nEnter your Guess....  ");
                                  userAttempts = inputCollector.nextInt();

                                    if (userAttempts < 0 && userAttempts > 100){
                                        System.out.println(" This number is out of Guess Range!");
                                    }
                                 if(userAttempts == answer){
                                   count++; correctScore++; fiveTries++;
                                 }
                                if(userAttempts > answer){        
                                System.out.print("Wrong Guess!\nThe number is lower than that.. Guess Again\nEnter your Guess....  ");
                                userAttempts = inputCollector.nextInt();

                                if (userAttempts < 0 && userAttempts > 100){
                                System.out.println(" This number is out of Guess Range!");
                                }

                                if(userAttempts == answer){
                                    count++;
                                    correctScore++;
                                    fiveTries++;
                                }
                                else{
                                    System.out.println("Wrong Guesses\n To Next One...");
                                    count++;
                                }
                             }
                    else{
                       if(userAttempts < answer){
                          System.out.print("Wrong Guess!\nThe number is Higher than that.. Guess Again\nEnter your Guess....  ");
                          userAttempts = inputCollector.nextInt();

                         if (userAttempts < 0 && userAttempts > 100){
                          System.out.println(" This number is out of Guess Range!");
                         }
                         if(userAttempts == answer){
                           count++; correctScore++; threeTries++;
                         }

                    }
                     
                    else{
                       if(userAttempts < answer){
                          System.out.print("Wrong Guess!\nThe number is Higher than that.. Guess Again\nEnter your Guess....  ");
                          userAttempts = inputCollector.nextInt();

                         if (userAttempts < 0 && userAttempts > 100){
                          System.out.println(" This number is out of Guess Range!");
                         }
                         if(userAttempts == answer){
                           count++; correctScore++; threeTries++;
                         }

                    }

              else{
                  if(userAttempts < answer){
                    System.out.print("Wrong Guess!\nThe number is Higher than that.. Guess Again\nEnter your Guess....  ");
                    int userAttempts = inputCollector.nextInt();
                  
                     if (userAttempts < 0 && userAttempts > 100){
                      System.out.println(" This number is out of Guess Range!");
                     }

                   if(userAttempts == answer){
                     count++; correctScore++; twoTries++;
                   }
                   else{
                        if (userAttempts > answer){
                         System.out.print("Wrong Guess!\nThe number is lower than that.. Guess Again\nEnter your Guess....  ");
                         userAttempts = inputCollector.nextInt();
                        
                        i
                        }
                    }

              } 
     
        }
    }
}
