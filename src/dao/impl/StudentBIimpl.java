package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.StudentBIDao;
import entity.StudentBaseinfo;
import utils.MyDBUtils;

public class StudentBIimpl implements StudentBIDao {
	Connection conn=MyDBUtils.createConnection();
	@Override
	public List<StudentBaseinfo> allquery() {
		// TODO Auto-generated method stub
		List<StudentBaseinfo> list=new ArrayList<StudentBaseinfo>();
    	ResultSet rs=null;
    	try {
			String sql="SELECT * FROM studentbaseinfo";
		    rs=MyDBUtils.queryAll(sql,null);
			while(rs.next()) {
			    list.add(new StudentBaseinfo(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MyDBUtils.closeAll(rs, null, null);
		}
    	return list;
	}
	
	@Override
	public int add(StudentBaseinfo sbi) {
			int num=0;
			try {	
				String sql="INSERT INTO studentbaseinfo(Sname,Snumber,Ssex,Sage) VALUES (?,?,?,?)";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1, sbi.getSname());
				pst.setInt(2,sbi.getSnumber());
				pst.setInt(3, sbi.getSsex());
				pst.setInt(4, sbi.getSage());
			    num=pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return num;
   }// TODO Auto-generated method stub
	

	
	
	

	
}
