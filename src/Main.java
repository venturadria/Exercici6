import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);

        int[] numerosentrada = new int[8];

        int valorcercat = 0;
        int posiciovalor = -1;

        for (int i = 0; i < numerosentrada.length; i++){
            System.out.println("Introdueix el número " + (i+1) + "/" + numerosentrada.length + " (Índex " + i + ")");
            numerosentrada[i] = llegir.nextInt();
        }

        System.out.println("Introdueix el valor que vols buscar:");
        valorcercat = llegir.nextInt();

        int i = 0;
        while (i < numerosentrada.length && posiciovalor == -1){
            if (numerosentrada[i] == valorcercat){
                posiciovalor = i;
            }
            i++;
        }

        if  (posiciovalor == -1){
            System.out.println("No trobat");
        }
        else
            System.out.println("Valor trobat a l'índex " + posiciovalor);

    }
}
