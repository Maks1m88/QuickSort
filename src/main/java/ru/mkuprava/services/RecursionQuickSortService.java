package ru.mkuprava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class RecursionQuickSortService implements ISortService {
    @Value("${threshold}")
    private int threshold;

    @Autowired
    private ISortService sortService;

    @Override
    public void sort(@NotNull int[] a, int left, int right) {
        int i = left, j = right, middle = a[(i + j) / 2];
        if (right - left <= threshold) {
            sortService.sort(a, left, right);
            return;
        }
        while (i <= j) {
            while (a[i] < middle) i++;
            while (a[j] > middle) j--;
            if (i <= j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
                j--;
            }
        }
        if (i < right) sort(a, i, right);
        if (j > left) sort(a, left, j);
    }
}