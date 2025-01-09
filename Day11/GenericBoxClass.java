package Day11;

public class GenericBoxClass<T> {
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item){
        this.item=item;
    }
    void Print(){
        System.out.println(item.toString());
    }
    public boolean Type(Class<?> name){
        return name.isInstance(item);
    }

    public static void main(String[] args) {
        GenericBoxClass<String>str=new GenericBoxClass<>();
        str.setItem("Gnanaprakash");
        str.Print();
        System.out.println(str.Type(String.class));
        GenericBoxClass<Integer>val=new GenericBoxClass<>();
        val.setItem(12345);
        val.Print();
        System.out.println(val.Type(Integer.class));
        GenericBoxClass<Double>dob=new GenericBoxClass<>();
        dob.setItem(123.455);
        dob.Print();
        System.out.println(dob.Type(Double.class));
    }
}
