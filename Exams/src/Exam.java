import java.util.Scanner;

public class Exam {
    // ... (existing attributes: examid, name, topic, dateOfExam, questions) ...
    private String examid;
    private String name;
    private String topic;
    private String dateOfExam;
    private Question[] questions;

    public Exam(String examid, String name, String topic, String dateOfExam, Question[] questions) {
        this.examid = examid;
        this.name = name;
        this.topic = topic;
        this.dateOfExam = dateOfExam;
        this.questions = questions;
    }
    
    // ... (existing displayExam method) ...
    public void displayExam() {
        System.out.println("========================================");
        System.out.println("Exam ID: " + examid);
        System.out.println("Name: " + name);
        System.out.println("Topic: " + topic);
        System.out.println("Date of Exam: " + dateOfExam);
        System.out.println("========================================");

        for (Question q : questions) {
            q.displayQuestion();
        }
    }

    public void conductTest() {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;
            System.out.println("Starting " + this.name);
            System.out.println("Answer with the option number (1, 2, 3, or 4).");
            System.out.println("----------------------------------------");
            
            for (Question q : questions) {
                System.out.println("Q" + q.getQno() + ": " + q.getQuestion());
                System.out.println("1. " + q.getOpt1());
                System.out.println("2. " + q.getOpt2());
                System.out.println("3. " + q.getOpt3());
                System.out.println("4. " + q.getOpt4());

                int userAnswer;
                while (true) {
                    System.out.print("Your answer: ");
                    if (scanner.hasNextInt()) {
                        userAnswer = scanner.nextInt();
                        if (userAnswer >= 1 && userAnswer <= 4) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 4.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Consume the invalid input
                    }
                }

                if (userAnswer == q.getAns()) {
                    score += q.getMarks();
                }
                System.out.println(); // Add a blank line for readability
            }

            System.out.println("Test completed! Your total score is: " + score);
            if (score >= 3) {
                System.out.println("Congratulations! You completed the test.");
            } else {
                System.out.println("Better luck next time.");
            }
        }
    }
}

