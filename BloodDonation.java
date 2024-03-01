class BloodDonation{
    
   public static void main(String[] args){
   
   char bloodType='O';
   int hemoglobin=13;
   int age=25;
   char drugs='N';
   char disease='N';
    
   if(age>=20&&age<=60)
    {
      if(hemoglobin>=13)
        {
          if(disease=='N')
            {
              if(drugs=='N')
               {
                 System.out.println("You can donate blood");
                }
                else{
                      System.out.println("Not allowed");
                     }
                  }
                else{
                       System.out.println("not allowed");
                     }
                 }
                 else{
                        System.out.println("not allowed");
                      }
                  }
                 else{
                       System.out.println("Try next time");
                     }
                  }
              }
  /*OUTPUT:
    C.T:success
    R.T:success
    You can donate blood
  */
  
