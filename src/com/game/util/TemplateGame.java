package com.game.util;

/**
 * Created by Think on 2017/6/3.
 */
public class TemplateGame {
    private char[][] templateGame01 = {{'-','-','-'},{'*','*','*'},{'-','-','-'}};
    private char[][] templateGame02 = {{'-','*','-'},{'*','-','*'},{'-','*','-'}};
    private char[][] templateGame03 = {{'-','*','-'},{'*','*','*'},{'-','*','-'}};

    public char[][] getTemplateGame01() {
        return templateGame01;
    }

    public void setTemplateGame01(char[][] templateGame01) {
        this.templateGame01 = templateGame01;
    }

    public char[][] getTemplateGame02() {
        return templateGame02;
    }

    public void setTemplateGame02(char[][] templateGame02) {
        this.templateGame02 = templateGame02;
    }

    public char[][] getTemplateGame03() {
        return templateGame03;
    }

    public void setTemplateGame03(char[][] templateGame03) {
        this.templateGame03 = templateGame03;
    }
}
