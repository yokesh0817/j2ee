package productWeb;

public class Product {
   
	private int id;
	private String brand;
	private double price;
	private double discount;
	public Product(int id, String brand, double price, double discount) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}

	
	
}
