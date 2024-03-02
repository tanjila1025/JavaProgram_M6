//write a program in java to check week days using switch conditional statement(using break).


class Switch_Case{
  
   public static void main(String[] args){
   int dayNum=2;
   
   switch(dayNum){
    
    case 1: System.out.println("Monday");
    break;
    case 2: System.out.println("Tuesday");
    break;
    case 3: System.out.println("Wednesday");
    break;
    case 4: System.out.println("Thursday");
    break;
    case 5: System.out.println("Friday");
    break;
    case 6: System.out.println("Saturday");
    break;
    case 7: System.out.println("Sunday");
    break;
    default: System.out.println("Not valid");
   }
 }
}
/*OUTPUT:
  C.T:success
  R.T:success
  Tuesday
*/
   