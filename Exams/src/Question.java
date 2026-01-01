
public class Question {
	public class Question {
	    // ... (existing attributes) ...
	    private int qno;
	    private String question;
	    private String opt1;
	    private String opt2;
	    private String opt3;
	    private String opt4;
	    private int ans;
	    private int marks;
	    
	    public Question(int qno, String question, String opt1, String opt2, String opt3, String opt4, int ans, int marks) {
	        this.qno = qno;
	        this.question = question;
	        this.opt1 = opt1;
	        this.opt2 = opt2;
	        this.opt3 = opt3;
	        this.opt4 = opt4;
	        this.ans = ans;
	        this.marks = marks;
	    }

	    // Add getter methods
	    public int getQno() { return qno; }
	    public String getQuestion() { return question; }
	    public String getOpt1() { return opt1; }
	    public String getOpt2() { return opt2; }
	    public String getOpt3() { return opt3; }
	    public String getOpt4() { return opt4; }
	    public int getAns() { return ans; }
	    public int getMarks() { return marks; }

	    public void displayQuestion() {
	        System.out.println("Q" + qno + ": " + question);
	        System.out.println("1. " + opt1);
	        System.out.println("2. " + opt2);
	        System.out.println("3. " + opt3);
	        System.out.println("4. " + opt4);
	        System.out.println("Answer: " + ans);
	        System.out.println("Marks: " + marks);
	        System.out.println();
	    }
	}

}
