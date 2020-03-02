package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entity.StudentBaseinfo;
import service.impl.StudentBSServiceimpl;
@WebServlet("/queryall")
public class StudentBIqueryServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	StudentBSServiceimpl sbs=new StudentBSServiceimpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("UTF-8");
    	List<StudentBaseinfo> list=sbs.allquery();
    	HttpSession session=req.getSession();
    	if(list!=null) {
    		session.setAttribute("list", list);
    		req.getRequestDispatcher("index.jsp").forward(req, resp);
    	}
	}
}
