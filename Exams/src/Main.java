import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create 5 questions for the Java test
        Question[] javaQuestions = {
            new Question(1, "What is a correct syntax to output 'Hello World' in Java?", "System.out.println('Hello World');", "Console.WriteLine('Hello World');", "echo('Hello World');", "print('Hello World');", 1, 1),
            new Question(2, "Which data type is used to create a variable that should store text?", "txt", "string", "String", "myString", 3, 1),
            new Question(3, "How do you create a variable with the numeric value 5?", "num x = 5;", "int x = 5;", "x = 5;", "x = int(5);", 2, 1),
            new Question(4, "How do you create a method in Java?", "myMethod()", "myMethod[]", "myMethod{}", "method myMethod()", 1, 1),
            new Question(5, "Which keyword is used to import a package from the Java library?", "import", "get", "pull", "include", 1, 1)
        };
        // Create the Java exam object
        Exam javaExam = new Exam("JAVA01", "Java Basics Test", "Java Programming", "2025-10-20", javaQuestions);

        // Create 5 questions for the HTML test
        Question[] htmlQuestions = {
            new Question(1, "What does HTML stand for?", "Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Text Markup Language", "Hyper Tool Markup Language", 1, 1),
            new Question(2, "Which HTML tag is used to define an internal style sheet?", "<style>", "<script>", "<css>", "<html>", 1, 1),
            new Question(3, "How can you make a numbered list?", "<ol>", "<ul>", "<list>", "<dl>", 1, 1),
            new Question(4, "What is the correct HTML tag for a line break?", "<br>", "<lb>", "<break>", "<line>", 1, 1),
            new Question(5, "What is the correct HTML tag for the largest heading?", "<h6>", "<heading>", "<head>", "<h1>", 4, 1)
        };
        // Create the HTML exam object
        Exam htmlExam = new Exam("HTML01", "HTML Fundamentals", "HTML", "2025-10-25", htmlQuestions);

        Scanner scanner = new Scanner(System.in);
        boolean continueTesting = true;

        while (continueTesting) {
            System.out.println("Which exam do you want to appear for?");
            System.out.println("1. Java");
            System.out.println("2. HTML");
            System.out.print("Enter your choice (1 or 2): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                
                if (choice == 1) {
                    javaExam.conductTest();
                } else if (choice == 2) {
                    htmlExam.conductTest();
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
            }

            // Ask the user if they want to continue
            String continueChoice;
            while (true) {
                System.out.print("Do you want to continue? (yes/no): ");
                continueChoice = scanner.nextLine().toLowerCase();
                if (continueChoice.equals("yes") || continueChoice.equals("no")) {
                    break;
                }
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
            if (continueChoice.equals("no")) {
                continueTesting = false;
            }
            System.out.println();
        }

        System.out.println("Thank you for using the exam system. Goodbye!");
        scanner.close();
    }
}
