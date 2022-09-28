package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(12);
		product1.setImageUrl("bilmemne.jpg");
		
		Product product2 = new Product();
		product2.setName("Vestel Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(12);
		product2.setImageUrl("bilmemne.jpg");
	
		Product[] products = {product1, product2};
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getDiscount());
		}
		
		IndividualCustomer induvudualCustomer = new IndividualCustomer();
		induvudualCustomer.setId(1);
		induvudualCustomer.setPhoneNumber("056465");
		induvudualCustomer.setCustomerNumber("56");
		induvudualCustomer.setFirstName("Engin");
		induvudualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("45645");
		corporateCustomer.setTaxNumber("2365489654");
		corporateCustomer.setCustomerNumber("235");
		
		Customer[] customers = {induvudualCustomer, corporateCustomer};
		
		
	}

}
