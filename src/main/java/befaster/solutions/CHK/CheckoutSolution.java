package befaster.solutions.CHK;

import java.util.*;
//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public boolean correct(String c) {

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != 'A' && c.charAt(i) != 'B' && 
                c.charAt(i) != 'C' && c.charAt(i) != 'D' && 
                c.charAt(i) != 'E' && c.charAt(i) != 'F') {
                return false;
            }
        }
        return true;
    }

    public Integer checkout(String skus) {
        
        int size = skus.length();
        Integer [] prices = new Integer[size];
        
        if (skus.length() == 0) {
            return 0;
        }

        if (!correct(skus)) {
            return -1;
        }
        
        int countA = 0;
        int countB = 0;
        int countE = 0;
        int countF = 0;

        for (int i = 0; i < skus.length(); i++) {
            if (skus.charAt(i) == 'A') {
                prices[i] = 50;
                countA++;
            } else if (skus.charAt(i) == 'B') {
                prices[i] = 30;
                countB++;
            } else if (skus.charAt(i) == 'C') {
                prices[i] = 20;
            } else if (skus.charAt(i) == 'D') {
                prices[i] = 15;
            } else if (skus.charAt(i) == 'E') {
                prices[i] = 40;
                countE++;
            } else if (skus.charAt(i) == 'F') {
                prices[i] = 10;
                countF++;
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

        if (countA >= 5) {
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
        }

        if (countA >= 3) {
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

        }

        if (countB >= 2) {
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
        }

        if ()
        while (countF >= 3) {
            for (int i = 0; i < size; i++) {
                if (prices[i] == 10) {

                }
            }
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += prices[i];
        }

        return sum;
    }

    //     public static void main(String [] args) {
    	
    // 	CheckoutSolution s = new CheckoutSolution();
    //     int a = s.checkout("ABCDABCDABCDABCDEABCDEABCDE");
    //     System.out.println(a);
    // }

}
