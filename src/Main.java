import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = getRandomInt();
        sprawdz(x);
    }
        public static void sprawdz(int x){
            int liczba = getUserValue();

            if(x > liczba){
                System.out.println("X jest większa - próbuj dalej!");
                sprawdz(x);
        }
            if(x < liczba){
                System.out.println("X jest mniejsza - próbuj dalej!");
                sprawdz(x);
        }
            if(x == liczba){
                System.out.println("SUKCES! BRAWO TY!");
        }
    }
    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(100);
    }
    public static int getUserValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }
}
