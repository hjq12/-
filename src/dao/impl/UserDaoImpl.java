package dao.impl;

import java.util.ArrayList;
import java.util.List;
import dao.UserDao;
import entity.user;

public class UserDaoImpl implements UserDao {
	 List<user> list =new ArrayList<user>();
	@Override
	public void save(user user) {
		// TODO Auto-generated method stub
      
	   list.add(user);
	   for(user user2:list) {
		   System.out.println(user2.getName()+","+user2.getAge());
	   }
	}

	@Override
	public void update(user user) {
		// TODO Auto-generated method stub
		System.out.println("更新后的数据");
	}

}
