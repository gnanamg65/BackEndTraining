package Day11;

import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap {
    ConcurrentMap<String,Integer>Vote=new java.util.concurrent.ConcurrentHashMap<>();
    public void addVote(String Candidate){
         Vote.putIfAbsent(Candidate,0);
         Vote.put(Candidate,Vote.get(Candidate)+1);

    }
    public  void display(){
        System.out.println(Vote);
    }
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        Thread thread1=new Thread(()->concurrentHashMap.addVote("Alice"));
        Thread thread2=new Thread(()->concurrentHashMap.addVote("Bob"));
        Thread thread3=new Thread(()-> {
            concurrentHashMap.addVote("Alice");
            concurrentHashMap.addVote("Bob");
            concurrentHashMap.addVote("Charlis");
        });
        thread1.start();;
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        concurrentHashMap.display();

    }
}
