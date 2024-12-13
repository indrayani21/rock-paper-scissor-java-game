import java.util.*;
public class rock_paper_scissor {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the chances:");
        int chances=sc.nextInt();
        System.out.println("enter rock paper or scissor");
        String user=sc.nextLine();
        System.out.println("enter the computer choice too");
        String computer=sc.nextLine();
        int user_point=0;
        int computer_point=0;
        for(int i=1;i<=chances;i++){
            
            if ((user.equals("rock") && computer.equals("scissor")) ||(user.equals("scissor") && computer.equals("paper")) ||(user.equals("paper") && computer.equals("rock"))){
                    System.out.println("user gets a point");
                    user_point++;
                } else  if ((user.equals("rock") && computer.equals("rock")) ||
                (user.equals("scissor") && computer.equals("scissor")) ||
                (user.equals("paper") && computer.equals("paper"))){
                    System.out.println("both get tie no one gets point");   
                }
                else{
                    System.out.println("computer gets point");
                    computer_point++;
                }
         user=sc.nextLine();
         computer=sc.nextLine();
        }
        System.out.println("the points of user: "+user_point+"\ncomputer points: "+computer_point);
        if(user_point>computer_point){
            System.out.println("the user wins the game of rock paper scissor");
        }
        else{
            System.out.println("the computer wins the games of rock paper scissor");
        }
    }
}
