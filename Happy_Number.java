public class Happy_Number {
    public static void main(String[] args){
        int num=400;
        int sum=0;
        ab:while(num>9||sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
          bc:while(num>0){
            int rem =num%10;
            sum=(rem*rem)+sum;
            num=num/10;
          }
        }
        if(sum==1||num==1){
            System.out.println("it is happy number");
        }
        else{
            System.out.println("it is not happy number");
        }
    }
}
