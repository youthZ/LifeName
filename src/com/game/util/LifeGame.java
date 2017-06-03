package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
//定义：*代表alive  space代表dead
public class LifeGame {
    //自己给好的一个初始化状态
    public char[][] init(){
            char[][] graph = new char[3][3];
            for(int i = 0; i<graph.length; i++){
                for (int j = 0; j< graph[i].length;j++){
                    if((i == 0) ||(i == 2)){
                        graph [i][j]= ' ';
                    }else {
                        graph [i][j]= '*';
                    }
                }
            }

            return graph;
    }
    public char[][] expendInit(char[][] graph){
        char[][] graphIncrease = new char[graph.length+1][graph.length+1];
        for (int row= 0; i < graphIncrease.length; i++){
            for (int col = 0; col < graphIncrease[row].length; col++){
                if((row == 0) || (col == 0 ) || (row == graphIncrease.length-1) || (col == graphIncrease[row].length-1){
                    graphIncrease[row][col]=' ';
                }
            }
        }
        return graph;
    }

    public char[][] gameContinue(char[][] graph){
        //记录活着的细胞数count
        int count = 0;
        for(int index = 0; index<graph.length; index++){
            for (int tab = 0; tab< graph[index].length; tab++){
                //左上角
                if((index == 0) &&(tab == 0)){
                    if(graph[index][tab] == '*'){
                        if(graph[index][tab+1] == '*'){
                            count++;
                        }
                        if(graph[index+1][tab+1]=='*'){
                            count++;
                        }
                        if(graph[index+1][tab] =='*'){
                            count++;
                        }
                        if(count > )
                    }else{

                    }
                }
            }
        }
        return graph;
    }
}
