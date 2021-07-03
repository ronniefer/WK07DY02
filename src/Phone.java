
public class Phone {
	
	private String brand;
	private String model;
	private String osType;
	
	public Phone() {

	}
	
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Phone(String brand, String model, String osType) {
		this.brand = brand;
		this.model = model;
		this.osType = osType;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public boolean isMobile() {
		return true; 
	}
	
	public String canYouHearMeNow() {
		return "Can you hear me now?";
	}
	
	public static void main(String[] args) {
		
		Phone myMobile = new Phone("Google", "Pixel 3 XL", "Android");
		
		if (myMobile.isMobile()) {
			System.out.println(myMobile.getBrand());
			System.out.println(myMobile.getModel());
			System.out.println(myMobile.getOsType());
			System.out.println(myMobile.canYouHearMeNow());
		}
		
		Phone myCell = new Phone("Apple", "iPhone8");
		
		System.out.println(myCell.getBrand());
		System.out.println(myCell.getModel());
		System.out.println(myCell.getOsType());
	}
}
