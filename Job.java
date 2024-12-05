public class Job implements Comparable<Job>{
    int ID;
    int time;
    int priority;
    public Job(int ID, int time){
        this.ID = ID;
        this.time = time;
        priority = 0;
    }
    public int getID() {
        return ID;
    }
    public int getTime() {
        return time;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int compareTo(Job comp){
         int thisPriority = (priority*1000)+time;
         int compPriority = (comp.priority*1000)+comp.time;

        if(thisPriority == compPriority)
            return 0;
        else if(thisPriority > compPriority)
            return 1;
        else
            return -1;


    }
}
