class Check_Percentage{
   
    public static void main(String[] args){
    int a=70;
    String result=(a>60&&a<=70)?("grade A"):("fail");
    System.out.println(result);
    int b=35;
    String result1=(b>=80&&b<=90)?("grade A"):((b>=70&&b<=60)?(" grade B"):(b>=50&&b<=40)?(" grade C"):("fail"));
    System.out.println(result1);
   }
}
/*OUTPUT:
  C.T:success
  R.T:success
  grade A
  fail
 */