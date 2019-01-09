package com.company;

public class CountBlocks {

  public static void main(String[] args) {
    int levels = 5;
    int totalBlocks = 0;

    for (int i = 1; i <= levels; ++i) {
      int numBlocks = i * i;
      totalBlocks += numBlocks;
    }

    System.out.println(totalBlocks);
  }
}
