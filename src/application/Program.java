package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Teste 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
		System.out.println("\n=== Teste 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}
		List<Seller> listall = sellerDao.findAll();
		System.out.println("\n=== Teste 3: Seller findAll ===");
		for(Seller obj : listall) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 4: Seller Insert ===");
		Seller newSeller = new Seller(null,"Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id= " + newSeller.getId());
		
		System.out.println("\n=== Teste 5: Seller Update ===");
	    seller = sellerDao.findById(1);
	    seller.setName("Sandro M. dos Santos");
	    sellerDao.update(seller);
	    System.out.println("---Update completed!---");
	    
	    System.out.println("\n=== Teste 6: Seller Delete ===");
	    sellerDao.deleteById(10);
	    System.out.println("---Delete completed!---");
	    
	    
	}

}
