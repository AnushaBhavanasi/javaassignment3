import java.util.Scanner;

public class AverageMarks {


    public String computeMarksEqual(int marks){
        String res="";
        if(marks>0&&marks<100)
            res="true";
        return res;

    }
    public String computeMarksLess(int marks){
        String res="";
        if(marks<0)
            res="Input should not be less than 0";
        return res;

    }
    public String computeMarksGreater(int marks){
        String res="";
        if(marks>100) {
            res = "Input should not be greater than 100";
        }
        return res;

    }
}
