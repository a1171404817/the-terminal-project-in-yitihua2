import entity.Student;
import dao.studentdao;
import db.db;
import  entity.Tiku;
import  dao.tikudao;
import  dao.*;
import  entity.*;

import java.util.ArrayList;

public class test1 {
    public static void main(String[]args)
    {
//        studentdao studentdao=new studentdao();
//
//
//        Student s1=studentdao.checkUser("a123456","a123456");
//        System.out.println(s1!=null);
//        Student s2=studentdao.checkUser("aaaaa","aaaaaa");
//        System.out.println(s2!=null);
//        studentdao.getAll();
//        studentdao.insert(new Student("a123456","a123456","Achilles", "Male", "14"));
//        studentdao.insert(new Student("b123456","b123456","bchilles", "bale", "24"));
//        studentdao.getAll();
//
//        Tiku tiku=new Tiku("a123456","2+2+3+4+5","16","14","0");
//        tikudao tikudao=new tikudao();
//        tikudao.insert(tiku);
//
//        tikudao.getAll();
//        ArrayList<Tiku>  ay=tikudao.getTiku();

//        for(int i=0;i<ay.size();i++)
//        {
//            System.out.println(ay.get(i).getId()+" "+ay.get(i).getUsername()+" "+ay.get(i).getTi()+" "+ay.get(i).getDoDate());
//        }
//
//        marksbar marksbar=new marksbar("a123456","2019-6-1 18:42","80");
//        marksbardao marksbardao=new marksbardao();
//
//       ArrayList<marksbar> marksbars=marksbardao.getmarksbar();
//      for(int i=0;i<marksbars.size();i++)
//      {
//          System.out.println(marksbars.get(i).getId()+" "+marksbars.get(i).getUsername()+" "+marksbars.get(i).getsdate()+" "+marksbar.getmark());
//      }

//        tikudao tikudao=new tikudao();
//        ArrayList<Tiku> tikus=new tikudao().getownTiku("aaa");
//        for(int i=0;i<tikus.size();i++)
//        {
//            System.out.println(tikus.get(i).getUsername()+" "+tikus.get(i).getTi());
//        }
//        tidao tidao=new tidao();
//        Ti ti=new Ti("1","如何理解全面深化改革的总目标?");
//        tidao.update(ti);
//
//        ArrayList<Ti> arti= tidao.getAll();
//
//        for(int i=0;i<arti.size();i++)
//        {
//            System.out.println(arti.get(i).getId()+" "+arti.get(i).getTi());
//        }
//        Ti_anwer ti_anwer=new Ti_anwer("a123456","gagagagag","aaaa","90");
        Ti_anwerdao ti_anwerdao=new Ti_anwerdao();
//        ti_anwerdao.insert(ti_anwer);
//        ti_anwerdao.getAll();
        ti_anwerdao.update("501","99");
        ArrayList<Ti_anwer> arti=ti_anwerdao.getTiku();
        for(int i=0;i<arti.size();i++)
        {
            System.out.println(arti.get(i).getId()+" "+arti.get(i).getUsername()+" "+arti.get(i).getTi()+" "+arti.get(i).getYouranwer()+" "+arti.get(i).getMark()+" "+arti.get(i).getdodate());
        }

    }
}
