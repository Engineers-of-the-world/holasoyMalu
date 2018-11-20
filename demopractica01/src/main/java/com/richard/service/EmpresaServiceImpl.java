package com.richard.service;

import java.util.List;



public class EmpresaServiceImpl implements EmpresaService {
	@Autowired
	EmpresaRepository userRepository;
	@Override
	public Empresa findById(long id) {
		
		return userRepository.findById(id);
	}

	@Override
	public Empresa findByRazon_social(String razon_social) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(Empresa emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Empresa emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(Empresa emp) {
		// TODO Auto-generated method stub
		return false;
	}

}
