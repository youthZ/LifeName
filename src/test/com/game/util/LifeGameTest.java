package test.com.game.util;

import com.game.util.LifeGame;
import com.game.util.UpdateLifeOrDead;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Think on 2017/6/3.
 */
public class LifeGameTest {
    //初始值
    char[][] testGame01 = {{'-','-','-','-','-'},{'-','-','-','-','-'},{'-','*','*','*','-'},
            {'-','-','-','-','-'},{'-','-','-','-','-'}};
    //期望值
    char[][] testGame02 = {{' ',' ',' ',' ',' '},{' ','-','*','-',' '},{' ','-','*','-',' '},
            {' ','-','*','-',' '},{' ',' ',' ',' ',' '}};
    @Test
    public void shouldReturnNewGraph(){
        assertArrayEquals(testGame02,new LifeGame().gameContinue(testGame01));
    }
}
