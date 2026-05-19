public class TaskFive{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter the tempreature in celcius: ");
        double celsius = inputCollector.nextInt();

        double conversion = (celsius * 9/5) + 32;
        System.out.printf("%.0f * = %.02f f%n",celsius, conversion);

    }
}
