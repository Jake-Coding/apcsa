import java.util.*;
import java.io.*;
public class TodoList {
    private ArrayList<Todo> list;

    public TodoList(ArrayList<Todo> list) {
        this.list = list;
    }

    public TodoList() {
        this(new ArrayList<Todo>());
    }
    public TodoList(String filename) {
        this.loadTasks(filename);
    }


    public void loadTasks(String filename) {
        Scanner fileScanner;
        File f;
        ArrayList<Todo> temp_tasks = new ArrayList<Todo>();
        try {
            f = new File(filename);
            fileScanner = new Scanner(f);
            temp_tasks.add(Todo.parseString(fileScanner.nextLine()));

            while (fileScanner.hasNextLine()) {
                temp_tasks.add(Todo.parseString(fileScanner.nextLine()));
            }
            fileScanner.close();

        } catch (Exception e) {e.printStackTrace();}
        this.list = temp_tasks;
    }


    public void addTodo(Todo t) {
        this.list.add(t);
    }

    public String unfinishedTasks() {
        String str = "";
        for (Todo item : list) {
            if (item.isFinished()) {str += item.toString() + "\n";}
        }
        return str;
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            Todo item = list.get(i);
            str += i + ": ";
            str += item.toString();
            str += "\n\n";

        }
        return str;
    }

    public int size() {
        return this.list.size();
    }
    public void clear() {
        this.list = new ArrayList<Todo>();
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }
    public void modifyTaskDesc(int index, String desc) {
        if (index < list.size()) {
            list.get(index).setDesc(desc);
        }
    }
    public void modifyTaskDue(int index, String due) {
        if (index < list.size()) {
            list.get(index).setDue(due);
        }
    }
    public void modifyTaskPriority(int index, int priority) {
        if (index < list.size()) {
            list.get(index).setPriority(priority);
        }
    }
    public void finishTask(int index) {
        if (index < list.size()) {
            list.get(index).finishTask();
        }
    }

    public void removeTask(int index) {
        list.remove(index);
    }

    public void saveTasks(String filename) throws IOError {
        try {
            PrintWriter output = new PrintWriter(filename);
            for (Todo item : list) {
                output.println(item);
            }
            output.close();
        } catch (Exception e) {

        }
    }
}