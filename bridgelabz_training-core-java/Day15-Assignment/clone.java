class PrototypeObject implements Cloneable {
    String name;
    int id;

    PrototypeObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class clone {
    public static void main(String[] args) {
        try {
            PrototypeObject original = new PrototypeObject("Template", 101);
            PrototypeObject clone = (PrototypeObject) original.clone();

            System.out.println("Original: " + original.name + ", " + original.id);
            System.out.println("Clone: " + clone.name + ", " + clone.id);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
