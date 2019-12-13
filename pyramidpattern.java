
package second;

import java.util.*;

public class Second {

    public static void main(String[] args) {
 Scanner asd = new Scanner(System.in);
 int t = asd.nextInt();
 displayPattern(t);
    }
    public static void displayPattern(int a){
        for(int i = 0;i <= a-2;i++){
            for(int j = 0;j <= i;j++){
                System.out.print((int)Math.pow(2*j+1, 2)+" ");
            }System.out.println();
        }
        for(int i = (a-1);i >= 0;i--){
            for(int j = 0;j <= i;++j){
               
                System.out.print((int)Math.pow((2*j+1), 2)+" ");
                
                }System.out.println();
               
}
        }
    }
