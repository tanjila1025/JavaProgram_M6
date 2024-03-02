class Check_DataType_UsingSwitch{
    
 public static void main(String[] args){
   
 final boolean v=true;
  
  switch(v){
  
  case 1: System.out.println("true");
  break;
  case 2: System.out.println("false");
  break;
  }
 }
}
/*OUTPUT:
 C.T:Error(boolean can not converted into int value always fix/constant)
*/