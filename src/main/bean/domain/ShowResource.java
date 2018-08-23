package domain;

import lombok.Synchronized;

public class ShowResource {
    private final Object readLock= new Object();

    @Synchronized
    public static void show() {
        System.out.println("哈哈哈");
    }

    @Synchronized("readLock")
    public void read() {
        System.out.println("呵呵呵呵");
    }
}
