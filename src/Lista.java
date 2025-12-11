import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<String> li = new ArrayList<>();

    public List<String> getLi() {
        return li;
    }

    public void setLi(String value) {
        this.li.add(value);
    }

    @Override
    public String toString() {
        return "Lista{" + "li=" + li + '}';
    }
}
