import java.util.*;
public class Product {
	private String productName;
	private String productColour;
	private String productCategory;
	private int stockInformation;
	private String productDescription;
	private user user1 ;
	Scanner sc = new Scanner (System.in);
	
	public Product( user user1) {
		this.user1 = user1;
        setProductName();
        setProductColour();
        setProductCategory();
        setStockInformation();
        setProductDescription();
        System.out.println(toString());
        controllerStock();
	}
	
	public void controllerStock() {
		
		this.stockInformation = getStockInformation() - user1.getPurchaseAmount();
		System.out.println("Remainder "+ this.productName +" : " + this.stockInformation);
		
	
		
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName() {
		System.out.println("Please enter the Product Name :");
		String pn = sc.nextLine();
		this.productName = pn.trim().toUpperCase();
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour() {
		System.out.println("Please enter the Product Colour:");
		String pc = sc.nextLine().trim().toUpperCase();
		
		this.productColour = pc;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory() {
		System.out.println("Enter the product category;");
		String pk = sc.nextLine();
		this.productCategory = pk.toUpperCase().trim();
	}

	public int getStockInformation() {
		return stockInformation;
	}

	public void setStockInformation() {
		System.out.println("Please enter the stock of the product.");
        int stock = sc.nextInt();
      this.stockInformation = stock ;

		}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription() {
		this.productDescription= productDescription;
		
	}

	public user getUser1() {
		return user1;
	}

	public void setUser1(user user1) {
		this.user1 = user1;
	}
	
	@ Override
	public String toString() {
		
		return "Category:" + this.productCategory +"\t"+
		"NAME:" + this.productName +"\t"+
		"COLOUR:" + this.productColour+"\t"+ 
		" StockInformation: " +this.stockInformation +"\t" + "number of products received :"+user1.getPurchaseAmount() ;		
		
	}

	
	

	
	  


}
