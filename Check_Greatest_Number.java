class Check_Greatest_Number{
   
   public static void main(String[] args){
     
     int a=30,b=40,c=60;
     String result=(a>b)?("a is greatest"):((b>c)?("b is greatest"):(a<c)?("c is greatest"):("enter valid number"));
     System.out.println(result);  
   }
}
/*OUTPUT:
 * c is greatest
 */