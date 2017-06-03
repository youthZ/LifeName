package com.game.util;

import java.util.Scanner;

/**
 * Created by Think on 2017/6/3.
 */
public class InitGame {
    private char[][] init() {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input row and col value(must be Integer):");
        int row = scan.nextInt();
        int col = scan.nextInt();
        char[][] graph = new char[row][col];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if((i == 0) && (j == 0) ){
                    graph[i][j] = '-';
                }
                if((i == 0) && (j == 1)){
                    graph[i][j] = '-';
                }
                if((i == 0) && (j == 2)){
                    graph[i][j] = '-';
                }
                if((i == 1) && (j == 0)){
                    graph[i][j] = '*';
                }
                if((i == 1) && (j == 1)){
                    graph[i][j] = '*';
                }
                if((i == 1) && (j == 2)){
                    graph[i][j] = '*';
                }
                if((i == 2) && (j == 0)){
                    graph[i][j] = '-';
                }
                if((i == 2) && (j == 1)){
                    graph[i][j] = '-';
                }
                if((i == 2) && (j == 2)){
                    graph[i][j] = '-';
                }
            }
        }

        return graph;
    }

    public char[][] expendInit() {
        char[][] graph = init();
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
