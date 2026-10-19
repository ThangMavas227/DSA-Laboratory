package Problem08_PriorityJobs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class VehicleDispatch {
    private final PriorityQueue<Job> waitingQueue;
    private long nextArrivalNum;

    public VehicleDispatch() {
        Comparator<Job> comparator = Comparator
                .comparingInt(Job::getPriority)
                .thenComparingLong(Job::getArrivalNum);

        waitingQueue = new PriorityQueue<>(comparator);
        nextArrivalNum = 0;
    }

    public void ADD(String ID, int priority) {
        Job newIncident = new Job (ID, priority, nextArrivalNum++);
        waitingQueue.offer(newIncident);
    }

    public void SERVE() {
        Job job = waitingQueue.poll();

        if (job == null) {
            System.out.println("EMPTY");
            return;
        }

        System.out.println(job.getID());
    }

}
