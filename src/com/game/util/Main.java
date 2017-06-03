package com.game.util;

import java.util.Scanner;

/**
 * Created by Think on 2017/6/3.
 */
public class Main {
    public static void main(String args[]) {
        char[][] graph = null;
        OutPutPrint outPutPrint = new OutPutPrint();
        TemplateGame templateGame = new TemplateGame();
        System.out.println("please make your choice by message and input your times:");
        System.out.println("1.templateGame01:");
        outPutPrint.outPutPrintTemplate(templateGame.getTemplateGame01());
        System.out.println("2.templateGame02:");
        outPutPrint.outPutPrintTemplate(templateGame.getTemplateGame02());
        System.out.println("3.templateGame03:");
        outPutPrint.outPutPrintTemplate(templateGame.getTemplateGame03());
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int times = scanner.nextInt();
        switch (choice){
            case 1:
                graph = templateGame.getTemplateGame01();
                break;
            case 2:
                graph = templateGame.getTemplateGame02();
                break;
            case 3:
                graph = templateGame.getTemplateGame03();
                break;
            default:
                System.out.println("your choice is wrong! ");
                System.out.println("the game is end!");
                break;
        }
        if(graph != null) {
            graph = new InitGame().expendInit(graph);
            for (int i = 0; i < times; i++) {
                graph = new LifeGame().gameContinue(graph);
                new OutPutPrint().outPutPrintResult(graph);
            }
        }
    }
}
