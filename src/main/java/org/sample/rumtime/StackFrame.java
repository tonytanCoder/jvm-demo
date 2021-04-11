package org.sample.rumtime;

/**
 * 编译：javac com\jvm\StackFrame.java
 * 反编译：javap -p -v StackFrame.class
 */
public class StackFrame {
    public static void main(String[] args) {
        add(1, 2);
    }

    private static int add(int a, int b) {
        int c = 0;
        c = a + b;
        return c;
    }
}
