package seminar04.lesson.Ex001;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Gen<List<String>> gen = new Gen<List<String>>(Arrays.asList("ï", "ò"));

        System.out.println(gen.getObjectUnknownType());
        gen.showType(gen.objectUnknownType);
    }
}
