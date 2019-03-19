package com.lanou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou.dao.AdminDao;
import com.lanou.exception.NameException;
import com.lanou.exception.UserNotExistException;
import com.lanou.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;

	public void addAdmin(Admin adm) {
		adminDao.addAdmin(adm);
	};

	public void deleteAdmin(Integer admAccount) {
		adminDao.deleteAdmin(admAccount);
	};

	public void updateAdmin(Admin adm) {
		adminDao.updateAdmin(adm);
	};

	public Admin queryAdmin(Integer admAccount) {
		return adminDao.queryAdmin(admAccount);
	};

	public List<Admin> queryAll() {
		return adminDao.queryAll();
	};

	public void login(Admin adm) throws UserNotExistException, NameException {
		Admin newAdm = adminDao.queryAdmin(adm.getAdmAccount());
		if (newAdm == null) {
			throw new UserNotExistException();
		} else if (!newAdm.getAdmPassword().equals(adm.getAdmPassword())) {
			throw new NameException();
		}
	}
}
