import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner coins = new Scanner(System.in);
        Scanner coffe = new Scanner(System.in);
        Scanner sugar = new Scanner(System.in);
        System.out.println("Enter your coins first");
        int money;
        int coffeType = 1;
        int sugarLevel;
        money=coins.nextInt();
        if(money < 45){
            System.out.println("Your dont have enough money\n");
        }else if (money >= 45){
            System.out.println("\nYou have " +money+" denar select your daily coffee\n");
            System.out.println("Please selecet coffe\n 1.Essprespp\n 2.Machiato\n 3.Americano\n");
            coffeType=coffe.nextInt();
            System.out.println("Please select sugar\n 1.Little\n 2.Medium\n 3.High\n");
            sugarLevel=sugar.nextInt();
            switch (coffeType){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    switch (sugarLevel){
                        case 1:
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Please select sugar\n");
                    }
                default:
                    System.out.println("Please select coffee");
            }

            System.out.println("Please take your product");
        }
        }


        }





