package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.user;
import service.UserService;

public class UserServiceImpl implements UserService {

	UserDao dao= new UserDaoImpl();
	@Override
	public void save(user use) {
		dao.save(use);
	}

}
