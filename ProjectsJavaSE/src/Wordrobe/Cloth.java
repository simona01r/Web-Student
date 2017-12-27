package Wordrobe;

public class Cloth {

   
    
    private En_Color color;
    private En_Type type;
    private int size;
    private static int idGenerator = 101;
    private int idCloth;

    public Cloth(En_Type type, En_Color color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.idCloth = idGenerator;
        idGenerator++;
    }

    public En_Type getType() {
        return type;
    }

    public En_Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getIdCloth() {
        return idCloth;
    }

    @Override
    public String toString() {
        return "Cloth[" + type + ", " + color + ", size=" + size +", " +idCloth+']';
    }

}
