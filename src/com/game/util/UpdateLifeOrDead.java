package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
public class UpdateLifeOrDead {

    public char update(int row, int col, char[][] graph) {
        //记录活着的细胞数count
        int count = 0;
        if (graph[row - 1][col - 1] == '*') {
            count++;
        }
        if (graph[row - 1][col] == '*') {
            count++;
        }
        if (graph[row - 1][col + 1] == '*') {
            count++;
        }
        if (graph[row][col - 1] == '*') {
            count++;
        }
        if (graph[row][col + 1] == '*') {
            count++;
        }
        if (graph[row + 1][col - 1] == '*') {
            count++;
        }
        if (graph[row + 1][col] == '*') {
            count++;
        }
        if (graph[row + 1][col + 1] == '*') {
            count++;
        }
        if (count == 3) {
            return '*';
        } else if (count == 2) {
            return graph[row][col];
        } else {
            return ' ';
        }
    }
}
