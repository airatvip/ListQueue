package other;

import transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport> {

    private String nameService;

    public ServiceStation(String nameService) {
        this.nameService = nameService;
    }

    private Queue<T> queue = new LinkedList<>();

    public void addQueue (T transport) {
        queue.offer(transport);

    }

    public Queue<T> getQueue() {
        return queue;
    }

    public void goToService ()  {

        if (queue != null) {
            T transport = queue.poll();
        } else System.out.println("Очередь пустая");
    }

    @Override
    public String toString() {
        return "Станция техобслуживания: " + "\n" +
                "в очереди - " + getQueue() + "\n";

    }
}
