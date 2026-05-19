public class TaskTen{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = inputCollector.nextInt();

        System.out.print("Enter a number: ");
        int numberTwo = inputCollector.nextInt();

        System.out.print("Enter a number: ");
        int numberThree= inputCollector.nextInt();

        double average = (double)(numberOne + numberTwo + numberThree) / 3;

        System.out.printf("The avearge = %.02f", average);

    }
}
