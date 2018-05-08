package data.model;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String sec;
    private int Student_id;
    private String exp;
    public Student()
    {


    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getSec() {
        return sec;
    }


    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

}
