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
