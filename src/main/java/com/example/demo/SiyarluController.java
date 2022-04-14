package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siyarlus")
public class SiyarluController {

	@GetMapping
	public String getSiyarlus(@RequestParam(value ="name",required = false, defaultValue = "Thakurrrr") String name, @RequestParam(value="age") int age) {
		return "get siyarlus triggered with "+ name + " and "+ age;
	}
	
	@GetMapping(path="/{siyarluID}")
	public String getSiyarlus(@PathVariable String siyarluID){
		return "get single siyarlu tiggered for " + siyarluID;
	}
	
	@PostMapping
	public String createSiyarlus() {
		return "create siyarlus triggered";
	}
	
	@PutMapping
	public String updateSiyarlus() {
		return "update siyarlus triggered";
	}
	
	@DeleteMapping
	public String deleteSiyarlus() {
		return "delete siyarlus triggered";
	}
}
