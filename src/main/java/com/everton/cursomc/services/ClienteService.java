package com.everton.cursomc.services;

import java.util.Optional;


import com.everton.cursomc.domain.Cliente;
import com.everton.cursomc.repositories.ClienteRepository;
import com.everton.cursomc.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

	public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));        		
	}
}