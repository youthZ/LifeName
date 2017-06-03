package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
//定义：*代表alive  space代表dead
public class LifeGame {
    //自己给好的一个初始化状态


    public char[][] gameContinue(char[][] graph) {
        char[][] newGraph = new char[graph.length][graph.length];
        for (int index = 1; index < graph.length - 1; index++) {
            for (int tab = 1; tab < graph[index].length - 1; tab++) {
                newGraph[index][tab] = new UpdateLifeOrDead().update(index, tab, graph);
            }
        }
        return newGraph;
    }

}
