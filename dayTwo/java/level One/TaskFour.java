public class TaskFour{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = inputCollector.nextInt();

        System.out.print("Enter a number: ");
        int numberTwo = inputCollector.nextInt();

        System.out.printf("%d x %d = %d%n",numberOne, numberTwo, numberOne*numberTwo);

    }
}
