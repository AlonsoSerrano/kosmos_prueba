package com.kosmos.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.prueba.dto.DoctorDTO;
import com.kosmos.prueba.service.DoctorService;



@RestController()
@CrossOrigin("*")
@RequestMapping("/prueba")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/doctor")
	public ResponseEntity<Object> registroDoctor(@RequestBody DoctorDTO dto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body("Datos inválidos: " + result.getAllErrors());
        }
		try {
			 doctorService.registroDoctor(dto);
			return new ResponseEntity<>("Creado", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
}
