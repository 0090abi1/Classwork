import java.util.Scanner;
public class bill {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMenu\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println("");
            System.out.println("Enter no of items : ");
            int noOfItems = scanner.nextInt();
            double totalP = 0;
            for (int i=0; i<noOfItems;i++){

                System.out.println("1. Chauchausadeko\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRs 120\n2. Momo\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRs 250\n3.Coffee\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Rs 90");
                int selectItems;
                System.out.print("Please Enter food, You want to order : ");
                selectItems = scanner.nextInt();
                System.out.print("Please enter the qunatity : ");
                int Qunatity = scanner.nextInt();
                switch (selectItems){
                    case 1:
                        totalP = totalP + (Qunatity * 120);
                        break;
                    case 2:
                        totalP = totalP + (Qunatity * 250);
                        break;
                    case 3:
                        totalP = totalP + (Qunatity * 90);
                        break;
                    default:
                        System.out.println("No items are available");
                }
            }
            double Discount = totalP - (0.1 * totalP);
            double total = Discount + (0.13) * Discount;
            System.out.println("The total price is " + total);
        }
    }

