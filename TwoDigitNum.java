class TwoDigitNum{

public static void main(String[] ags){
   
  int num=97;
  if(num<100){
      
     if(num % 10 == 7 || num % 7 == 0)
       {
       System.out.println("Number is buzz number");
       }
   }
   else
   {
    System.out.println("Number is not buzz number!!");
   }
 }
}