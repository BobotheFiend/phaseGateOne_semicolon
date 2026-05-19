public class TaskOne{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Hello friend! I want to know mpore about you\nWhat is your name: ");
        String name = inputCollector.nextLine();

        System.out.printf("Welcome! %s%n", name);

    }
}
