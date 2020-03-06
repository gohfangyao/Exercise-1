import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String date = input.next();

        String newDateFormat = date.replaceAll("/",".");
        System.out.println("Output: " +newDateFormat);

    }
}
