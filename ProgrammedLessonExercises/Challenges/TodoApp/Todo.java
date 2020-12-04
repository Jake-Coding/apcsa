import java.io.*;
public class Todo {
    private String description;
    private String name;
    private String dueDate;
    private boolean done;
    private int priority;

    public Todo(String name, String desc, String due, int priority, boolean done) {
        this.name = name;
        this.description = desc;
        this.dueDate = due;
        this.priority = priority < 1 ? 1 : priority > 5 ? 5 : priority;
        this.done = done;

    }
    public Todo(String name, String desc, String due, int priority) {
        this(name, desc, due, priority, false);
    }
    public Todo(String name, String desc, String due) {
        this(name, desc, due, 3, false);
    }


    public void toFile(String filename) throws IOError {
        try {
            PrintWriter output = new PrintWriter(filename);
            output.println(this.toString());
            output.close();
        } catch (Exception e) {

        }
    }

    public boolean isFinished() {
        return done;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }
    public void setDue(String due) {
        this.dueDate = due;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void finishTask() {
        done = true;
    }

    public String toString() {
        return    name + ","+ description + "," + dueDate + "," + priority + "," + done;
    }

    public static Todo parseString(String str) {
        str.replace("[", "");
        str.replace("]", "");
        String[] arr = str.split(",");
        return new Todo(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]), Boolean.parseBoolean(arr[4]));
    } 
}