import java.util.*;
import java.io.*;
public class UserInterface {
    public static void main(String[] args) {
        TodoList todos = new TodoList("todo_list.txt");
        Scanner userScanner = new Scanner(System.in);

        while (true) {
            displayMenu(todos);
            System.out.print("> ");
            String input = userScanner.nextLine();
            todos = handleInput(input, todos, new Scanner(System.in));

        }
    }

    public static void displayMenu(TodoList todos) {
        if (!todos.isEmpty()) {
            System.out.println(todos);
            System.out.println("u: update a task");
            System.out.println("c: clear all tasks");
            System.out.println("f: filter tasks by priority");
        }
        System.out.println("a: add");
        System.out.println("q: quit");
    }


    public static TodoList handleInput(String input, TodoList todos, Scanner s) {
        TodoList tempList = todos;
        switch (input) {
            case "u":
                tempList = updateList(tempList, s);
                
                break;
            case "c":
                tempList.clear();
                break;
            
            case "f":
                filter_display(tempList, s);
                break;
            
            case "a":
                tempList = addTodo(tempList, s);
                break;
            
            case "q":
                writeToFile(tempList);
                System.exit(0);
                break;

            default:
                return tempList;
        }
        return tempList;
    }

    
    public static void filter_display(TodoList todos, Scanner s) {
        System.out.print("Display items more or equal importance to which priority?\n> ");
        int p = Integer.parseInt(s.nextLine());
        while (p > 5 || p < 0) {
            System.out.print("Invalid. Please try again.\n> ");
            p = Integer.parseInt(s.nextLine());
        }
        System.out.println("PRIORITY " + p + "OR MORE IMPORTANT\n-------");
        System.out.println(todos.filterByPriority(p));
        System.out.println("--------\n\n\n");
    }


    public static TodoList updateList(TodoList list, Scanner s) {
        if (list.isEmpty()) {return list;}
        System.out.print("Which item would you like to change?\n> ");
        int index = Integer.parseInt(s.nextLine());
        while (index >= list.size()) {
            System.out.print("Invalid. Please try again.\n");
            System.out.print("Which item would you like to change?\n> ");
            index = Integer.parseInt(s.nextLine());
        }
        System.out.println("Change:\n0: Description\n1: Due date\n2: Priority\n3: Mark as finished.");
        System.out.print("> ");
        int selection = Integer.parseInt(s.nextLine());
        while (selection > 3 || selection < 0) {
            System.out.println("Invalid. Please try again.");
            System.out.print("> ");
            selection = Integer.parseInt(s.nextLine());
        }
        switch (selection) {
            case 0:
                System.out.println("Enter new description\n> ");
                list.modifyTaskDesc(index, s.nextLine());
                break;
             case 1:
                System.out.println("Enter new due date\n>");
                list.modifyTaskDue(index, s.nextLine());
                break;
            case 2:
                System.out.println("Enter new priority\n>");
                list.modifyTaskPriority(index, Integer.parseInt(s.nextLine()));
                break;
            case 3:
                list.finishTask(index);
                break;

            default:
                break;
        }

        return list;
    }

    public static TodoList addTodo(TodoList list, Scanner s) {
        String name, description, dueDate;
        int priority;
        System.out.print("What is the name?\n> ");
        name = s.nextLine();
        System.out.print("What is the description?\n> ");
        description = s.nextLine();
        System.out.print("What is the due date?\n> ");
        dueDate = s.nextLine();
        System.out.print("What is the priority?\n> ");
        priority = Integer.parseInt(s.nextLine());
        Todo t = new Todo(name, description, dueDate, priority);
        list.addTodo(t);
        return list;
    }

    public static void writeToFile(TodoList list) {
        list.saveTasks("todo_list.txt");
    }
}