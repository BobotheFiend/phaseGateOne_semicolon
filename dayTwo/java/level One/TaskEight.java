public class TaskEight{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();


        System.out.printf("The square of %d = %.0f", number, Math.pow(number,2));

    }
}
