import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to Twilight Management System");
        System.out.println("Press Enter To Continue");
        myObj.nextLine();

        System.out.println("Let's Get Started On Discount Sales Inventory");
        System.out.println("Please enter UPC #: ");
        String upcNumber = myObj.nextLine();
        System.out.println("Grey Supreme Graphic T-shirt - " +"UPC0000" + upcNumber);

        System.out.println("Enter original price: ");
        float price = myObj.nextFloat();
        System.out.println("Enter discount amount: ");
        float discountPrice = myObj.nextFloat();
        discountPrice = price - discountPrice;
        System.out.println("Price has been updated to " + "$"+ discountPrice );
        boolean discountPriceBogo;
        if (discountPriceBogo = (discountPrice >= 100) || (price <= 100)) {
            System.out.println(discountPriceBogo + " : Please apply additional 20% ");
        } else {
            System.out.println(discountPriceBogo + " : Please apply additional 10% ");
        }
        System.out.println("Would you like to exit? Y or N");
        char a = myObj.next().charAt(0);
        System.out.println("You've entered: " + a);

        System.out.println("Enter employee number: ");
        String employeeNumber = String.valueOf(myObj.nextInt());

        System.out.println(employeeNumber + " is logged out!");
        myObj.close();

    }
}
