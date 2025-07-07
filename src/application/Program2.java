package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---Teste 1: Department insert---");
		Department newDepartment = new Department(null, "Higiene e Limpeza");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id= " + newDepartment.getId());
		System.out.println();
		System.out.println("---Teste 2: Department findById---");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		

	}

}
