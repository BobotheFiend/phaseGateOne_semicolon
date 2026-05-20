public class LevelFour{
    public static void main(String... args){

    System.out.println(add(2,2));
    
    System.out.println(evenChecker(9));

    System.out.println(square(10));

    System.out.println(toFahrenheit(50));

    System.out.println(primeChecker(9));

    System.out.println(largest(33,55,4));

    System.out.println(simpleInterest(10000,10, 3));

    System.out.println(rectangleArea(3,10));

    System.out.println(reverse(4321));

    System.out.println(countingWords("nnamdi"));


    }


    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static String evenChecker(int number){
        if(number % 2 == 0){
            String even = String.format("""
                %d is an Even number
                    """
                    ,number);
            return even;}
        return "Not Even";
    }   
    
    public static double square(int number){
        return Math.pow(number,2);
    }

    public static double toFahrenheit(double celsius){
        double converter = (celsius * 9/5) + 32;
        return Math.floor(converter);
    }

    public static boolean primeChecker(int number){

        int count = 2;
        for(;count <= number/2; count++){
    
            if(number % count == 0){
                return false;
            }
        }
        return true;
    }

    public static double largest(double numberOne, double numberTwo, double numberThree){
        double largest = numberOne;

        if (numberTwo > largest)
            largest = numberTwo;

        if (numberThree > largest)
            largest = numberThree;

        return largest;
    }

    public static double simpleInterest(double principle, double rate, double time){

        double convertFromeRate = rate/100;
        double simpInterest = (principle * convertFromeRate * time) / 100;
        return simpInterest;
    }

    public static double rectangleArea(double length, double width){
        return length * width;
    }

    public static int reverse(int number){
        int reversal = 0;
        int extractorHolder = 0;
        int extractor = 0;
        int pointToNumber = 0;

        while(number != 0){

            extractor = number % 10;
            extractorHolder = (extractorHolder * 10 ) + extractor;

            number /= 10;
        }

        return extractorHolder;
    }

    public static int countingWords(String word){
        int wordCounter = 0;        
        int count = 0;
        for(;count < word.length(); count++){
            char target = 'n';
            if (word.charAt(count) == target)
                wordCounter++;
        }
        return wordCounter;
    }
}
