package befaster.solutions.CHK;

import java.util.*;
//import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public ArrayList<Item> items = new ArrayList<Item>();

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
            for (Item item : items) {
                if (item.type == skus.charAt(i)) {
                    item.appearances++;
                    break;
                }
            }
        }
    }

    public Integer checkout(String skus) {

        int size = skus.length();
        Integer [] prices = new Integer[size];
        SpecialOffer specialOffer = new SpecialOffer();

        for (int i = 0; i < size; i++) {
            prices[i] = 0;
        }
        
        initialize(skus);

        if (skus.length() == 0) {
            return 0;
        }

        if (correctInput(skus) == false) {
            return -1;
        }

        int i = 0;
        int itemBApp = 0;
        int itemMApp = 0;
        int itemQApp = 0;

        for (Item item : items) {
            if (item.type == 'B') {
                itemBApp = item.appearances;
            } 
            if (item.type == 'M') {
                itemMApp = item.appearances;
            }
            if (item.type == 'Q') {
                itemQApp = item.appearances;
            }
        }

        for (Item item : items) {
            if (i >= size) {
                break;
            }
            if (item.appearances != 0) {
                int initialPrice = item.value*item.appearances;
                int finalPrice;
                if (item.type == 'E') {
                    finalPrice = specialOffer.getSpecialOffer(item.type, initialPrice, 
                                                                item.appearances, itemBApp);
                } else if (item.type == 'N') {
                    finalPrice = specialOffer.getSpecialOffer(item.type, initialPrice, 
                                                                    item.appearances, itemMApp);
                } else if (item.type == 'R') {
                    finalPrice = specialOffer.getSpecialOffer(item.type, initialPrice,
                                                                    item.appearances, itemQApp);
                } else {
                finalPrice = specialOffer.getSpecialOffer(item.type, initialPrice,
                                                                item.appearances, 0);
                }
                prices[i] = finalPrice;
                i++;
            }
        }

        int totalCheckout = 0;

        for (i = 0; i < size; i++) {
            totalCheckout += prices[i];
        }

        return totalCheckout;
    }
    
    public class Item {

        char type;
        int value;
        int appearances;

        public Item(char type, int value) {
            this.type = type;
            this.value = value;
            this.appearances = 0;
        }

    }

    public class SpecialOffer {

    public int itemAOffer(int price, int itemsNumber) {

        while (itemsNumber >= 5) {
            price -= 50;
            itemsNumber -= 5;
        }

        while (itemsNumber >= 3) {
            price -= 20;
            itemsNumber -= 3;
        }
        return price;
    }

    public int itemBOffer(int price, int itemsNumber) {

        while (itemsNumber >= 2) {
            price -= 15;
            itemsNumber -= 2;
        }
        return price;
    }

    public int itemEOffer(int price, int itemsNumber, int appearancesB) {

        while (itemsNumber >= 2 && appearancesB > 0) {
            price -= 30;
            itemsNumber -= 2;
            appearancesB--;
        }
        return price;
    }

    public int itemFOffer(int price, int itemsNumber) {

        while (itemsNumber >= 3) {
            price -= 10;
            itemsNumber -= 3;
        }
        return price;
    }

    public int itemKOffer(int price, int itemsNumber) {

        while (itemsNumber >= 2) {
            price -= 10;
            itemsNumber -= 2;
        }
        return price;
    }

    public int itemNOffer(int price, int itemsNumber, int appearancesM) {

        while (itemsNumber >= 3 && appearancesM > 0) {
            price -= 15;
            itemsNumber -= 3;
            appearancesM--;
        }
        return price;
    }

    public int itemPOffer(int price, int itemsNumber) {

        while (itemsNumber >= 5) {
            price -= 50;
            itemsNumber -= 5;
        }
        return price;
    }

    public int itemQOffer(int price, int itemsNumber) {

        while (itemsNumber >= 3) {
            price -= 10;
            itemsNumber -= 3;
        }
        return price;
    }

    public int itemROffer(int price, int itemsNumber, int appearancesQ) {

        while (itemsNumber >= 3 && appearancesQ > 0) {
            price -= 30;
            itemsNumber -= 3;
            appearancesQ--;
        }
        return price;
    }

    public int itemUOffer(int price, int itemsNumber) {

        while (itemsNumber >= 4) {
            price -= 40;
            itemsNumber -= 4;
        }
        return price;
    }

    public int itemVOffer(int price, int itemsNumber) {

        while (itemsNumber >= 3) {
            price -= 20;
            itemsNumber -= 3;
        }

        while (itemsNumber >= 2) {
            price -= 10;
            itemsNumber -=2;
        }
        return price;
    }


    public int getSpecialOffer(char itemType, int price, int itemsNumber, int appearances){
        if (itemType == 'A') {
            return itemAOffer(price,itemsNumber);
        } else if (itemType == 'B') {
            return itemBOffer(price, itemsNumber);
        } else if (itemType == 'E') {
            return itemEOffer(price,itemsNumber, appearances);
        } else if (itemType == 'F') {
            return itemFOffer(price, itemsNumber);
        } else if (itemType == 'K') {
            return itemKOffer(price, itemsNumber);
        } else if (itemType == 'N') {
            return itemNOffer(price,itemsNumber, appearances);
        } else if (itemType == 'P') {
            return itemPOffer(price, itemsNumber);
        } else if (itemType == 'Q') {
            return itemQOffer(price, itemsNumber);
        } else if (itemType == 'R') {
            return itemROffer(price, itemsNumber, appearances);
        } else if (itemType == 'U') {
            return itemUOffer(price, itemsNumber);
        } else if (itemType == 'V') {
            return itemVOffer(price, itemsNumber);
        }
        return price;
    }

}

}

