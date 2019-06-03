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
import dao.*;
public class chutiServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        ArrayList<String> arrti=new ArrayList<String>();

        for(int i=0;i<5;i++)
        {
            arrti.add(req.getParameter("tiname"+i));

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(arrti.get(i));
        }
        tidao tidao =new tidao();
        for(int i=0;i<5;i++)
        {   Ti ti=new Ti(String.valueOf(i+1),arrti.get(i));
            tidao.update(ti);
        }
        tidao.getAll();
        res.sendRedirect("login/success_teacher.jsp");

    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
