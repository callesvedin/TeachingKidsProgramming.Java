package org.teachingkidsprogramming.section01forloops;

import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

public class SimpleSquareQuiz implements SquareQuiz
{
  public void question1()
  {
    //  Flytta sköldpaddan 110pixlar
  }
  public void question2()
  {
    //  Sväng sköldpaddan 1/5 av 360 grader till höger
  }
  public void question3()
  {
    //  Byt färg på så att sköldpaddan ritar med gult (yellow)
  }
  public void question4()
  {
    //  Byt bredden(width) på linjen sköldpaddan ritar till 5 pixlar
  }
  public static void main(String[] args)
  {
    new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
  }
}
