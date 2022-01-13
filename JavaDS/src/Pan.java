public class Pan {

	private int id;
	private String material;
	private String brand;
	private int price;
	private int capacity;

	Pan() {
		this.id = 0;
		this.material = "";
		this.brand = "";
		this.price = 0;
		this.capacity = 0;

	} // pan constructor

	Pan(int id, String material, String brand, int price, int capacity) {
		this.id = id;
		this.material = material;
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;

	} // pan constructor

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

}// Pan class end