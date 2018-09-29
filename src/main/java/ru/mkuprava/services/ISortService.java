package ru.mkuprava.services;

import javax.validation.constraints.NotNull;

public interface ISortService {
    void sort(@NotNull int[] a, int left, int right);
}
