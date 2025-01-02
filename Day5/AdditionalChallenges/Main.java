package Day5.AdditionalChallenges;

import Day5.AdditionalChallenges.Utilities.Container;

public class Main {
    public static void main(String[] args) {
        Container<Integer> val1 = new Container<>();
        val1.setValue(10);
        System.out.println(val1.getValue());
        Container<String> val2 = new Container<>();
        val2.setValue("Hello");
        System.out.println(val2.getValue());
        Priority priority = Priority.HIGH;
        System.out.print(priority);
    }
}
    enum Priority {
        HIGH, MEDIUM, LOW

}
