package befaster.solutions.CHK;

import java.util.*;
import befaster.runner.SolutionNotImplementedException;

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
        
        ArrayList<Integer> prices = new ArrayList<Integer>();
        
        if (skus.length() == 0) {
            return 0;
        }

        if (!correct(skus)) {
            return -1;
        }

        if (skus.length() == 1) {
            if (skus.equals("A")) {
                return 50;
            } else if (skus.equals("B")) {
                return 30;
            } else if (skus.equals("C")) {
                return 20;
            } else if (skus.equals("D")) {
                return 15;
            }
        }
        
        for (int i = 0; i < skus.length(); i++) {
            if (skus.charAt(i) == 'A') {
                prices.add(50);
            } else if (skus.charAt(i) == 'B') {
                prices.add(30);
            } else if (skus.charAt(i) == 'C') {
                prices.add(20);
            } else if (skus.charAt(i) == 'D') {
                prices.add(15);
            }
        }

        Iterator<Integer> itr = prices.iterator();
        int countA = 0;
        int countB = 0;
        while (itr.hasNext()) {
            int a = itr.next();
            if (a == 50) {
                countA++;
            } else if (a == 30) {
                countB++;
            }
        }

        if (countA > 2) {
            while (countA >= 3) {
                prices.remove(50);
                prices.remove(50);
                prices.remove(50);
                prices.add(130);
            }
        }

        if (countB > 1) {
            while (countB >= 2) {
                prices.remove(30);
                prices.remove(30);
                prices.add(45);
            }
        }

        int sum = 0;
        Iterator<Integer> itr1 = prices.iterator();
        while (itr1.hasNext()) {
            sum += itr1.next();
        }

        return sum;
    }
}
