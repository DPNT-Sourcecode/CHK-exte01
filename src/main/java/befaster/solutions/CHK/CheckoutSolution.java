package befaster.solutions.CHK;

import java.util.*;
//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public boolean correct(String c) {

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != 'A' && c.charAt(i) != 'B' && c.charAt(i) != 'C' && c.charAt(i) != 'D') {
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
            }
        }

        if (countA > 2) {
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
            }
        }

        if (countB > 1) {
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
            }
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += prices[i];
        }

        return sum;
    }
}
