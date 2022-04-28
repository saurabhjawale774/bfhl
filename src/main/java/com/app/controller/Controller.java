package com.app.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Data;
import com.app.dto.Details;

@RestController
public class Controller {
		@PostMapping("/bfhl")
		public Details postApi(@RequestBody Data data) {
			
			List<String> numbers = new ArrayList<>();
			List<String> alphabets = new ArrayList<>();
			
			for(int i=0 ; i< data.getData().length ; i++) {
				try {
					numbers.add(String.valueOf(Integer.parseInt(data.getData()[i])));
				}
				catch(Exception e) {
					alphabets.add(data.getData()[i]);
				}			
			}
			
			
			return new Details(true,"Saurabh_Jawale_210941220078","saurabhjawale774@gmail.com","PD1354",numbers,alphabets);
		}
	}


