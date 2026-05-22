import java.util.ArrayList;
public class TargetArray{


    public static int [] numberToAdd(int [] collections, int target){

//        target = 6

            ArrayList<Integer> outputArray = new ArrayList<Integer> ();
            int firstNumber = 0;
            int secondNumber = 0;
            int counter;
            for(counter = 0; counter < collections.length; counter++){
                    int index;
//                for(index = 0; index < counter; index++){
                    int count;
                    for(count = counter + 1; count < collections.length; count++){
//                    collections[index] + collections[count];
                       index = counter;
                       if((collections[index] + collections[count]) == target){
                     outputArray.add(collections[index]);
                     outputArray.add(collections[count]);
//                        System.out.printf("%d  %d   %d  %d\n", collections[index], collections[count], count, index);
//
//                    System.out.printf("%d    %d", collections[counter], collections[++counter]);
                            continue;
                        }
                    }

//                    if(count > secondNumber){
//                        secondNumber = count;
//                          collections[index] = collections[count];
//                        collections[index] = collections[secondNumber];
//                                            System.out.printf("%d  %d   %d  %d\n", collections[index], collections[secondNumber], count, index);
//                    }
//                }
//                if(index > firstNumber){
//                    firstNumber = index;
//                    collections[counter] = collections[firstNumber];
//                }
//                          collections[count] = collections[index];
            }
            int [] collectionsOutput = new int [outputArray.size()];

            int counting = 0;
            for(;counting < collectionsOutput.length; counting++){
                collectionsOutput[counting] = outputArray.get(counting);            
                    
            }
//            System.out.println(outputArray);
//            ArrayList<Integer> collectionsOutput = new ArrayList<Integer> ();
//            for(int num : collections){
//                collectionsOutput.add(num);
//            }
//        
//            System.out.println(collectionsOutput);
//            return outputArray;
              return collectionsOutput;
    }


    public static int [] duplicates(int [] collections){
        int count = 1;
        int highest = 0;
        ArrayList<Integer> output = new ArrayList<Integer> ();
        for(;count < collections.length; count++){
            int appear;
            for(appear = 0; appear < highest; appear++){
//                collections[count] = collections[appear];
                if(collections[appear] == collections[count]){
                    break;
                }
            }
            if (appear == highest){
//            highest = appear;
            collections[highest++] = collections[count];
            output.add(collections[count]);
            }
        }
        
        int [] collectionsOutput = new int [output.size()];

        int counter =0;
        for(;counter < collectionsOutput.length; counter++){
              collectionsOutput[counter] = output.get(counter);      
        }
            return collectionsOutput;
    }

    public static String [][] items(String [] animals){

        ArrayList<String> vowelsList = new ArrayList<String> ();
        ArrayList<String> consonants = new ArrayList<String> ();

        String vowels = "aeiou";
        for(String words : animals){
            int letter;
            for(letter = 0; letter < vowels.length(); letter++){
                if(words.toLowerCase().contains(vowels) ==  vowels.charAt(letter)){
                    vowelsList.add(words);
                }
                else{
                     consonants.add(words);         
                    }
            }
        }
           String [][] animalsOutput = new String [vowelsList.size()][consonants.size()];
            
            int count = 0;
            for(;count < vowelsList.size(); count++){
                String [][] animalsOutput = vowelsList.get(count);
                for(int counter = 0; counter < consonants.size();counter++){
                    animalsOutput[count][counter] = vowelsList.get(count) + consonants.get(count);                
                } 
            }
            return animalsOutput;
    }

}

