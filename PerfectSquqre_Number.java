public class PerfectSquqre_Number {
    public static void main(String[] args){
        int num=9;
        int sqr=0,i=1;
        while(sqr<=num){
            if(sqr==num){
                System.out.println("Its perfect sqr number");
                break;
            }
            sqr=i*i;
            i++;
        }
        if(sqr>num){
            System.out.println("Its not perfect sqr number");
        }
    }
}
