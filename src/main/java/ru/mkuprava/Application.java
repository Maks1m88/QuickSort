package ru.mkuprava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Random;

@ComponentScan
@EnableAutoConfiguration
public class Application {
//    private static final ILogger logger=
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        int testSize = context.getEnvironment().getProperty("testSize", int.class);
        int[] foo = new int[testSize];
        Random rand = new Random();
        for (int a = 0; a < foo.length; a++) foo[a] = rand.nextInt();// >> 20;

    }
    //    static ExecutorService es;
//        public static void main(String[] args) {
//            int testSize = 100_00_0_000;
//        // 1st test => recursion call method by one thread
//        long current = System.currentTimeMillis();
//        RecursionQuickSort.quickSort(foo, 0, testSize - 1);
//        System.out.println("Time (ms): " + (System.currentTimeMillis() - current));
////        Arrays.stream(foo).forEach(System.out::println);
//
//        // 2nd test => execute parallel fork-join tasks by thread pool
//        for (int a = 0; a < foo.length; a++) foo[a] = rand.nextInt() >> 20;
//        CountDownLatch latch = new CountDownLatch(1);
//        AtomicInteger counter = new AtomicInteger(1);
//        current = System.currentTimeMillis();
//        try {
//            ForkJoinPool.commonPool().execute(new ParallelQuickSort(foo, 0, testSize - 1, latch, counter));
//            latch.await();
//            System.out.println("Time (ms): " + (System.currentTimeMillis() - current));
////            Arrays.stream(foo).forEach(System.out::println);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ;
////        TreeMap mmm = new TreeMap();
////        mmm.put(new Object(), new Object());
//        simple s = new simple();
}


