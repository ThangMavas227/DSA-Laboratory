package Problem08_PriorityJobs;

public class Job {
    private String ID;
    private int priority;
    private long arrivalNum;
   
    public Job(String ID, int priority, long arrivalNum){
        this.priority = priority;
        this.arrivalNum = arrivalNum;
        this.ID = ID;
    }

    public void increaseArrival () {
        ++arrivalNum;
    }

    public int getPriority(){
        return priority;
    }

    public long getArrivalNum(){
        return arrivalNum;
    }

    public String getID(){
        return ID;
    }


}
