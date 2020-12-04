import java.util.*;
import java.io.*;
public class UserInterface {
    public static void main(String[] args) {
        TodoList todos = new TodoList("todo_list.txt");
        Scanner userScanner = new Scanner(System.in);
        displayMenu(todos);
    }

    public static void displayMenu(TodoList todos) {
        if (!todos.isEmpty()) {
            System.out.println(todos);
            System.out.println("u: update");
            System.out.println("c: clear all tasks");
        }
        System.out.println("a: add");
        System.out.println("q: quit");
    }


    public static TodoList handleInput(String input, TodoList todos) {
        TodoList tempList = todos;
        switch (input) {
            case "u":
                tempList = updateList(tempList);
                
                break;
            case "c":
                tempList.clear();
                break;
            
            case "a":
                tempList = addTodo(tempList);
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

    public static TodoList updateList(TodoList list) {
        return list;
    }

    public static TodoList addTodo(TodoList list) {
        return list;
    }

    public static void writeToFile(TodoList list) {
        list.saveTasks("todo_list.txt");
    }
}