package com.kosmos.prueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kosmos.prueba.dto.CitaDTO;
import com.kosmos.prueba.service.CitaService;


@RestController()
@CrossOrigin("*")
@RequestMapping("/prueba")
public class CitaController {

	
	@Autowired
	CitaService citaService;
	
	@PostMapping("/cita")
	public ResponseEntity<Object> registrarCita(@RequestBody CitaDTO dto,  BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body("Datos inválidos: " + result.getAllErrors());
        }
		try {
			citaService.registrarCita(dto);
			return new ResponseEntity<>("Creado", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping("/getCitas")
	public ResponseEntity<Object> getCitas(@RequestParam(required = true) String doctor) {
		try {
			List<CitaDTO> citas = new ArrayList<>();
			citas = citaService.getCitas(doctor);
			return new ResponseEntity<>(citas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("" + e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
}
