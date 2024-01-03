package org.launchcode;

public class TrueFalse extends Question{
    private boolean answerGiven;
    private boolean correctAnswer;

    public TrueFalse(String question, boolean answerGiven, boolean correctAnswer) {
        super(question);
        this.answerGiven = answerGiven;
        this.correctAnswer = correctAnswer;
    }

    public boolean isAnswerGiven() {
        return answerGiven;
    }

    public void setAnswerGiven(boolean answerGiven) {
        this.answerGiven = answerGiven;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

//    @Override
//    public void checkAnswer();


    @Override
    public void askQuestion();
}
