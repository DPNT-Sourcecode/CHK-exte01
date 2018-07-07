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

    public int itemEOffer(int price, int itemsNumber) {

        while (itemsNumber >= 3) {
            price -= 40;
            itemsNumber -= 3;
        }
    }


    public int getSpecialOffer(char itemType, int price, int itemsNumber){
        if (itemType == 'A') {
            return itemAOffer(price,itemsNumber);
        }
        return 0;
    }

}
