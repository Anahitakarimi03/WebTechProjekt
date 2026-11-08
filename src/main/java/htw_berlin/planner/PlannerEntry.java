package htw_berlin.planner;


import java.time.LocalDate;

public class PlannerEntry {
    private int id;
    private String name;
    private boolean done;
    private LocalDate dueDate;
    private Priority priority;

    public PlannerEntry(int id, String name, boolean done, LocalDate dueDate, Priority priority) {

        this.id = id;
        this.name = name;
        this.done = done ;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id;}

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


    public LocalDate getDueDate() { return dueDate; }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() { return priority; }

    public void setPriority(Priority priority) { this.priority = priority; }
}