package com.cg.um;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	public List<User> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id){
		try {
			User user =service.get(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
	}
		
		@PostMapping("/placement")
		public void add(@RequestBody User user) {
		service.save(user);
	}
		

		@PutMapping("/placement/{id}")
		public ResponseEntity<?> update(@RequestBody User user , @PathVariable Integer id){		
			try {
				User existUser=service.get(id);
				service.save(user);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		@DeleteMapping("user/{id}")
		public void delete(@PathVariable Integer id) {
			service.delete(id);
		}
}
