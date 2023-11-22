package com.example.lohiajute.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lohiajute.dto.AdminDTO;
import com.example.lohiajute.dto.LoginDTO;
import com.example.lohiajute.message.LoginMessage;
import com.example.lohiajute.service.AdminService;

@RestController
@RequestMapping("/lohia")
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin/signUp")
	public String signUp (@RequestBody AdminDTO adminDTO) {
		
		adminService.addAdmin(adminDTO);
		return "SignUp Sucessfull";
	}
	
	@PostMapping("/admin/login")
	public ResponseEntity<?> loginAdmin (@RequestBody LoginDTO loginDTO){
		
		LoginMessage loginMessage = adminService.loginAdmin(loginDTO);
		
		return ResponseEntity.ok(loginMessage);
	}
}
