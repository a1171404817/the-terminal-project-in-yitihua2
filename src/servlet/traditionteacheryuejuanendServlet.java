package servlet;
import  java.lang.*;
import dao.tikudao;
import entity.Ti_anwer;
import entity.Tiku;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.*;
import sizeyunsuan.*;
import java.lang.*;
import dao.*;


public class traditionteacheryuejuanendServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {

        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");

        HttpSession session=req.getSession();
        ArrayList<Ti_anwer> traditionarrti_anwer=(ArrayList<Ti_anwer>)session.getAttribute("traditionArti_anwer");

        ArrayList<String> marks=new ArrayList<String>();
        for(int i=0;i<traditionarrti_anwer.size();i++)
        {
            marks.add(req.getParameter("markn"+i));

        }
        String startid=traditionarrti_anwer.get(0).getId();
        Ti_anwerdao ti_anwerdao=new Ti_anwerdao();

        for(int i=0;i<traditionarrti_anwer.size();i++)
        {
            ti_anwerdao.update(String.valueOf(Integer.parseInt(startid)+i),marks.get(i));
        }


        res.sendRedirect("login/success_teacher.jsp");
    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}






