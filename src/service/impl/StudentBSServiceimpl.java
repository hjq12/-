package service.impl;

import java.util.List;

import dao.StudentBIDao;
import dao.impl.StudentBIimpl;
import entity.StudentBaseinfo;
import service.StudentBIService;

public class StudentBSServiceimpl implements StudentBIService {

	StudentBIDao sbd=new StudentBIimpl();
	@Override
	public List<StudentBaseinfo> allquery() {
		// TODO Auto-generated method stub
		List<StudentBaseinfo> list=sbd.allquery();
		return list;
	}

}
