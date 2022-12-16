package staticDemo;

public class ProductValidater {
	public ProductValidater() {
		System.out.println("Yapici blok calistti");
	}
	
	static {
		System.out.println("Static yapici blok calisti");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void bisey() {
		System.out.println("Bisey");
	}
	
}


