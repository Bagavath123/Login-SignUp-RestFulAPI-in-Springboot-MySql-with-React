package com.example.lohiajute.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.lohiajute.dto.AdminDTO;
import com.example.lohiajute.dto.LoginDTO;
import com.example.lohiajute.entity.Admin;
import com.example.lohiajute.message.LoginMessage;
import com.example.lohiajute.repo.AdminRepo;
import com.example.lohiajute.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addAdmin(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		 Admin admin = new Admin(
	            adminDTO.getAdminId(),
	            adminDTO.getAdminName(),
	            adminDTO.getEmail(),
	            
	            this.passwordEncoder.encode(adminDTO.getPassword())
				 );
		adminRepo.save(admin);
		return admin.getAdminName();
	}

	AdminDTO adminDTO;
	
	@Override
	public LoginMessage loginAdmin(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		//String msg = "";
		Admin loginAdmin = adminRepo.findByadminName(loginDTO.getAdminName());
		
		if(loginAdmin != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = loginAdmin.getPassword();
			
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if(isPwdRight) {
				Optional<Admin> admin = adminRepo.findByAdminNameAndPassword(loginDTO.getAdminName(), encodedPassword);
				
				if(admin.isPresent()) {
					return new LoginMessage("Login Sucessfully", true);
				}else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("password Not Match", false);
            }
        }else {
            return new LoginMessage("Admin Name not exits", false);
        }
    }
	
	
}
