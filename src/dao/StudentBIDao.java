package dao;

import java.util.ArrayList;
import java.util.List;

import entity.StudentBaseinfo;

public interface StudentBIDao {
	 List<StudentBaseinfo> list=new ArrayList<StudentBaseinfo>();
     int add(StudentBaseinfo sbi);
     List<StudentBaseinfo> allquery();
	
}
