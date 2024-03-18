import java.io.*;
import java.util.*;

public class Check_CoPrime_Number {
    public static void main(String[] args){
        int a=11,b=12,p,i,x=0;
        p=a*b;
        for(i=1;i<p;i++){
          
             if(a%i==0 && b%i==0){
                x=i;
             }
        }
        if(x==1){
            System.out.println("number is coprime:"+a+" & "+b);
        }
        else{
            System.out.println("number is not co prime:"+a+" & "+b);
        }

    }
}
