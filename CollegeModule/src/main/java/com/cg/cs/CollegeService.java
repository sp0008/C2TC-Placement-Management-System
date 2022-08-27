package com.cg.cs;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService {
	
	@Autowired
	private CollegeRepository repo;
	
	public List<College> listAll(){
		return repo.findAll();
	}
	
	public void save(College college) {
		repo.save(college);
	}
	
	public College get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
