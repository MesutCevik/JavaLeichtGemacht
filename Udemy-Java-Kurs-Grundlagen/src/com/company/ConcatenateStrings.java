package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenateStrings {
  public ConcatenateStrings() {
  }

  public static void main(String[] args) {
    ArrayList<String> calculateArrList = new ArrayList();
    String mySubStr1 = "";
    String mySubStr2 = "";
    String calculate = "4068+1";
    String[] calculateStrArr = calculate.split("");
    System.out.println(Arrays.toString(calculateStrArr));

    for (int i = 0; i < calculateStrArr.length; ++i) {
      if (calculateStrArr[i].equals("[0-9]")) {
        System.out.println(calculateStrArr[i]);
        mySubStr1 = mySubStr1.concat(calculateStrArr[i]);
      } else if (calculateStrArr[i].equals("+")) {
        mySubStr2 = mySubStr2.concat(calculateStrArr[i]);
        System.out.println(mySubStr2);
      }
    }

    mySubStr1 = calculateStrArr[0] + calculateStrArr[1] + calculateStrArr[2] + calculateStrArr[3];
    System.out.println(mySubStr1);
    mySubStr2 = mySubStr2.concat(mySubStr1);
    System.out.println(mySubStr2);
    calculateArrList.add(mySubStr1);
    System.out.println(calculateArrList);
  }
}