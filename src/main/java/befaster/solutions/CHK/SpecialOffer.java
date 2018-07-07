public class SpecialOffer {

    char itemType;

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

    

}