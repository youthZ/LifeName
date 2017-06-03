package com.game.util;

import java.util.Scanner;

/**
 * Created by Think on 2017/6/3.
 */
public class Main {
    public static void main(String args[]) {
        char[][] graph = null;
        System.out.println("please make your choice by message:");
        System.out.println("1.templateGame01:");
        new OutPutPrint().outPutPrint(new TemplateGame().templateGame01);
        System.out.println("2.templateGame02:");
        new OutPutPrint().outPutPrint(new TemplateGame().templateGame02);
        System.out.println("3.templateGame03:");
        new OutPutPrint().outPutPrint(new TemplateGame().templateGame03);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                graph = new TemplateGame().templateGame01;
                break;
            case 2:
                graph = new TemplateGame().templateGame02;
                break;
            case 3:
                graph = new TemplateGame().templateGame03;
                break;
            default:
                System.out.println("your choice is wrong! ");
                System.out.println("the game is end!");
                break;
        }
        if(graph != null) {
            graph = new InitGame().expendInit(graph);
            for (int i = 0; i < 2; i++) {
                graph = new LifeGame().gameContinue(graph);
            }
        }
    }
}
