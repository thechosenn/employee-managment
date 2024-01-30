package com.elaassal.employeemanagment.controllers;

import com.elaassal.employeemanagment.dto.AuthenticationResponseDTO;
import com.elaassal.employeemanagment.dto.LoginRequestDTO;
import com.elaassal.employeemanagment.dto.RegisterRequestDTO;
import com.elaassal.employeemanagment.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000/")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDTO> register(@RequestBody RegisterRequestDTO request){
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponseDTO> authenticate(@RequestBody LoginRequestDTO request){
        return ResponseEntity.ok(authenticationService.login(request));

    }

}