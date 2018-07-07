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
        SpecialOffer specialOffer = new SpecialOffer();
        
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

        Iterator<Item> itr1 = items.iterator();
        int i = 0;

        while (itr1.hasNext() && i < size) {
            Item item = itr1.next();
            if (item.appearances != 0) {
                System.out.println("final: " + item.type + " " + item.value + " " + item.appearances);
                int initialPrice = item.value*item.appearances;
                int finalPrice = specialOffer.getSpecialOffer(item.type,
                                                            initialPrice, item.appearances);
                prices[i] = finalPrice;
                i++;
            }
        }

        for (i = 0; i < size; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();

        return 0;
    }

    public static void main(String [] args) {
    	
    	CheckoutSolution s = new CheckoutSolution();
        int a = s.checkout("AAAAA");
        System.out.println(a);
    }

}
