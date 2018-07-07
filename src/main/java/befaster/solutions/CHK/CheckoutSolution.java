package befaster.solutions.CHK;

import java.util.*;
//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public boolean correctInput(String c) {

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i).isLowerCase() == true)
                return false;
            }
        }
        return true;
    }

    public Integer checkout(String skus) {
        
        int size = skus.length();
        Integer [] prices = new Integer[size];
        Integer [] items = new Integer[26];

        for (int i = 0; i < 26; i++) {
            items[i] = 0;
        }
        
        if (skus.length() == 0) {
            return 0;
        }

        if (correctInput(skus) == false) {
            return -1;
        }
        
        // int countA = 0;
        // int countB = 0;
        // int countE = 0;
        // int countF = 0;

        for (int i = 0; i < skus.length(); i++) {
            if (skus.charAt(i) == 'A') {
                prices[i] = 50;
                items[0]++;
            } else if (skus.charAt(i) == 'B') {
                prices[i] = 30;
                items[1]++;
            } else if (skus.charAt(i) == 'C') {
                prices[i] = 20;
            } else if (skus.charAt(i) == 'D') {
                prices[i] = 15;
            } else if (skus.charAt(i) == 'E') {
                prices[i] = 40;
                items[4]++;
            } else if (skus.charAt(i) == 'F') {
                prices[i] = 10;
                items[5]++;
            } else if (skus.charAt(i) == 'G') {
                prices[i] = 20;
            } else if (skus.charAt(i) == 'H') {
                prices[i] = 10;
                items[7]++;
            } else if (skus.charAt(i) == 'I') {
                prices[i] = 35;
            } else if (skus.charAt(i) == 'J') {
                prices[i] = 60;
            } else if (skus.charAt(i) == 'K') {
                prices[i] = 80;
                items[10]++;
            } else if (skus.charAt(i) == 'L') {
                prices[i] = 90;
            } else if (skus.charAt(i) == 'M') {
                prices[i] = 15;
            } else if (skus.charAt(i) == 'N') {
                prices[i] = 40;
                items[13]++;
            } else if (skus.charAt(i) == 'O') {
                prices[i] = 10;
            } else if (skus.charAt(i) == 'P') {
                prices[i] = 50;
            }
        }

        while (countE >= 2 && countB != 0) {
            for (int i = 0; i < size; i++) {
                if (prices[i] == 30) {
                    prices[i] = 0;
                    countE -= 2;
                    countB--;
                    break;
                }
            }
           // System.out.print("E");
        }

 //       if (countA >= 5) {
            while (countA >= 5) {
                int removed = 0;
                for (int i = 0; i < size; i++) {
                    if (prices[i] == 50) {
                        prices[i] = 0;
                        countA--;
                        removed++;
                    }
                    if (removed == 5) {
                        prices[i] = 200;
                        break;
                    }
                }
              //  System.out.print("A");
            }
 //       }

  //      if (countA >= 3) {
            while (countA >= 3) {
                int removed = 0;
                for (int i = 0; i < size; i++) {
                    if (prices[i] == 50) {
                        prices[i] = 0;
                        countA--;
                        removed++;
                    }
                    if (removed == 3) {
                        prices[i] = 130;
                        break;
                    }
                }
                // System.out.print("A2");
            }
  //      }

 //       if (countB >= 2) {
            while (countB >= 2) {
                int removed = 0;
                for (int i = 0; i < size; i++) {
                    if (prices[i] == 30) {
                        prices[i] = 0;
                        countB--;
                        removed++;
                    }
                    if (removed == 2) {
                        prices[i] = 45;
                        break;
                    }
                }
                // System.out.print("B");
            }
//        }

        while (countF >= 3) {
            for (int i = 0; i < size; i++) {
                if (prices[i] == 10 && countF >= 3) {
                    prices[i] = 0;
                    countF -= 3;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
           // System.out.print(prices[i] + " ");
            sum += prices[i];
        }
       // System.out.println();

        return sum;
    }

    //     public static void main(String [] args) {
    	
    // 	CheckoutSolution s = new CheckoutSolution();
    //     int a = s.checkout("ABCDEFFF");
    //     System.out.println(a);
    // }

}
