class Eligible_For_Exam{
  
  public static void main(String[] args){
    
   int marks=95,scholarshipMarks=85;
  
    if(marks>=90){
    
        if(scholarshipMarks>=85){
          
            System.out.println("Congratultion!! you are eligible");
          }
          else{
               System.out.println(" you are not eligible!!");
              }
        }
    else{
          System.out.println(" your marks are to low!!");
        }
     }
}/*OUTPUT:
  R.T:success
  C.T:success
  Congratulation!! you are eligible
*/
