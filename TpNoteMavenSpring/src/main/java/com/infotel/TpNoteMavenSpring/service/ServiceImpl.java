package com.infotel.TpNoteMavenSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpNoteMavenSpring.dao.Idao;

@Service("service")
public class ServiceImpl implements Iservice {
	@Autowired
    private Idao dao;

	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}
	
}
