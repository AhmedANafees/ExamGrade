import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class ExamGrade {
public static String converter(int num)
{
String Lgrade = "A";
if (num < 50)
{
Lgrade = "F";
}
else if (num >= 50 && num <= 59)
{
Lgrade = "D";
}
else if (num >59 && num < 70)
{
Lgrade = "C";
}
else if (num >69 && num <=79)
{
Lgrade = "B";
}
else if (num > 80)
{
Lgrade = "A";
}
    return Lgrade;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);        
System.out.println("Enter grade earned");
int num = input.nextInt();
String grade = converter(num);
System.out.println(grade);
    }

    private static String conerter(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
