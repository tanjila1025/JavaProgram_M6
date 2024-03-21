public class EvilNumber {
    public static void main(String[] args){
        int n=36;
        int binary=0;
        int b=1;
        while(n>0){
            int rem=n%2;//for binary conversion
            binary=binary+(rem*b);
            n=n/2;
            b=b*10;
        }
        int c=0;
        while(binary>0){
            int rem=binary%10;//for checking number of even number digit in binary 
            if(rem==1){
                c++;
            }
            binary=binary/10;
        }
        if(c%2==0){
            System.out.println("its evil number");//for evil or not
        }
        else{
            System.out.println("its not evil number");
        }
    }
}
