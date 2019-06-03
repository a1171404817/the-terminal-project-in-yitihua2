package servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import sizeyunsuan.*;
public class mainYunSuanServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");

        HttpSession session=req.getSession();
        int shuliang=20;
        int yunsfn=5;
        int zuojie=1;
        int youjie=20;
        String[] havafx=req.getParameterValues("vehicle");

        boolean havacc=false;
        boolean havakh=false;
        if(havafx==null)
        {
            havacc=false;havakh=false;
        }
        else if(havafx.length==2)
        {
            havacc=true;havakh=true;
        }
        else if(havafx.length==1)
        {
            if(havafx[0].equals("havacc"))
            {
                havacc=true;havakh=false;
            }
            else
            {
                havacc=false;havakh=true;
            }
        }

        ArrayList<ArrayList<String>> als=new init().initString(shuliang,yunsfn,zuojie,youjie,havacc,havakh);

        session.setAttribute("als", als);

        res.sendRedirect("exam/test.jsp");




    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
