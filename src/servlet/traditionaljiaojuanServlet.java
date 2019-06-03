package servlet;

import dao.Ti_anwerdao;
import dao.tidao;
import entity.Ti;
import entity.Ti_anwer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class traditionaljiaojuanServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {     req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        tidao tidao=new tidao();
        ArrayList<Ti> traditionArti= tidao.getAll();
        session.setAttribute("traditionArti",traditionArti);

        ArrayList<String> arrTi_anwser=new ArrayList<String>();
        for(int i=0;i<5;i++)
        {
        arrTi_anwser.add(req.getParameter("jiandatianwername"+i));

        }



        Ti_anwerdao ti_anwerdao=new Ti_anwerdao();

        String username=(String)session.getAttribute("username");


        for(int i=0;i<5;i++) {
            System.out.println(traditionArti.size()+"::"+arrTi_anwser.size());
            Ti_anwer ti_anwer = new Ti_anwer(username, traditionArti.get(i).getTi(), arrTi_anwser.get(i), null);

            ti_anwerdao.insert(ti_anwer);
        }





        res.sendRedirect("login/success.jsp");




    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
