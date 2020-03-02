package utils;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	public class MyDBUtils {
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		private static Connection conn=null;
		private static PreparedStatement pst=null;
		private static ResultSet rs=null;
		//��ȡ����
		public static Connection createConnection() {
			Connection conn=null;
			try {
				conn=DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/studentms?useUnicode=true&characterEncoding=UTF-8",
						"root",
						"1234");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		//�ͷ���Դ
		public static void closeAll(ResultSet rs,PreparedStatement pst,Connection conn){
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pst!=null) {
					pst.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//ͨ�÷�����ɾ�ķ���
		public static int updateAll(String sql,Object ... params) {
			int num=0;
			try {
				conn=createConnection();
				pst=conn.prepareStatement(sql);
				//�жϲ��������Ƿ�Ϊ��
				if(params !=null) {
					for(int i=0;i<params.length;i++) {
						pst.setObject((i+1), params[i]);
					}
				}
				num =pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return num;
		}
		//ͨ�õĲ�ѯ����
		public static ResultSet queryAll(String sql,Object...params) {
			try {
				conn=createConnection();
				pst=conn.prepareStatement(sql);
				if(params !=null) {
					for(int i=0;i<params.length;i++) {
						pst.setObject((i+1), params[i]);
					}
				}
				rs= pst.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}
		//ר�ŷ�ҳ
			public static ResultSet queryPage(String sql,int currpage,int pageSize) {
				ResultSet rs=null;
				PreparedStatement pst=null;
				Connection conn=null;
				try {
					conn=createConnection();
					pst=conn.prepareStatement(sql);
					pst.setObject(1, (currpage-1)*pageSize);
					pst.setObject(2, pageSize);
					rs= pst.executeQuery();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs;
			}
	}
