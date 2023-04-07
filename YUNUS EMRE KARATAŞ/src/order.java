
public class order {
	private user user1 ;
	private Product product ;
	private crediCard card1;
	private int purchaseAmount;
	
	public order(user user1,Product product, crediCard card1) {
		this.user1 = user1;
		this.product = product;
		 this.card1=card1;
		 user1.addOrder(product);
		 System.out.println(toString());
	}
	public user getUser1() {
		return user1;
	}
	public Product getProduct1() {
		return product;
	}
	public crediCard getCard1() {
		return card1;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setUser1() {
		this.user1 = user1;
	}
	public void setProduct1() {
		this.product = product;
	}
	public void setCard1() {
		this.card1 = card1;
	}
	public void setPurchaseAmount() {
		this.purchaseAmount = purchaseAmount;
	}
	
	@Override
    public String toString() {
        return "Order on the proccess for " +
                "user= " + user1.getName() +
                ", and will be paid by card" + user1.getCreditCard();
               
    }

	
    
}
