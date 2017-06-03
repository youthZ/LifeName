package com.game.util;


/**
 * Created by Think on 2017/6/3.
 */
public class InitGame {
    /*public char[][] init() {
        System.out.println("please input row and col value(must be Integer):");
        int row = scan.nextInt();
        int col = scan.nextInt();
        char[][] graph = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

            }
        }

        return graph;
    }*/

    public char[][] expendInit(char [][] graph) {
        char[][] graphIncrease = new char[graph.length + 2][graph.length + 2];
        for (int row = 0; row < graphIncrease.length; row++) {
            for (int col = 0; col < graphIncrease[row].length; col++) {
                if ((row == 0) || (col == 0) || (row == graphIncrease.length - 1) || (col == graphIncrease[row].length - 1)) {
                    graphIncrease[row][col] = '-';
                } else {
                    graphIncrease[row][col] = graph[row - 1][col - 1];
                }
            }
        }
        return graphIncrease;
    }
}
