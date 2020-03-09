import java.util.Scanner;
public class Hello {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = scan.next();
        System.out.println("It's nice to meet you, "+name+ ". How old are you?");
        int age = scan.nextInt();
        // i am naming the int. age thus when i have to call upon it I can just add age.
        System.out.println("I see that you are still quite young at only "+age+".");
        System.out.println("Where do you live?");//This is the added comment
        String home =scan.next();
        System.out.println("Wow! I've always wanted to go to "+home+". Thanks for chatting with me. Bye! ");
    }
}
