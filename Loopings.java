import java.util.Scanner;

public class Loopings {
    public static void main(String[] args){
        /* for (int i = 0; i <= 100; i++){
            if(i >= 50){
                System.out.println(i);
            }
        } */
        int note = 0;

        Scanner r = new Scanner(System.in);
        while (note != -1){
            System.out.println("Type -1 to exit");
            note = r.nextInt();

        }
    }
}
