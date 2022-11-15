package other;

import java.util.ArrayDeque;
import java.util.Queue;

public class Shop {
    public String name;
    public static Queue<String> queue1 = new ArrayDeque<>(5);
    public static Queue<String> queue2 = new ArrayDeque<>(5);

    public Shop(String name) {
        this.name = name;
    }


    public static void addPersonAtQueue(String name) {

        if (queue1.size() <= 4 && queue1.size() <= queue2.size()) {
            queue1.offer(name);
        } else if (queue2.offer(name)) ;
        if (queue2.size() == 4) {

            System.out.println("Гааааляяя!!!");}






    }


}



