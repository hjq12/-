package entity;

public class StudentBaseinfo {

	private String Sname;
	private int Snumber;
	private int Ssex;
	private int Sage;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSnumber() {
		return Snumber;
	}
	public void setSnumber(int snumber) {
		Snumber = snumber;
	}
	public int getSsex() {
		return Ssex;
	}
	public void setSsex(int ssex) {
		Ssex = ssex;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	public StudentBaseinfo(String sname, int snumber, int ssex, int sage) {
		super();
		Sname = sname;
		Snumber = snumber;
		Ssex = ssex;
		Sage = sage;
	}
	public StudentBaseinfo() {
		super();
	}
	
}
