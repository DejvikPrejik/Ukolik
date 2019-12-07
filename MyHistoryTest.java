/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavni;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class MyHistoryTest {
    
    public MyHistoryTest() {
    }

    /**
     * Test of read method, of class MyHistory.
     */
    @Test
    public void test1() throws Exception {
        MyHistory h = new MyHistory("D:\\Test\\xx.txt");
        h.addLine("ahoj");
        h.addLine("ahoj");
        h.save();
      h.read();
              h.toString();
    }
    
    
 @Test
    public void test2() throws Exception {
        MyHistory h = new MyHistory("D:\\Test");
        h.addLine("ahoj");
        h.addLine("ahoj");
        h.save();
      h.read();
              h.toString();
    }
    
    
}
