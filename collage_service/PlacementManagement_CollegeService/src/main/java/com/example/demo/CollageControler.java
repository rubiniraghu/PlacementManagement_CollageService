package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/collages")
public class CollageControler {
	@Autowired
	CollageService service;
	@GetMapping()
	public List<Collage> list() {
		return service.showAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Collage> get(@PathVariable Long id){
		try {
			Collage collage=service.get(id);
			return new ResponseEntity<Collage>(collage , HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<Collage>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@PostMapping()
	public void add(@RequestBody Collage collage) {
		service.save(collage);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update( @RequestBody Collage collage, @PathVariable Long id)
	{
		
		try {
			Collage existCollage=service.get(id);
			service.save(collage);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
