public class TaskNine{
    public static void main(String... args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = inputCollector.nextInt();


        double tax = price + (price * 0.10);

        System.out.printf("The price of the item = %.02f%nThe total = %.02f%nThe tax amount to pay = %.02f%nThe subtotal(VAT included) = %.02f%n------------------Thank You!------------------", price, price, price*0.10, tax);

    }
}
