public class TaskSeven{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = inputCollector.nextInt();

        double radiusSq = Math.pow(radius,2);

        double circumference = 2 * (Math.PI * radiusSq);
        System.out.printf("The Circumfrence of a circle  = %.02f", circumference);

    }
}
