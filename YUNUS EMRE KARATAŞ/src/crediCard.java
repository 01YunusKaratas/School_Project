
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;

public class crediCard {
	private String cardNumber;
	private user carduser;
	private int securityCode;
	private String expirationDate;
	private user user1;
	Scanner sc = new Scanner(System.in);
	
	
	public crediCard(user user1) {
		this.carduser = user1;
		setCardNumber();
		setCarduser();
		setSecurityCode();
		setExpirationDate() ;
		System.out.println(toString());
		
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public user getCarduser() {
		return carduser;
	}
	public int getSecurityCode() {
		return securityCode;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setCardNumber() {
		System.out.println("Please enter the cardNumber Again!!:");
		String cn = sc.nextLine();
		this.cardNumber=cn;
		System.out.println("Thank you sir :)");
	}
	public void setCarduser() {
		this.carduser = carduser;
	}
	public void setSecurityCode() {
		System.out.println("Please enter the security code:");
		while(!sc.hasNextInt()) {
			System.out.println("Please enter the integer value ,Try Again!!!");
			sc.nextInt();
		}
		this.securityCode = sc.nextInt();
	}
	public void setExpirationDate() {
		System.out.println("Please enter the expiration Date of day,month,year(Please press the spacebar after each data.) :");
		String day= sc.next();
		String month=sc.next();
		String year = sc.next();
		String k = day +" "+month+" "+year;
		
		this.expirationDate = k ;
	}
	
	@ Override
	public String toString() {
		return 
				"CardNumber:"+ this.getCardNumber()+"\t"+
				"cardUser:"+ this.getCarduser()+"\t"+
				"SecurityCode:"+this.getSecurityCode()+"\t"+
				"ExpirationDate:"+this.getExpirationDate();
	}


}
