public class TestaLaco2 {

    public static void main(String[] args){
        /* imprimir uma matriz triangular no padrão abaixo:

        *
        **
        ***
        ****
        *****
        etc..

         */
        for (int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}