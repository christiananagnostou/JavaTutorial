package com.codewithmosh.generics;

import java.util.Iterator;

public class GenericList<T> { // <T extends Comparable & Cloneable> <- Bounded (restricted) type parameter
  private T[] items = (T[]) new Object[10];
  private int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }

  public int length() {
    return count;
  }
}
