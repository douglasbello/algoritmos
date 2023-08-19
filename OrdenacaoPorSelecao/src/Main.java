public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};

        int[] arrOrdenado = ordenacaoPorSelecao(arr);
        for (int numero : arrOrdenado) {
            System.out.println(numero);
        }
    }

    public static Integer buscaMenor(int[] arr) {
        int menor = arr[0];
        int menorIndice = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public static int[] ordenacaoPorSelecao(int[] arr) {
        int[] novoArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int menorIndice = buscaMenor(arr); // Buscar o índice do menor elemento
            novoArr[i] = arr[menorIndice]; // Copiar o menor elemento para o novo array

            // "Remover" o menor elemento do array original
            arr[menorIndice] = Integer.MAX_VALUE;
        }
        return novoArr;
    }
}