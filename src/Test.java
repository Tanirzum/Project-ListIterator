import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tanirbergen");
        list.add("Sayan");
        list.add("Ayan");
        list.add("Aimaral");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(list);
    }
}
