package com.Revision.Revisionagain;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepository srepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"the program is tested";
	}
	@RequestMapping("/save")
	public Student save()
	{
		Student s=new Student();
		s.setFirstname("Rajdeep");
		s.setLastname("Das");
		s.setAddress("Jharkhand");
		return srepo.save(s);
	}
	@RequestMapping("/saveall")
	public String saveall()
	{
		Student s1=new Student();
		s1.setFirstname("Jaydeep");
		s1.setLastname("Das");
		s1.setAddress("Uttrakhand");
		
		Student s2=new Student();
		s2.setFirstname("Sandeep");
		s2.setLastname("singh");
		s2.setAddress("UP");
		
		Student s3=new Student();
		s3.setFirstname("Ritik");
		s3.setLastname("Mishra");
		s3.setAddress("MP");
		
		List<Student>list=Arrays.asList(s1,s2,s3);
		 srepo.saveAll(list);
		return"all data are saved";
		
	}
	@RequestMapping("/findall")
	public List<Student> all()
	{
		return srepo.findAll();
	}
	@RequestMapping("/hi/{firstname}")
	public Student byname(@PathVariable String firstname)
	{
		return srepo.findByFirstname(firstname);
	}
	@RequestMapping("/delete/{id}")
	public Student byid(@PathVariable int id)
	{
		return srepo.deleteById(id);
	}

}
