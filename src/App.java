import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Qual a sua nota? ");
        nota = scan.nextInt();
       while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente...: ");
            nota = scan.nextInt();
        }
       
    }
}
