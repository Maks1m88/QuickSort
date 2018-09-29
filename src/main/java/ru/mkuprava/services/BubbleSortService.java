package ru.mkuprava.services;

import javax.validation.constraints.NotNull;

public class BubbleSortService implements ISortService {
    @Override
    public void sort(@NotNull int[] a, int left, int right) {
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j < right; j++) {
                if (a[i] < a[j]) {
                    a[i] = a[i] - a[j];
                    a[j] = a[j] + a[i];
                    a[i] = a[j] + a[i];
                }
            }
        }
    }
}
