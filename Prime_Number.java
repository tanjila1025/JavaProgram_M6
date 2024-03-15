class Prime_Number{
  
  public static void main(String[] args){
   
    int num=5;
    int i=2;
    int count=0;
    while(num>i){

     if(num/i==0){
       count++;
      }
     i++;
    if(count==0){
    
      System.out.println("Prime number");
    }  
   else{
     System.out.println("Not Prime number");
      }
   }
  } 
}
/*OUTPUT:
  Prime number
*/