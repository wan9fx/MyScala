package org.wangfx;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangfx on 2017/3/6.
 */
public class DemoTest {

    @Test
    public void test1() {
        BigDecimal bigDecimal = new BigDecimal(2);
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        list.add(new BigDecimal(1));
        list.add(new BigDecimal(2));
        list.add(new BigDecimal(3));
        for (BigDecimal b : list) {
            bigDecimal = bigDecimal.add(b);
        }

        System.out.println(bigDecimal);
    }


    @Test
    public void test2() {
        boolean flag = true;
        List<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);
        list.add(true);

        for (Boolean b : list) {
            if (flag) {
                flag = flag && b;
                System.out.println("qqqq");
            }
        }

        System.out.println(flag);
    }
}
