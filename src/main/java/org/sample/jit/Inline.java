package org.sample.jit;

import java.util.Random;

/** https://blog.lovezhy.cc/2019/11/28/HotSpot%E5%8E%9F%E7%90%86%E6%8C%87%E5%8D%97-%E5%86%85%E8%81%94/
 *
 * http://normanmaurer.me/blog/2014/05/15/Inline-all-the-Things/
 *-XX:+UnlockDiagnosticVMOptions  -XX:+PrintInlining  -XX:+PrintCompilation
 */
public class Inline {

    static Random random = new Random();
    public static void main(String[] args) {
        for (int i = 0 ; i < 1000000; i++) {
            inline();
        }
    }
    public static int inline() {
        return add(random.nextInt(),
                random.nextInt());
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
