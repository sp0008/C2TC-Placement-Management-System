package com.cg.certificate;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CertificateController {
	
	@Autowired
	private CertificateService service;
	
	@GetMapping("/cert")
	public List<Certificate> list(){
		return service.listAll();
	}
	
	@GetMapping("/cert/{id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer id){
		try {
			Certificate certificate =service.get(id);
			return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/cert")
		public void add(@RequestBody Certificate certificate ) {
		service.save(certificate);
	}
	
	@PutMapping("/cert/{id}")
	public ResponseEntity<?> update(@RequestBody Certificate certificate, @PathVariable Integer id){		
		try {
			Certificate existCertificate=service.get(id);
			service.save(certificate);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("cert/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
