import java.util.Scanner;
class Game{
    int random;
    int guess;
    public Game(){
            random = 45;
    }
    public void takeInputs(){
        System.out.println("Guess the number\n");
        Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();

        

    }
    public void check(){
          
        if(guess>random){
             System.out.println("Oops!!\n This is an incorrect guess.Choose a smaller number.");
        }
             else if(guess<random){
                System.out.println("Oops!!\n This is an incorrect guess.Choose a greater number.");
             }
             else{
                System.out.println("Congratulations!!\n You have guessed the correct number.");
             }
        
    }
    
    }


class Task1{
    public static void main(String[] args) {
        int count = 19;
        Game Mitaly = new Game();
        for(int i = 0 ; i<=20;i++){
        Mitaly.takeInputs();
        Mitaly.check();
        System.out.println("You have "+ count +" guesses remaining.");
        count--;
    }
   
}
}