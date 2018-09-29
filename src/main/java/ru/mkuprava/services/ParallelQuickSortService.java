package ru.mkuprava.services;

import javax.validation.constraints.NotNull;

public class ParallelQuickSortService implements ISortService{

//    private int[] a;
//    private int left;
//    private int right;
//    private CountDownLatch latch;
//    private AtomicInteger counter;
//
//    public ParallelQuickSort(int[] a, int left, int right, CountDownLatch latch, AtomicInteger counter) {
//        this.a = a;
//        this.left = left;
//        this.right = right;
//        this.latch = latch;
//        this.counter = counter;
//    }
//
//    @Override
//    protected void compute() {
//        int i = left, j = right, middle = a[(i + j) / 2];
//        while (i <= j) {
//            while (a[i] < middle) i++;
//            while (a[j] > middle) j--;
//            if (i <= j) {
//                int t = a[i];
//                a[i] = a[j];
//                a[j] = t;
//                i++;
//                j--;
//            }
//        }
//        if (i < right) {
//            counter.incrementAndGet();
//            ForkJoinPool.commonPool().execute(new ParallelQuickSort(a, i, right, latch, counter));
//        }
//        if (j > left) {
//            counter.incrementAndGet();
//            ForkJoinPool.commonPool().execute(new ParallelQuickSort(a, left, j, latch, counter));
//        }
//        int count = counter.decrementAndGet();
////        System.out.println(ForkJoinPool.commonPool().getQueuedSubmissionCount());
//        if (count == 0) {
//            latch.countDown();
//        }
//    }


    @Override
    public void sort(@NotNull int[] a, int left, int right) {

    }
}
