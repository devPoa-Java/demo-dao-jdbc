package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---Teste 1: Department insert---");
//		Department newDepartment = new Department(null, "Higiene e Limpeza");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! New id= " + newDepartment.getId());
		System.out.println();
		
		System.out.println("---Teste 2: Department findById---");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		System.out.println();
		
		System.out.println("---Teste 3: Department update---");
		Department dep2 = departmentDao.findById(7);
		dep2.setName("Drinks");
		departmentDao.update(dep2);
		System.out.println("Update completed!");
		System.out.println();
		
		System.out.println("---Teste 4: Department delete---");
//	    departmentDao.deleteById(13);
//	    System.out.println("Delete completed!");
	    System.out.println();
	    
	    List<Department> list = departmentDao.findAll();
	    System.out.println("---Teste 5: Department findAll---");
	    list.forEach(System.out::println);
		
		

	}

}
