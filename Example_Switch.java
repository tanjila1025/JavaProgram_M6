/* write a java program to check week days using switch(without break)*/

class Example_Switch{
   
   public static void main(String[] args){
   
    int dayNum=7;
    
    switch(dayNum){
   
    case 1: System.out.println("Monday");
    case 2: System.out.println("Tuesday");
    case 3: System.out.println("Wednesday");
    case 4: System.out.println("Thursday");
    case 5: System.out.println("Friday");
    case 6: System.out.println("Saturday");
    case 7: System.out.println("Sunday");
    defult: System.out.println("Not valid");
   }
 }
}

/*OUTPUT:
   
C.T:success
R.T:success
sunday
not valid

*/
