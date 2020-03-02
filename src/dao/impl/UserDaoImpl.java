package dao.impl;

import java.util.ArrayList;
import java.util.List;
import dao.UserDao;
import entity.user;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(user user) {
		// TODO Auto-generated method stub
       List<user> list =new ArrayList<user>();
	   list.add(user);
	   for(user user2:list) {
		   System.out.println(user2.getName()+","+user2.getAge());
	   }
	}

}
