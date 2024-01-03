package org.launchcode;

public abstract class MultipleChoice extends Question {
    //arraylist of hashmaps

    private String answerGiven;
    private String correctAnswer;
//    private ArrayList<HashMap>

    public MultipleChoice(String question, String answerGiven, String correctAnswer) {
        super(question);
        this.answerGiven = answerGiven;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public abstract void checkAnswer();


    @Override
    public abstract void askQuestion();
}
