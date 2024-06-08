import java.util.Scanner;

public class ReadInformation {
    public static void main(String[] args) {
        Scanner readIt = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 7");
        int dayOfWeek = readIt.nextInt();
        switch(dayOfWeek){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                break;
        };
    }
}
