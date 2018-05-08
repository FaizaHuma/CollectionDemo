package Controller;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import data.model.Student;

import java.sql.*;

@ManagedBean(name = "StudentCon")

public class StudentControl {
    Student st=new Student();
    public List lst=new ArrayList();

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public String viewStudentInfo()
    {
        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","Computer_lab","bup_lab");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select*from computer_student");



            while(rs.next())
            {
                String sec=rs.getString(2);
                int id=rs.getInt(1);
                st.setStudent_id(id);
                st.setSec(sec);
                lst.add(st);


            }

            con.close();
            return "view";


        }
        catch (Exception e)
        {
            String exp=String.valueOf(e);
            st.setExp(exp);

        }

        return "exception";

    }
}
