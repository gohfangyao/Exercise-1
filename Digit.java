import java.util.Scanner;
public class Digit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digit");
        int digit=sc.nextInt();     //String digit=sc.nextLine();
        String s = ""+digit;        //
        int i,sum=0;
            for(i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
        }

        for(i = 0; i < s.length(); i++){
            sum = sum + Integer.parseInt(s.charAt(i) + "");
        }
        System.out.print("Sum is : "+sum);
    }
}
