package capitulo1.pesquisa_binaria;

public class Main {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9};

        System.out.println(pesquisaBinaria(lista, 3));
        System.out.println(pesquisaBinaria(lista, -1));
    }

    public static int pesquisaBinaria(int[] lista, int item) {
        if (isListaVazia(lista)) {
            return -1;
        }

        int baixo = 0;
        int alto = lista.length;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
//            System.out.println(lista[meio]);
//            System.out.println("----------------------------");
            if (chuteIgualItem(chute, item)) {
                return meio;
            } else if (chuteMaiorQueItem(chute, item)) {
                alto = meio - 1;
            } else if (chuteMenorQueItem(chute, item)) {
                baixo = meio + 1;
            }
        }

        return -1;
    }

    public static boolean isListaVazia(int[] lista) {
        int tamanho = lista.length;
        if (tamanho == 0)
            return true;
        return false;
    }

    public static boolean chuteIgualItem(int chute, int item) {
        if (chute != item) {
            return false;
        }
        return true;
    }

    public static boolean chuteMaiorQueItem(int chute, int item) {
        if (chute < item) {
            return false;
        }
        return true;
    }

    public static boolean chuteMenorQueItem(int chute,int item) {
        if (chute > item) {
            return false;
        }
        return true;
    }
}