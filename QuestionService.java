import java.util.Scanner;

public class QuestionService {
    private Questions question[] = new Questions[5];
    private Scanner input = new Scanner(System.in);
    private String selectedAnswer[] = new String[5];

    public QuestionService(){
        question[0] = new Questions();
        question[1] = new Questions();
        question[2] = new Questions();
        question[3] = new Questions();
        question[4] = new Questions();
    }
    

        void start() {
        System.out.println("Welcome to this quiz game! Press enter to continue: ");
        String i = input.nextLine();
        i = "Lets go!";
        System.err.println(i);
        }

        void game() {
            for(int i =0;i<5;i++){
                question[i].setId(i+1);
            }
            //setting the questions
            question[0].setQuestions("Who is the current prime minister (2024) of india?");
            question[1].setQuestions("What is the name of our planet?");
            question[2].setQuestions("In which country does anime originate?");
            question[3].setQuestions("Whats the name of the currency used in US?");
            question[4].setQuestions("Whats the GDP of india?");

            // options
            question[0].setOptions("A.Rahul Gandhi", "B.Narendra Modi", "C.Mahatma Gandhi", "D.APJ Abdulkalam");
            question[1].setOptions("A.Moon", "B.Sun", "C.Earth", "D.Mars");
            question[2].setOptions("A.Japan", "B.France", "C.Afganistan", "D.Russia");
            question[3].setOptions("A.Indian Rupee", "B.Japanese Yen", "C.Us Dollar", "D.Euro");
            question[4].setOptions("A.10.56 trillion", "B.2.54 trillion", "C.6.87 trillion", "D.3.89 trillion");

            //set answers
            question[0].setAnswer("Narendra Modi");
            question[0].setAnswerOption("B");
            question[1].setAnswer("Earth");
            question[1].setAnswerOption("C");
            question[2].setAnswer("Japan");
            question[2].setAnswerOption("A");
            question[3].setAnswer("Us Dollar");
            question[3].setAnswerOption("C");
            question[4].setAnswer("3.89 trillion");
            question[4].setAnswerOption("D");

            // function starts!
            for(int i = 0; i<5;i++){
                System.out.println("--------------------------------------------------");
                System.out.println(question[i].getId()+") "+question[i].getQuestions()+"\n");
                for(int j = 0; j<4;j++){
                    System.out.print(question[i].options[j]+"\n");
                }
                System.out.println("please enter your answer: ");
                selectedAnswer[i] = input.nextLine();
            
            }

        }      
        
        void score(){

            int score = 0;

            for(int i = 0; i<5 ; i++){
                if (selectedAnswer[i].toUpperCase().equals(question[i].getAnswer().toUpperCase())){
                    score++;
                }
                if (selectedAnswer[i].toUpperCase().equals(question[i].getAnswerOption().toUpperCase())) {
                    score++;
                }
            }

            System.out.println("the number of answers you got right are:");
            System.out.print(score);
            
            
        }
    
}
