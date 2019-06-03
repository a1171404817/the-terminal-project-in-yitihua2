package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.studentdao;
import entity.*;
public class mainServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
	{
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");

		String username=req.getParameter("username");
		String pwd=req.getParameter("pwd");

		studentdao studentdao=new studentdao();
		HttpSession session=req.getSession();

//		Student student=studentdao.checkUser(username,pwd);
        Student student=studentdao.checkUser(username,pwd);

		System.out.print(student!=null);//是student 不是studentdao 瞎了

		if(student!=null){
			session.setAttribute("username", username);
			res.sendRedirect("login/success.jsp");
		}
		else
		{
			res.sendRedirect("login/error.jsp");
		}

	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
	{
		doGet(req,res);
	}
}
