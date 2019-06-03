package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Tiku;
import entity.marksbar;
import sizeyunsuan.*;
import java.lang.*;
import dao.tikudao;
import dao.*;
import entity.*;
public class showteacherresultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {     req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        marksbardao marksbardao=new marksbardao();
        ArrayList<marksbar> marksbars=marksbardao.getmarksbar();
        session.setAttribute("marksbars",marksbars);
        res.sendRedirect("exam/judge_teacher.jsp");

    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
