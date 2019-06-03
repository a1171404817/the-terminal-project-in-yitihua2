package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.teacherdao;
import entity.*;
public class mainteacherServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");

        String username=req.getParameter("username");
        String pwd=req.getParameter("pwd");

        teacherdao teacherdao=new teacherdao();
        HttpSession session=req.getSession();


        Teacher teacher=teacherdao.checkUser(username,pwd);

        System.out.print(teacher!=null);

        if(teacher!=null){
            session.setAttribute("username_teacher", username);
            res.sendRedirect("login/success_teacher.jsp");
        }
        else
        {
            res.sendRedirect("login/error_teacher.jsp");
        }

    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
