
import java.util.*;


public class taxe {

    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<5000000)
        {
            tax=0;
        
        }
        else if(income>500000 && income<1500000)
        {tax=(int)(income * 0.20);

        }
  else {
    tax=(int)(income * 0.3);
  }
  System.out.println("your tax is:"+tax);
    }
}
