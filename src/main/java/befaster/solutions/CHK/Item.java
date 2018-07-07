public class Item implements Comparable<Item>{

    char type;
    int value;
    int appearances;

    public Item(char type, int value) {
        this.type = type;
        this.value = value;
        this.appearances = 0;
    }

    @Override
    public int compareTo(Item a) {
        if (this.type == a.type) {
            return 0;
        } else if (this.type < a.type){
            return -1;
        } else {
            return 1;
        }
    }

}