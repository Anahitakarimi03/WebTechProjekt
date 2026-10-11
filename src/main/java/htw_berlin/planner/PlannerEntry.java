package htw_berlin.planner;


public class PlannerEntry {
    private int id;
    private String name;
    private boolean done;
    private String dueDate;

    public PlannerEntry(int id, String name, boolean isDone, String dueDate) {

        this.id = id;
        this.name = name;
        this.done = done ;
        this.dueDate = dueDate;
    }

    public int getId() { return id; }

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    public String getDueDate() { return dueDate; }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}