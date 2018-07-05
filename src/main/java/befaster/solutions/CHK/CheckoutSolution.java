package befaster.solutions.CHK;


import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        
        String [] items = new String[1000];
        items = skus.split(" ");
        Set<Integer> prices = new TreeSet<>();
        
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("A")) {
                prices.add(50);
            } else if (items[i].equals("B")) {
                prices.add(30);
            } else if (items[i].equals("C")) {
                prices.add(20);
            } else if (items[i].equals("D")) {
                prices.add(15);
            }
        }

        Iterator<Integer> itr = prices.iterator();
        int countA = 0;
        int countB = 0;
        while (itr.hasNext()) {
            if (itr.next() == 50) {
                countA++;
            } else if (itr.next() == 30) {
                countB++;
            }
        }

        while (countA >= 3) {
            prices.remove(50);
            prices.remove(50);
            prices.remove(50);
            prices.add(130);
        }
        while (countB >= 2) {
            prices.remove(30);
            prices.remove(30);
            prices.add(45);
        }

        int sum = 0;
        itr = prices.iterator();
        while (itr.hasNext()) {
            sum += itr.next();
        }

        return sum;
    }
}
