public class TaskTwo{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter your age to know how old you'll be in fives years time\nEnter age: ");
        int age = inputCollector.nextInt();

        System.out.printf("You'll be %d in five years time!%n", age+5);

    }
}
