package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
public class OutPutPrint {

    public void outPutPrintResult(char[][] graph) {
        for (int row = 1; row < graph.length - 1; row++) {
            for (int col = 1; col < graph[row].length - 1; col++) {
                System.out.print(graph[row][col]+" ");
            }
            System.out.println("");
        }
    }
    public void outPutPrintTemplate(char[][] graph){
        for (int row = 0; row < graph.length ; row++) {
            for (int col = 0; col < graph[row].length ; col++) {
                System.out.print(graph[row][col]+" ");
            }
            System.out.println("");
        }
    }
}
