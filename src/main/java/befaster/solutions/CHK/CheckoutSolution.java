package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
        String [] items = new String[1000];
        items = skus.split(" ");
        Integer [] prices = new Integer[1000];
        
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("A")) {
                prices[i] = 50;
            } else if (items[i].equals("B")) {
                prices[i] = 30;
            } else if (items[i].equals("C")) {
                prices[i] = 20;
            } else if (items[i].equals("D")) {
                prices[i] = 15;
            }
        }

        


    }
}
