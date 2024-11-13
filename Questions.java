public class Questions {
    private int id;
    private String questions;
    public final String options[] = new String[4];
    private String selectedAnswer;
    private String answer;
    private String answerOption;


    public Questions() {
    }
    

    public int getId() {
        return id;
    }
    public String getQuestions() {
        return questions;
    }

    public String[] getOptions() {
        return options;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public String getAnswer() {
        return answer;
    }
    
    public String getAnswerOption() {
        return answerOption;
    }

    
//---------------------------------------------------------
    public void setId(int id) {
        this.id = id;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public void setOptions(String option1,String option2, String option3, String option4) {
        int i = 0;
        String parameters[] = {option1,option2,option3,option4};
        for (String item : parameters){
            options[i] = item;
            i++;
        }
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

}
