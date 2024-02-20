class CheckSpecialChar{
   
  public static void main(String[] args){
          
     char c1='@';//variable decleration & initialization
     String result=(c1>=65&&c1<=90 || c1>=97&&c1<=122)?((c1>=65&&c1<=90)?("lowercase"):("uppercase")):("given char is special char");//using ternery operator
     System.out.println(result);
  }
}
/*OUTPUT:
C.T:success
R.T:success
 given char is special char
*/