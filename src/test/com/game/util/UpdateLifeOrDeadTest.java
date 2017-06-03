package test.com.game.util;

import com.game.util.UpdateLifeOrDead;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Think on 2017/6/3.
 */
public class UpdateLifeOrDeadTest {
    //初始值
    char[][] testGame01 = {{'-','-','-','-','-'},{'-','-','-','-','-'},{'-','*','*','*','-'},
            {'-','-','-','-','-'},{'-','-','-','-','-'}};
    @Test
    public void updateTest(){
        assertEquals('*',new UpdateLifeOrDead().update(1,2,testGame01));
    }
}
