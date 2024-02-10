package com.Revision.Revisionagain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	Student findByFirstname(String firstname);

	Student deleteById(int id);
	
	
}
