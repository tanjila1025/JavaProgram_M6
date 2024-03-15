class Table_Using_DoWhile{
  
  public static void main(String[] args){
   
   int product=0;
   int n=1;
   do{
   
      product=3*n;
       if(product%2==0){
         System.out.println(product);
         }
         n++;
       }while(n<=20);
    }
}
 /*OUTPUT:
   
6
12
18
24
30
36
42
48
54
60
*/

 