class CheckGreaterValue{
   
  public static void main(String[] args){
     int v1=25;//L.H.S
     int v2=26;//R.H.S
     boolean r1=v1>v2;
     boolean r2=v2>v1;
     System.out.println("V1 is greater than v2:" +r1); 
     System.out.println("V2 is greater than v1:" +r2);

    }
}
   /*OUTPUT: 
     compile time:success
     runtime :success
     V1 is greater than v2: false
     V1 is greater than v2: true
   */