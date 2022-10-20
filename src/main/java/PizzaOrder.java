import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        //Task #1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String customerName = scanner.next();
        System.out.print("Enter your Email : ");
        String customerEmail = scanner.next();
        System.out.print("Enter your Phone number : ");
        long phoneNum = scanner.nextLong();
        System.out.print("Enter your Address : ");
        String address = scanner.nextLine();
        float pizzaPriceIn$ = 12.99f;
        char pizzaSize = scanner.next().charAt(0);
        float garlicBreadPriceIn$ = 5.99f;
        float beveragePriceIn$ = 1.99f;
        int numOfPizzasOrdered = 0;
        int numOfGarlicBreadOrdered = 0;
        int numOfBeveragesOrdered = 0;
        float totalPriceOfPizzasOrdered = 0;
        float totalPriceOfGarlicBreadOrdered = 0;
        float totalPriceOfBeveragesOrdered = 0;
        //Task #2
        float totalBillAmount = 0;
        int menuItemSlNum = 0;
        int contOrExit = 0;
        System.out.println();
        System.out.println("Sl No \t Item Category");
        System.out.println("------------------------");
        System.out.println("1) \t\t Pizza");
        System.out.println("2) \t\t Garlic Bread");
        System.out.println("3) \t\t Beverages");
        do {
            System.out.print("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages : ");
            menuItemSlNum = scanner.nextInt();
            System.out.println();
            switch (menuItemSlNum) {
                case (1):
                    System.out.print("Please enter the number of pizza you want to order : ");
                    numOfPizzasOrdered = scanner.nextInt();
                    totalPriceOfPizzasOrdered = pizzaPriceIn$ * numOfPizzasOrdered;
                    System.out.println();
                    System.out.println("Your total Pizza Bill : $" + totalPriceOfPizzasOrdered);
                    break;
                case (2):
                    System.out.print("Please enter the number of Garlic Bread you want to order : ");
                    numOfGarlicBreadOrdered = scanner.nextInt();
                    totalPriceOfGarlicBreadOrdered = garlicBreadPriceIn$ * numOfGarlicBreadOrdered;
                    System.out.println();
                    System.out.println("Your total Garlic Bread Bill : $" + totalPriceOfGarlicBreadOrdered);
                    break;
                case (3):
                    System.out.print("Please enter the number of Beverages you want to order : ");
                    numOfBeveragesOrdered = scanner.nextInt();
                    totalPriceOfBeveragesOrdered = beveragePriceIn$ * numOfBeveragesOrdered;
                    System.out.println();
                    System.out.println("Your total Beverages Bill : $" + totalPriceOfBeveragesOrdered);
                    break;
                default:
                    System.out.println("Invalid Sl No selected for menu");
                    break;
            }
            System.out.println();
            System.out.print("Do you want to place another order enter 1 to continue or 0 to exit : ");
            contOrExit = scanner.nextInt();
            totalBillAmount = totalPriceOfPizzasOrdered + totalPriceOfGarlicBreadOrdered + totalPriceOfBeveragesOrdered;
        }while (contOrExit == 1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("The total Bill Amount is : $" + totalBillAmount);
        System.out.println();
        if (totalBillAmount >= 50)
        {
            int discountInPercent = 10;
            float discount = 10/100f;
            float discountAmount = totalBillAmount * discount;
            System.out.println("Discount offered : " + discountInPercent + "%");
            Float amountToPay = totalBillAmount - discountAmount;
            System.out.println("The total Discounted Bill Amount : $" + amountToPay);
        }
        else
        {
            System.out.println("No discount provided since bill amount is less than $50");
        }
        System.out.println("----------------------------Thank You---------------------------------");
    }
}
