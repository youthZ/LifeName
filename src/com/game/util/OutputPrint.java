package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
public class OutputPrint {
    public static void main(String args[]) {
        char[][] graph = new InitGame().expendInit();
        graph = new LifeGame().gameContinue(graph);
        for (int row = 1; row < graph.length - 1; row++) {
            for (int col = 1; col < graph[row].length - 1; col++) {
                System.out.print(graph[row][col]);
            }
            System.out.println("");
        }
    }
}
