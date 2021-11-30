package ru.skypro;

public class Main {

    public static void main(String[] args) {

	int[] firstArray= new int[3];
	    firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        for (int i = 0; i <= 2; i++) {
            if (i != 2){
                System.out.print(firstArray[i] + ", ");
            } else {
                System.out.println(firstArray[i]);
            }
        }
        for (int l = firstArray.length - 1; l >= 0 ; l--) {
            if (l != 0){
                System.out.print(firstArray[l] + ", ");
            } else {
                System.out.println(firstArray[l]);
            }
        }
        for (int o = 0; o < firstArray.length; o++) {
           if(firstArray[o] % 2 != 0) {
               firstArray[o] = firstArray[o] + 1;
            }if (o != 2){
                System.out.print(firstArray[o] + ", ");
            } else {
                System.out.println(firstArray[o]);
            }

        }
        System.out.println();

    double[] secondArray = {1.57, 7.654, 9.986 };

        for (int j = 0; j <= 2; j++) {
            if (j != 2){
                System.out.print(secondArray[j] + ", ");
            } else {
                System.out.println(secondArray[j]);
            }
        }
        for (int m = secondArray.length - 1; m >= 0 ; m--) {
            if (m != 0){
                System.out.print(secondArray[m] + ", ");
            } else {
                System.out.println(secondArray[m]);
            }
        }
        System.out.println();

    char[] thirdArray = {100, 253, 33};

        for (int k = 0; k <= 2; k++) {
            if (k != 2){
                System.out.print(thirdArray[k] + ", ");
            } else {
                System.out.println(thirdArray[k]);
            }
        }
        for (int n = thirdArray.length - 1; n >= 0 ; n--) {
            if (n != 0){
                System.out.print(thirdArray[n] + ", ");
            } else {
                System.out.println(thirdArray[n]);
            }
        }
    }
}
