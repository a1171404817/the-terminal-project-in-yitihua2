package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Tiku;
import sizeyunsuan.*;
import java.lang.*;
import dao.tikudao;
public class showresultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {

        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");

        HttpSession session=req.getSession();
        tikudao tikudao=new tikudao();
        String username=(String)session.getAttribute("username");
        ArrayList<Tiku> tiku=tikudao.getownTiku(username);
        session.setAttribute("tiku", tiku);

        if(tiku.size()==0){
            res.sendRedirect("exam/watch_fail.jsp");
        }else {
            res.sendRedirect("exam/watch.jsp");
        }

    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
