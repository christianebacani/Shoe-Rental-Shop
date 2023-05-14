import java.util.Scanner;
public class ShoeRentalShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {500,550,600,650,700,750,800,850,900};
        boolean transaction = true;
        int total = 0;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("!.) Rent a shoe/s\n");
        System.out.print("2.) Return a shoe/s\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit \n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\n\tAVAILABLE SHOES\n\n");
                System.out.print("SHOES\t\tPRICE\n");
                System.out.print("1.) Adidas\tP 500 per day\n");
                System.out.print("2.) Vans  \tP 550 per day\n");
                System.out.print("3.) Nike  \tP 600 per day\n");
                System.out.print("4.) Skechers\tP 650 per day\n");
                System.out.print("5.) Converse\tP 700 per day\n");
                System.out.print("6.) Puma    \tP 750 per day\n");
                System.out.print("7.) Jordan  \tP 800 per day\n");
                System.out.print("8.) Reebok  \tP 850 per day\n");
                System.out.print("9.) Fila    \tP 900 per day\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                System.out.print("How many days you wanted it to rent : ");
                int days = input.nextInt();
                
                total += (price[userChoice - 1] * quantity) * days;
                
                System.out.print("Do you want to rent more shoe/s ?(y/n): ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    
                    transaction = false;
                    System.out.print("The total price is: P " + total + "\n");
                    System.out.print("Enter your payment here : ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU FOR RENTING OUR SHOES ^_^\n");
                        
                }
                
                
                }
                break;
                
            case 2:
                System.out.print("\n\tAVAILABLE SHOES\n\n");
                System.out.print("SHOES\t\tPRICE\n");
                System.out.print("1.) Adidas\n");
                System.out.print("2.) Vans\n");
                System.out.print("3.) Nike\n");
                System.out.print("4.) Skechers\n");
                System.out.print("5.) Converse\n");
                System.out.print("6.) Puma\n");
                System.out.print("7.) Jordan\n");
                System.out.print("8.) Reebok\n");
                System.out.print("9.) Fila\n");
                
                System.out.print("Enter the shoes you want to return : ");
                int shoesReturn = input.nextInt();
                System.out.print("\n\n---SUCCESSFULLY RETURNED---\n");
                break;
                
            case 3:
                System.out.print("\n\nWelcome to our shoe rental shop system! We are passionate about shoes and committed to\nproviding our customers with a unique and affordable way to experience the latest footwear\ntrends\n");
                break;
                
            case 4:
                System.out.print("\n\n---EXITING---\n");
                break;
                
            default:
                System.out.print("\n\nINVALID CHOICE!\n");
        }
        
        
    }
}
