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
public class traditionalshowresultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {     req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        tidao tidao=new tidao();
        ArrayList<Ti> traditionArti= tidao.getAll();
        session.setAttribute("traditionArti",traditionArti);

            res.sendRedirect("exam/traditiondati.jsp");




    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
