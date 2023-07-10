package com.etzel.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etzel.app.dao.CapacitacionDao;
import com.etzel.app.modelos.Capacitacion;

/**
 * @author
 * Etzel M. Valderrama
 */
@Service
public class CapacitacionService {

	private final CapacitacionDao cDao;

	/**
	 * @param cDao
	 */
	@Autowired
	public CapacitacionService(CapacitacionDao cDao) {
		this.cDao = cDao;
	}

	public boolean  create(Capacitacion c) {
		return cDao.create(c);
	}
	
	public List<Capacitacion> getAll() {
		return cDao.readAll();
	}
	
	public Capacitacion getOne(int id) {
		return cDao.readOne(id);
	}
	
	public void update(Capacitacion c) {
		cDao.update(c);
	}
	
	public void delete(int id) {
		cDao.delete(id);
	}
}