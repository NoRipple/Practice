package com.example.practiceforsomething.Sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/**
 * Classname: demo
 * Package: com.example.practiceforsomething.Sync
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 13:31
 * @Version: v1.0
 */
public class demo {
    public static void main(String[] args) throws InterruptedException {
        MyMutex mutex = new MyMutex();
        Condition condition = mutex.newCondition();

        // 测试lock()和unlock()
        mutex.lock();
        System.out.println("Locked.");
        mutex.unlock();
        System.out.println("Unlocked.");

        // 测试tryLock()
        if (mutex.tryLock()) {
            System.out.println("Try locked successfully.");
            mutex.unlock();
        } else {
            System.out.println("Try lock failed.");
        }

        // 测试tryLock(long time, TimeUnit unit)
        if (mutex.tryLock(1, TimeUnit.SECONDS)) {
            System.out.println("Timed lock successful.");
            mutex.unlock();
        } else {
            System.out.println("Timed lock failed.");
        }

        // 测试lockInterruptibly()
        Thread thread = new Thread(() -> {
            try {
                mutex.lockInterruptibly();
                System.out.println("Interruptible lock successful.");
                mutex.unlock();
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting for lock.");
            }
        });
        thread.start();
        Thread.sleep(500); // 给线程一点时间去获取锁
        thread.interrupt(); // 中断线程

    }
}
