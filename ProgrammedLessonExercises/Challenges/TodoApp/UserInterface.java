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
            todos = handleInput(input, todos, userScanner);
        }
    }

    public static void displayMenu(TodoList todos) {
        if (!todos.isEmpty()) {
            System.out.println(todos);
            System.out.println("u: update a task");
            System.out.println("c: clear all tasks");
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

    public static TodoList updateList(TodoList list, Scanner s) {
        if (list.isEmpty()) {return list;}
        System.out.print("Which item would you like to change?\n> ");
        int index = s.nextInt();
        while (index >= list.size()) {
            System.out.print("Invalid. Please try again.\n");
            System.out.print("Which item would you like to change?\n> ");
            index = s.nextInt();
        }
        System.out.println("Change:\n0: Description\n1: Due date\n2: Priority\n3: Mark as finished.");
        System.out.print("> ");
        int selection = s.nextInt();
        while (selection > 3 || selection < 0) {
            System.out.println("Invalid. Please try again.");
            System.out.print("> ");
            selection = s.nextInt();
        }
        switch (selection) {
            case 0:
                System.out.print("Enter new description\n> ");
                list.modifyTaskDesc(index, s.nextLine());
                break;
             case 1:
                System.out.print("Enter new due date\n> ");
                list.modifyTaskDue(index, s.nextLine());
                break;
            case 2:
                System.out.print("Enter new priority\n> ");
                list.modifyTaskPriority(index, s.nextInt());
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
        priority = s.nextInt();
        Todo t = new Todo(name, description, dueDate, priority);
        list.addTodo(t);
        return list;
    }

    public static void writeToFile(TodoList list) {
        list.saveTasks("todo_list.txt");
    }
}