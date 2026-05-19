public class TaskSix{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter a length: ");
        double length = inputCollector.nextInt();

        System.out.print("Enter a width: ");
        double width = inputCollector.nextInt();

        System.out.printf("The area of the Rectangle = %.02f", length*width);

    }
}
