import java.util.*;

public class Menu{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalBill = 0, mixedVeg = 100, eggCurry = 120, jeeraRice = 50, roti = 10, biryani = 80;
		boolean generateBill = false;
		int quantity = 0, itemTotal = 0;
		String item = "";

		do{
			System.out.println("Enter food items from following Menu:");
			System.out.println("\t 1. Mixed Veg \t ₹100 \n\t 2. Egg Curry \t ₹120\n\t 3. Jeera Rice \t ₹50 \n\t 4. Roti \t ₹10 \n\t 5. Biryani \t ₹80");
			System.out.println("\t 6. Generate Bill");

			int choice = sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("Enter Quantity(in plates) of Mixed Veg: ");
					quantity = sc.nextInt();
					totalBill = totalBill + (mixedVeg * quantity);
					itemTotal = mixedVeg * quantity;
					item = item.concat(" Mixed Veg * " + quantity + " = ₹" + itemTotal + "\n\t\t\t");
					break;

				case 2:
					System.out.println("Enter Quantity(in plates) Egg Curry: ");
					quantity = sc.nextInt();
					totalBill = totalBill + (eggCurry * quantity);
					itemTotal = eggCurry * quantity;
					item = item.concat(" Egg Curry * " + quantity + " = ₹" + itemTotal + "\n\t\t\t");
					break;

				case 3:
					System.out.println("Enter Quantity(in plates) of Jeera Rice: ");
					quantity = sc.nextInt();
					totalBill = totalBill + (jeeraRice * quantity);
					itemTotal = jeeraRice * quantity;
					item = item.concat(" Jeera Rice * " + quantity + " = ₹" + itemTotal + "\n\t\t\t");
					break;

				case 4:
					System.out.println("Enter Quantity(in plates) of Roti: ");
					quantity = sc.nextInt();
					totalBill = totalBill + (roti * quantity);
					itemTotal = roti * quantity;
					item = item.concat(" Roti * " + quantity + " = ₹" + itemTotal + "\n\t\t\t");
					break;

				case 5:
					System.out.println("Enter Quantity(in plates) of Biryani: ");
					quantity = sc.nextInt();
					totalBill = totalBill + (biryani * quantity);
					itemTotal = biryani * quantity;
					item = item.concat("Biryani * " + quantity + " = ₹" + itemTotal +  "\n\t\t\t");
					break;

				case 6:
					generateBill = true;
					break;

				default:
					System.out.println("Please, provide correct Item");
					break;
			}
		}while(!generateBill);

		System.out.println("Your order is: ");
		System.out.println("\t\t\t" + item);
		System.out.println("\t\t\t Your total bill is: ₹" + totalBill);
		System.out.println("\t\t\t Thank You!");	
	}
}