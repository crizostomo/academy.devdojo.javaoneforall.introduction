package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int [][] array = new int[3][];
        int [] numbers = {1, 2, 3};

        array[0] = new int[]{1, 2};
        array[1] = numbers;
        array[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] array2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        /*
        "array2" é um outro jeito de executar "array", para verificar isso
        basta trocar logo abaixo no for de "array" para "array2"
         */

        for(int[] baseArray: array){
            System.out.println("\n--------");
            for(int num : baseArray){
                System.out.print(num + " ");
            }
        }
    }
}
