package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.user;
import service.UserService;
import service.impl.UserServiceImpl;
@WebServlet("/Add")
public class UserServlet extends HttpServlet {
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doPost(req, resp);
    }
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	user use= new user();
    	UserService us=new UserServiceImpl();
    	req.setCharacterEncoding("UTF-8");
    	String name=req.getParameter("name");
    	int age=Integer.parseInt(req.getParameter("age"));
    	use.setName(name);
    	use.setAge(age);
    	us.save(use);
    }
	
}
