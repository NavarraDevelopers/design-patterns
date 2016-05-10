import java.util.Scanner;

public class Game{

    public static void main(String... args){
        Martians martians;
        Computer computer;
        Player player;
        Scanner sc;
        martians = Martians.getMartians();
        computer = new Computer();
        sc = new Scanner(System.in);

        int shots;

        do{
            System.out.print("Type the shots");
            shots = sc.nextInt();
            for(int i=0; i<shots;i++){
                player.attackMartians();
            }
            computer.createMartians();
            martians.resultMartians();
        }while(shots != 0)

    }

}