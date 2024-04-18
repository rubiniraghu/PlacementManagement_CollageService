package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CollageService {
	@Autowired
	private CollegeRepository repository;
	
	public List<Collage> showAll(){
		return repository.findAll();
	}
	
	public Collage get(Long id) {
		return repository.findById(id).get();
		
	}
	
	public void save(Collage collage) {
		repository.save(collage);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
