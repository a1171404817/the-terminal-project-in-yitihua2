package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.studentdao;
import entity.Student;


public class addServlet extends HttpServlet  {
	static int Studentnum=0;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{


		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");

        String username=req.getParameter("username");
        String pwd=req.getParameter("pwd");
        String name=req.getParameter("name");
        String sex=req.getParameter("sex");
        String age=req.getParameter("age");

        Student student=new Student(username,pwd,name,sex,age);
        System.out.println(student);
        studentdao studentdao=new studentdao();
        studentdao.insert(student);
        studentdao.getAll();

        res.sendRedirect("login/login.jsp");



	}

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		doGet(req, res);

	}
}
