public class TestaLacos {

    public static void main(String[] args){
        // imprimir tabuada de 1 até 10
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for(int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}