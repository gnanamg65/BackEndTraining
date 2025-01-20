package Day15.TopScore;

import java.util.*;
import java.util.stream.Collectors;
class Students {
    private String name;
    private String department;
    private double gpa;
    public Students(String name, String department, double gpa) {
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getGpa() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', department='" + department + "', gpa=" + gpa + '}';
    }
}
public class TopScorerFinder {

    public static Map<String, Optional<Students>> findTopScorersByDepartment(List<Students> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Students::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Students::getGpa))
                ));
    }
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("jeeva", "CSE", 6.8));
        students.add(new Students("Santhosh", "CSE", 7.5));
        students.add(new Students("kesaven", "CSE", 8.7));
        students.add(new Students("gnana", "IT", 7.9));
        students.add(new Students("prakash", "IT", 6.6));
        students.add(new Students("ravi", "IT", 7.4));
        Map<String, Optional<Students>> topScorers = findTopScorersByDepartment(students);
        System.out.println("Top Scorers by Department:");
        for (Map.Entry<String, Optional<Students>> entry : topScorers.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Top Scorer: " + entry.getValue().orElse(null));
        }
    }
}

