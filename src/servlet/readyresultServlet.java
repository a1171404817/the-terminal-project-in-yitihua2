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
import  dao.marksbardao;
import  entity.marksbar;

public class readyresultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {

        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");

        HttpSession session=req.getSession();
        ArrayList<ArrayList<String>> als=(ArrayList<ArrayList<String>>)session.getAttribute("als");


        ArrayList<String> userAnswer=new ArrayList<String>();

        for(int i=0;i<als.size();i++)
        {
            userAnswer.add(req.getParameter("fname"+i));

        }
        session.setAttribute("userAnswer", userAnswer);


        ArrayList<String> marks=new ArrayList<String>();
        int fenshu=0;
        for(int i=0;i<als.size();i++)
        {
            if(als.get(i).get(1).equals(userAnswer.get(i)))
            {

                marks.add("5");
                fenshu+=5;
            }
            else {

                marks.add("0");
            }
        }

        session.setAttribute("fenshu", fenshu);

        tikudao tikudao = new tikudao();

        for(int i=0;i<als.size();i++) {
            Tiku tiku = new Tiku((String) session.getAttribute("username"), als.get(i).get(0), als.get(i).get(1), userAnswer.get(i), marks.get(i));

            tikudao.insert(tiku);
        }
        tikudao.getAll();


        String username=(String)session.getAttribute("username");
        ArrayList<Tiku> tikus=tikudao.getTiku();

        String sdate=tikus.get(tikus.size()-1).getDoDate();

        marksbar marksbar=new marksbar(username,sdate,String.valueOf(fenshu));
        marksbardao marksbardao=new marksbardao();
        marksbardao.insert(marksbar);

        ArrayList<marksbar> marksbars=marksbardao.getmarksbar();
        session.setAttribute("marksbar",marksbars);

        res.sendRedirect("login/success.jsp");

    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
