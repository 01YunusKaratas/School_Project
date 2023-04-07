import java.util.ArrayList;
import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cards will you add?");
		int number = sc.nextInt();
		for(int i = 0 ;i<number;i++) {
		System.out.println("Please enter the "+ (i+1)+". card information :" );
		System.out.println("*****************************");
		user user1 = new user();
		Product p1 = new Product(user1);
		user1.addOrder(p1);
		user1.addFavorite(p1);
		crediCard credicard = new crediCard(user1);
		order order = new order (user1,p1,credicard);
	
		}
		
	}

}

