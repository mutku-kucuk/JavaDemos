package staticDemo;

import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Telefon";
		product.price = 3000;
		
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection();
		
	}

}
