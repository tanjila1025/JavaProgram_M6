public class Mark_Sheet_Project {
        public static void main(String[] args){
         
        String cname="A.G.Patil Institute of Technology Solapur";
        String affiliated="Dr.Baba Saheb Ambedkar Techology University";
        String sname="Tanjila";
        String rollno="1",sec="A",e1="sem";//student info
        //task2
        String s1="DL",s2="ML",s3="CN",s4="AI",s5="BDA";//total subject
        int SB1=90,SB2=80,SB3=70,SB4=60,SB5=50;//subject marks
        int FM=100;//full marks
        int ob=SB1+SB2+SB3+SB4+SB5;//obtained marks
        double p=ob/5;//percentage
        String R1="Good",S1="P.B.Kulkarni";
        //grade
        String grade=(p>=90&&p<=100)?("A"):((p>=70&&p<=80)?("B"):(p>=60&&p<=50)?("C"):(p>=40&&p<=30)?("D"):("Fail"));//ternery operator
        System.out.println("*****************************************************************************************************************************************");
        System.out.println("                                           "+cname);
        System.out.println();
        System.out.println("                                           "+affiliated);
        System.out.println(); 
        System.out.println("*****************************************************************************************************************************************");
        System.out.println(" Name:"+sname+"                                                                  Date:12/5/2023");
        System.out.println("*****************************************************************************************************************************************");
        System.out.println(" Roll NO:"+rollno+"                         Section:"+sec+"                                     Exam:"+e1);
        System.out.println("*****************************************************************************************************************************************");
        System.out.println();//subject,marks,obtained marks
        System.out.println("Subject                                             Full Mraks                          Obtained Marks");
        System.out.println("*****************************************************************************************************************************************");
        System.out.println(" #"+s1+"                                                    "+FM+"                                   "+SB1);
        System.out.println();
        System.out.println(" #"+s2+"                                                    "+FM+"                                   "+SB2);
        System.out.println(); 
        System.out.println(" #"+s3+"                                                    "+FM+"                                   "+SB3);
        System.out.println();
        System.out.println(" #"+s4+"                                                    "+FM+"                                   "+SB4);
        System.out.println();
        System.out.println(" #"+s5+"                                                   "+FM+"                                   "+SB5);
        System.out.println();
        System.out.println("******************************************************************************************************************************************");
        System.out.println("Total Subject:5"+"                                    Total Full Marks:500"+"                    Marks_Obtained:"+ob);
        System.out.println();
        System.out.println("******************************************************************************************************************************************");
        System.out.println("Percentage:"+p+"                                                                                   Grade:"+grade);
        System.out.println();   
        System.out.println("******************************************************************************************************************************************");
        System.out.println(" Remark:"+R1+"                                                                                      Sign:"+S1);
        System.out.println("******************************************************************************************************************************************");
       }
    }