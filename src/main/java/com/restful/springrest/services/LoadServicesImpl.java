package com.restful.springrest.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.springrest.dao.LoadDao;
import com.restful.springrest.entities.Loads;

@Service
public class LoadServicesImpl implements LoadServices {
	
	@Autowired
	private LoadDao loadDao;
	
	public LoadServicesImpl()
	{
	}
	@Override
	public List<Loads> getLoads() {
		// TODO Auto-generated method stub
		return loadDao.findAll();
	}
	@Override
	public Loads getLoad(UUID shipperId) {
		// TODO Auto-generated method stub
		return loadDao.getOne(shipperId);
		
	}
	@Override
	public String addLoad(Loads load) {
		// TODO Auto-generated method stub
		loadDao.save(load);
		return "Load details added successfully";
	}
	@Override
	public Optional<Loads> getLoadId(int loadId) {
		// TODO Auto-generated method stub

		return loadDao.findById(loadId);
	}
	@Override
	public Loads updateLoad(Loads load,int loadId) {
		// TODO Auto-generated method stub

		return loadDao.save(load);
	}
	@Override
	public void deleteLoad(int loadId) {
		// TODO Auto-generated method stub

		Loads entity=loadDao.getReferenceById(loadId);
		loadDao.delete(entity);
		
	}

}