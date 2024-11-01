import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int contador = 1;
        int Apro = 0;
        int Condicionado= 0;
        int Suspenso = 0;
        while (contador != 7) {
            System.out.println("Diga uma nota: ");
            nota = sc.nextInt();
            if(nota>=0 && nota<=10) {
                if (nota >= 5 && nota <= 10) {
                    Apro++;
                    contador++;
                }else if (nota == 4) {
                    Condicionado++;
                    contador++;
                }else{
                    Suspenso++;
                    contador++;
                }
            }else{
                System.out.println("No entra dentro del rango de nota, revisa la nota y pon la correcta");
            }
        }
        System.out.println("Aprobados: "+Apro+", condicionados: "+Condicionado+", suspenso: "+Suspenso);
    }
}