import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        Object obj = null;

        try {
            obj = Class.forName("Lista").newInstance();
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }

        Field field = null;

        List<String> lista = new ArrayList<>();
        lista.add("Samsung");
        lista.add("Apple");

        try {
            field = obj.getClass().getDeclaredField("li");
            field.setAccessible(true);
            field.set(obj, lista);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        Field[] fields = obj.getClass().getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}