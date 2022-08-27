package com.cg.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CertificateService {
	
	@Autowired
	private CertificateRepository repo;
	
	//listAll(), save(), get(), delete()
	
	public List<Certificate> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Certificate certificate) {
		repo.save(certificate);
	}
	
	public Certificate get(Integer id) {
		return repo.getById(id);
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
