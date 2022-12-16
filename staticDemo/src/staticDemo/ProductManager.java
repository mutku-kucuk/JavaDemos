package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if (ProductValidater.isValid(product)) {
			System.out.println("Eklendi.");

		}	
		else {
			System.out.println("Ürün bilgileri geçersiz.");
		}
		ProductValidater productValidater = new ProductValidater();
		productValidater.bisey();
	}
	
}
