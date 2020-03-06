import java.util.Scanner;
public class FunnyString{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a favourite color,food,animal and the first name of your friend");
        String color,food,animal,name;
        color =sc.nextLine();
        food =sc.nextLine();
        animal =sc.nextLine();
        name =sc.nextLine();
        System.out.println("I had a dream that "+name+" ate a "+color+" "+animal+" and said it tasted like "+food+" !");
    }
}
