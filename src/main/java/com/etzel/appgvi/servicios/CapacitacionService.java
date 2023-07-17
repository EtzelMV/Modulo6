package com.etzel.appgvi.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etzel.appgvi.modelos.Capacitacion;
import com.etzel.appgvi.repositorios.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository capacitacionRepo;

	public CapacitacionService() {
		super();
	}

	public List<Capacitacion> getAll() {
		return capacitacionRepo.findAll();
	}
	
	public Capacitacion getOne(int id) {
		return capacitacionRepo.getOne(id);
	}
	
	public void create(Capacitacion capacitacion) {
		capacitacionRepo.save(capacitacion);
	}
	
	public void update(Capacitacion capacitacion) {
		capacitacionRepo.save(capacitacion);
	}
	
	public void delete(int id) {
		capacitacionRepo.delete(capacitacionRepo.getOne(id));
	}
}
