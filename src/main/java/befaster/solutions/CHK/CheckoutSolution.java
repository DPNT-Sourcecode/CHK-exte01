//package befaster.solutions.CHK;

import java.util.*;
//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public TreeSet<Item> items = new TreeSet<Item>();

    public boolean correctInput(String c) {

        for (int i = 0; i < c.length(); i++) {
            char chr = c.charAt(i);
            if (!Character.isUpperCase(chr)) {
                return false;
            }
        }
        return true;
    }
    
    public void initialize(String skus) {

        items.add(new Item('A',50));
        items.add(new Item('B',30));
        items.add(new Item('C',20));
        items.add(new Item('D',15));
        items.add(new Item('E',40));
        items.add(new Item('F',10));
        items.add(new Item('G',20));
        items.add(new Item('H',10));
        items.add(new Item('I',35));
        items.add(new Item('J',60));
        items.add(new Item('K',80));
        items.add(new Item('L',90));
        items.add(new Item('M',15));
        items.add(new Item('N',40));
        items.add(new Item('O',10));
        items.add(new Item('P',50));
        items.add(new Item('Q',30));
        items.add(new Item('R',50));
        items.add(new Item('S',30));
        items.add(new Item('T',20));
        items.add(new Item('U',40));
        items.add(new Item('V',50));
        items.add(new Item('W',20));
        items.add(new Item('X',90));
        items.add(new Item('Y',10));
        items.add(new Item('Z',50));


        for (int i = 0; i < skus.length(); i++) {
            Iterator<Item> itr = items.iterator();
            while (itr.hasNext()) {
                if (skus.charAt(i) == itr.next().type) {
                    itr.next().appearances++;
                    break;
                }
            }
        }
    }

    public Integer checkout(String skus) {

        int size = skus.length();
        Integer [] prices = new Integer[size];
        
        initialize(skus);

        Iterator<Item> itr = items.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().type + " " + itr.next().appearances);
        }
        
        if (skus.length() == 0) {
            return 0;
        }

        if (correctInput(skus) == false) {
            return -1;
        }

        // while (countE >= 2 && countB != 0) {
        //     for (int i = 0; i < size; i++) {
        //         if (prices[i] == 30) {
        //             prices[i] = 0;
        //             countE -= 2;
        //             countB--;
        //             break;
        //         }
        //     }
        // }

        //     while (countA >= 5) {
        //         int removed = 0;
        //         for (int i = 0; i < size; i++) {
        //             if (prices[i] == 50) {
        //                 prices[i] = 0;
        //                 countA--;
        //                 removed++;
        //             }
        //             if (removed == 5) {
        //                 prices[i] = 200;
        //                 break;
        //             }
        //         }
        //     }

        //     while (countA >= 3) {
        //         int removed = 0;
        //         for (int i = 0; i < size; i++) {
        //             if (prices[i] == 50) {
        //                 prices[i] = 0;
        //                 countA--;
        //                 removed++;
        //             }
        //             if (removed == 3) {
        //                 prices[i] = 130;
        //                 break;
        //             }
        //         }
        //     }

        //     while (countB >= 2) {
        //         int removed = 0;
        //         for (int i = 0; i < size; i++) {
        //             if (prices[i] == 30) {
        //                 prices[i] = 0;
        //                 countB--;
        //                 removed++;
        //             }
        //             if (removed == 2) {
        //                 prices[i] = 45;
        //                 break;
        //             }
        //         }
        //     }

        // while (countF >= 3) {
        //     for (int i = 0; i < size; i++) {
        //         if (prices[i] == 10 && countF >= 3) {
        //             prices[i] = 0;
        //             countF -= 3;
        //         }
        //     }
        // }

        // int sum = 0;

        // for (int i = 0; i < size; i++) {
        //     sum += prices[i];
        // }

        // return sum;
        return 0;
    }

    public static void main(String [] args) {
    	
    	CheckoutSolution s = new CheckoutSolution();
        int a = s.checkout("ABCDEFFGHIJKDHASFAJFFJFWRWN");
        System.out.println(a);
    }

}