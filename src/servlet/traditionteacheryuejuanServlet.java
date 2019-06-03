package servlet;

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


    public class traditionteacheryuejuanServlet extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException,IOException
        {

            req.setCharacterEncoding("utf-8");
            res.setContentType("text/html;charset=utf-8");

            HttpSession session=req.getSession();

            Ti_anwerdao ti_anwerdao=new Ti_anwerdao();
            ArrayList<Ti_anwer> traditionArti_anwer=ti_anwerdao.getTiku();

            System.out.println("warn........................"+traditionArti_anwer.size());

            session.setAttribute("traditionArti_anwer",traditionArti_anwer);

            res.sendRedirect("exam/traditionpanti.jsp");
        }



        public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
        {
            doGet(req,res);
        }
    }






