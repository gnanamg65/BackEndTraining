package Day5.Generic;

public class Pair <K,V>{
    public <K,V> void display(K k,V v){
        System.out.println("Key:"+k+" Value:"+v);
    }
    public static void main(String[] args) {
        Pair<String,Integer>obj1=new Pair<>();
        Pair<Integer,String>obj2=new Pair<>();
        obj1.display("gnana",1);
        obj2.display(1,"prakash");
    }
}
