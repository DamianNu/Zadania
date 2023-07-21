package com.example.zadania.test;

public class BoardDisplayConsole implements BoardDisplay{
    public void display(char[][] board) {
        int size = new Board().getSize();
        char[][] board1 = board;
        System.out.print("  ");
        for (int i = 0;i<size;i++) {
            System.out.print(" "+i);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < size; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println();
    }
}