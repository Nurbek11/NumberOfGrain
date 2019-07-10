package com.epam.brainStorm;

public class Queen {

    static int rows = 9;
    static int columns = 9;
    static String[][] array = new String[rows][columns];

    public static void main(String[] args) {
        fill();
        print();
        System.out.println();
        marking(6,7);
        print();
    }

    public static void fill() {
        for (int i = 1; i <rows; i++)
            for (int j = 1; j <columns; j++)
                array[i][j] = Integer.toString(i) + Integer.toString(j);
    }

    public static void print() {
        for (int i = 1; i <rows; i++) {
            for (int j = 1; j <columns; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void search() {
        int counter = 0;
        while (counter < 8) {

        }
    }


    public static void marking(int col, int row) {
        for (int i = 1;i<columns; i++){
            array[row][i] = "xx";
        }
        for (int i = 1 ; i<rows; i++){
            array[i][col] = "xx";
        }
        if (row>=col){

        }

    }
}
