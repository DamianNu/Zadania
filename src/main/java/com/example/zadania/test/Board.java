package com.example.zadania.test;

public class Board {
    private int size;
    private char[][] board;
    private BoardDisplay display;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void move(char symbol, int x, int y) {
        //logic
        board[x][y] = symbol;
        display.display(board);
    }
}
