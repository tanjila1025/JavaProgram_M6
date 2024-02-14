class EligibleVotingAge{

  public static void main(String[] eav){
     
    int a=18;
    int b=20;
    boolean result=b>a;
    boolean result1=a>b;
    boolean result2=b>a;
    System.out.println("Eligible age is:" +a);
    System.out.println("Eligible age is:" +result);
    System.out.println("a is greater than b is:" +result1);
    System.out.println("b is greater than a is:" +result2);
    }
}
    /*OUTPUT:
     compile time:success
     runtime :success 
     Eligible age is: 18
     Eligible age is: true
     a is greater than b : false
     b is greater than a : true
    */
