import java.util.Scanner;

public class NameCheck {
    public static void main(String[] args) {
        //Create scanner object
        Scanner x = new Scanner(System.in);

        //Prompt that asks for name of user
        System.out.println("What is your name, user?");
        //wait for user to enter line
        String name = x.nextLine();

        //Create if statement that says if the names Alice or Bob are entered, greeting message displays
        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.print("Greetings" + " " +  name);
        }

            else{
                System.out.println("You are not qualified for a greeting.");
            }

        }
    }
