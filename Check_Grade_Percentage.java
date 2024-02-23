class Check_Grade_Percentage{
   
   public static void main(String[] args){
     int sub1=90,sub2=80,sub3=80,sub4=90,sub5=90;//all subject
     int totalMarks=500;
     int sum= sub1+sub2+sub3+sub4+sub5;//sum of all subject
     double percentage;
     percentage=(sum*100)/totalMarks;//formula to calculate percentage
     System.out.println(percentage);
     int p =(int)percentage;//type cast
     System.out.println(p);
     String result=(p>=100||p<=90)?("grade A"):((p>=80||p<=70)?("grade B"):(p>=70||p<=60)?("grade C"):("Fail"));//ternery operator
     System.out.println(result);
   }
}
/*OUTPUT:
 86.0
 86
 grade A
*/