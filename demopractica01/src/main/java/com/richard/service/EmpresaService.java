package com.richard.service;

import java.util.List;



public interface EmpresaService {

	Empresa findById(long id);
	Empresa findByRazon_social(String razon_social);
	void saveUser (Empresa emp);
	void updateUser (Empresa emp);
	void deleteUserById (long id);
	List<Empresa> findAllUser();
	void deleteAllUsers();
	
	public boolean isUserExist(Empresa emp);
}
