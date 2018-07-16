package waa.mum.edu.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import waa.mum.edu.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Long> 
	{
		@Query(value = "SELECT e FROM Employee e WHERE e.employeeNumber =?1")
		public Employee findEmployeeByEmployeeNumber(int number);
			  
		  
  	}

