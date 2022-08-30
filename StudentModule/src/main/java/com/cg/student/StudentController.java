package com.cg.student;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/student")
	public List<Student> list(){
		return service.listAll();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id){
		try {
			Student existStudent =service.get(id);
			return new ResponseEntity<Student>(existStudent, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/student")
		public void add(@RequestBody Student student){
		service.save(student);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Integer id){		
		try {
			Student existStudent=service.get(id);
			service.save(student);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("student/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
