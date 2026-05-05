import java.util.*;
public class MarksCal {
    public static String MarksGrade(int marks){
        if(marks>=91&&marks<=100){
            return "AA Grade";
        }else if(marks>=81&&marks<=90){
            return "AB Grade";
        }else if(marks>=71&&marks<=80){
            return "BB Grade";
        }else if(marks>=61&&marks<=70){
            return "BC Grade";
        }else if(marks>=51&&marks<=60){
            return "CD Grade";
        }else if(marks>=41&&marks<=50){
            return "DD Grade";
        }else if(marks<=40&&marks>=0){
            return "Fail";
        }else{
            return "Enter correct marks";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=sc.nextInt();

        String result=MarksGrade(marks);
        System.out.println("Student Marks: "+marks+" and Grade is: "+result);
    }
}
