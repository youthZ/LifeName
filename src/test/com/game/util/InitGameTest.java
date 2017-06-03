package test.com.game.util;

import com.game.util.InitGame;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Think on 2017/6/3.
 */
public class InitGameTest {
    //初始值
    char[][] testGame01 ={{'-','-','-'},{'*','*','*'},{'-','-','-'}};
    //期望值
    char[][] testGame01Expend = {{'-','-','-','-','-'},{'-','-','-','-','-'},{'-','*','*','*','-'},
            {'-','-','-','-','-'},{'-','-','-','-','-'}};
    @Test
    public void shouleReturnExpendGameInitGame(){
        assertArrayEquals(testGame01Expend,new InitGame().expendInit(testGame01));
    }
}
