package dao;

import java.util.List;

import entity.StudentBaseinfo;

public interface StudentBIDao {
     int add(StudentBaseinfo sbi);
     List<StudentBaseinfo> allquery();
	
}
