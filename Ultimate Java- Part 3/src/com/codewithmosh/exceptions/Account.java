package com.codewithmosh.exceptions;

import java.io.IOException;

public class Account {
  private float balance;

  public void deposit(float value) throws IOException {
    if (value <= 0)
      throw new IOException();
    // throw new IllegalArgumentException(); // Defensive Programming
  }

  public float withdraw(float value) throws AccountException {
    if (value > balance) {
      throw new AccountException(new InsufficientFundsException());
    }
    balance -= value;
    return balance;
  }
}
