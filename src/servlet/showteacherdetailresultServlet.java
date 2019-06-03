package servlet;

import dao.marksbardao;
import dao.tikudao;
import entity.Tiku;
import entity.marksbar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class showteacherdetailresultServlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws UnsupportedEncodingException,IOException
    {     req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();

        tikudao tikudao=new tikudao();
        ArrayList<Tiku> tikuall=tikudao.getTiku();
        session.setAttribute("tikuall", tikuall);

        res.sendRedirect("exam/judge_detail_teacher.jsp");

    }



    public void doPost(HttpServletRequest req,HttpServletResponse res)throws UnsupportedEncodingException,IOException
    {
        doGet(req,res);
    }
}
