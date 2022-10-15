import java.util.*;
import java.io.*;

public class TodoListManager {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO: Your Code Here
        System.out.println("Welcome to your TODO List Manager!");
        helpPrint();
        Scanner console = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<String>();

        String userChoice = console.nextLine();
        multipleItems(console,todos);
        while (!userChoice.equalsIgnoreCase("Q")) {

            if (userChoice.equalsIgnoreCase("A")) {
                addItem(console, todos);
            } else if (userChoice.equalsIgnoreCase("M")) {
                markItemAsDone(console, todos);
            } else if (userChoice.equalsIgnoreCase("L")) {
                loadItems(console, todos);

            } else if (userChoice.equalsIgnoreCase("S")) {
                saveItems(console, todos);

            } else if (!userChoice.equalsIgnoreCase("Q")){
                System.out.println("Unknown input: " + userChoice);

            }
            duplicateItems(todos);
            printTodos(todos);
            helpPrint();
            userChoice = console.nextLine();

        }
    }
    //This method prints out the arraylist of todo input
    //Parameters:
    //   - todos: the string ArrayList
    public static void printTodos (List<String> todos) {
        // TODO: Your Code Here
        System.out.println("Today's TODOs:");
        for (int i = 0; i < todos.size(); i++) {
            System.out.println("  " + (i+1) + ": " + todos.get(i));
        }
        if (todos.isEmpty()) {
            System.out.println("  You have nothing to do yet today! Relax!");

        }

    }
    //This method asks the user input for adding todos to arraylist
    //and put them at choice index in the list
    //Parameters:
    //   - console: the scanner
    //   - todos: the string arrayList
    public static void addItem (Scanner console, List<String> todos) {
        // TODO: Your Code Here
        String userAdd1 = "";
        String userAdd2 = "";
        while (userAdd1 == ""){
            System.out.print("What would you like to add? ");
            userAdd1 = console.nextLine();
        }
        if (todos.isEmpty()){
            todos.add(userAdd1);
        }else {

            System.out.print("Where in the list should it be (1-");
            System.out.print(todos.size() + 1 + ")? (Enter for end): ");
            userAdd2 = console.nextLine();

            if (userAdd2 == "") {
                todos.add(userAdd1);
            } else {
                int num = Integer.parseInt(userAdd2);
                todos.add(num -1 , userAdd1);
            }
        }
    }
    //This method marks/takes off specific todo from the arrayList
    //Parameters:
    //   - console: the scanner
    //   - todos: the string arraylist
    public static void markItemAsDone(Scanner console, List<String> todos) {
        // TODO: Your Code Here
        String userMark = "";
        System.out.print("Which item did you complete (1-" + todos.size() + ")? ");
        userMark = console.nextLine();

        int num = Integer.parseInt(userMark);
        todos.remove(num -1);

    }

    //The method loads saved files that stores the arraylist of todos
    //Parameters:
    //   - console: the scanner
    //   - todos: the string arraylist
    public static void loadItems(Scanner console, List<String> todos) throws FileNotFoundException {
        // TODO: Your Code Here
        System.out.print("File name? ");
        String loadFile = console.nextLine();
        File todoList = new File (loadFile);
        Scanner input = new Scanner(todoList);
        while (input.hasNextLine()){
            todos. add(input.nextLine());
        }
    }
    //The method saves todos in the arraylist to a file todo.txt
    //Parameters:
    //   - console: the scanner
    //   - todos: the string arrayList
    public static void saveItems(Scanner console, List<String> todos) throws FileNotFoundException {
        // TODO: Your Code Here
        System.out.print("File name? ");
        String saveFile = console.nextLine();

        PrintStream output = new PrintStream(new File(saveFile));
        for (int i = 0; i < todos.size(); i++) {
            output.println(todos.get(i));

        }
    }
    //This method checks if there is a duplicated items in the todo list
    //Parameters:
    //  - todos: the string arrayList
    //Returns:
    //  - true if it doesn't duplicate
    //  - false if it duplicates
    public static boolean duplicateItems (List<String> todos){
        String first = todos.get(0);
        for (int i = 1; i < todos.size(); i++){
            if (!todos.get(i).equals(first)){
                System.out.println("There are some duplicate items, man! :(");
                return false;
            }else {
                System.out.println("Great job! Keep on entering your input! :)");
            }
        }
        return true;
    }

    //This method asks user to inputting multiple todos at the same time
    //Parameters:
    //  - console: the scanner
    //  - todos: the string arraylist
    public static void multipleItems (Scanner console, List<String> todos) {
        String response = "";
        while (!response.equalsIgnoreCase("No more")){
            System.out.print ("Please enter your TODOs: ");
            response = console.nextLine();
            todos.add(response);
        }
    }
    //This helper method helps me to avoid redundancy
    public static void helpPrint (){
        System.out.println("What would you like to do?");
        System.out.print("(A)dd TODO, (M)ark TODO as done, ");
        System.out.print("(L)oad TODOs, (S)ave TODOs, (Q)uit? ");
    }
}
