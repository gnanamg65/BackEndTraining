package Day7.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApi {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Day7.Reflection.Person");
            Constructor [] constructors = cls.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor: " + constructor);
            }
            Person person=(Person) constructors[1].newInstance("gnana",21);
            System.out.println("Created Person: " + person);

            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
            }

            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                if (method.getName().equals("personDetails")) {
                    method.invoke(person, "dharmapuri");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
