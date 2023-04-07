import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class user {
	private String name;
    private String surname;
    private String username;
    private String dateOfBirth;
    private String password;
    private String emailAdress;
    private String homeAdress;
    private String workAdress;
    private String orderedProduct;
    private String creditCard;
    private int purchaseAmount;
    private ArrayList<Product> order;
    private ArrayList<Product> favorites;
    Scanner sc = new Scanner(System.in);
    
	public user() {
		
		setName();
		setSurname();
		setDateOfBirth();
		setPassword();
		setEmailAdress();
		setHomeAdress();
		setWorkAdress();
		this.orderedProduct = orderedProduct;
		setCreditCard() ;
		setPurchaseAmount();
		this.order = new ArrayList<Product>();
		this.favorites= new ArrayList<Product>();
		
		 System.out.println(toString());
		
		
	}public void addOrder(Product product ) {
		order = new ArrayList<Product>();
		this.order.add(product);
		
		
		
		
	}
	public void addFavorite(Product product){
        System.out.println("Do you want to add to favourites?  product?(true or false)");
		String result = sc.next();
        String k = "true";
        if(k.equals(result)) {
        	 this.favorites.add(product);
             System.out.println(product.toString() + " added to favorite products");
        }
        else {
        	System.out.println("The product could not be added to favourites.");
        }
        
    }

	
	public void setName() {
		System.out.println("Please enter the name:");
		String nm = sc.nextLine();
		this.name = nm.toUpperCase().trim();
	}
	
	public void setSurname() {
		System.out.println("Please enter the surname:");
		String sn =sc.nextLine();
		this.surname = sn.toUpperCase().trim();
	}
	public void setUsername() {
		System.out.println("Please enter the username:");
		String un = sc.nextLine();
		this.username = un.trim().toUpperCase();
	}
	public void setDateOfBirth() {
		
		System.out.println("Please enter the birthday:(day,month,year(Please press the spacebar after each data.)");
		String day= sc.nextLine();
		String month=sc.nextLine();
		String year = sc.nextLine();
		this.dateOfBirth = day +"."+ month+"."+  year;
	}
	public void setPassword() {
		System.out.println("Please enter the password:");
		String pass = sc.nextLine().trim();
		this.password = "*****************";
	}
	public void setEmailAdress() {
		System.out.println("Enter the mail adress:");
		String mail = sc.nextLine().trim();
		this.emailAdress = mail;
	}
	public void setHomeAdress() {
		System.out.println("Enter the home adress:");
		String home = sc.nextLine().trim();
		this.homeAdress = home;
	}
	public void setWorkAdress() {
		System.out.println("Enter the work adress:");
		String work= sc.nextLine().trim();
		this.workAdress = work;
	}
	public void setOrderedProduct() {
	
		this.orderedProduct = orderedProduct;
	}
	public void setCreditCard() {
		System.out.println("Please enter the card number(card number is 16 digits )");
		String cd = sc.nextLine();
		if(cd.length()>16 || cd.length()<16) {
			System.out.println("Please enter the true card number ,TRY AGAÝN!!");
			String cdnmbr = sc.next().substring(0, 4)+"/****"+"/****/" +sc.next().substring(12, 16);
		}
		else {
			System.out.println("Thank you :)");
			this.creditCard = cd;
		}
		
	}
	public void setPurchaseAmount() {
		System.out.println("how many product would you like product? ");
		int would = sc.nextInt();
		this.purchaseAmount = would;
	}
	public void setCart(ArrayList<Product> order) {
		this.order  = order;
	}

	public void setFavorites(ArrayList<Product> favorites) {
		this.favorites = favorites;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPassword() {
		return password;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public String getHomeAdress() {
		return homeAdress;
	}
	public String getWorkAdress() {
		return workAdress;
	}
	public String getOrderedProduct() {
		return orderedProduct;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public ArrayList<Product> getCart() {
		return order;
	}
	public ArrayList<Product> getFavorites() {
		return favorites;
	}
	
	@Override
	public String toString() {
		
		return 
				" UserName : " + this.getName() + "\t "+
		" UserSurname : " + this.surname + "\t"+
		" Birthday : " + this.dateOfBirth + "\t"+
		" Password : " + this.password + "\t"+
		" Mail : "+ this.getEmailAdress() +"\t"+
		" HomeAdress : " + this.homeAdress +"\t"+
		" WorkAdress : " + this.workAdress ;
		

		
	}
	
	
	
    
    


}
