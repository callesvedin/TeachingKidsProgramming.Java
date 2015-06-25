package org.teachingkidsprogramming.section04mastery;

import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    // Fråga 1 
    //   Anropa trä tråd (thread) 
    //   ------------- Recept för trä tråd
    //       Flytta sköldpaddan 6 pixlar
    //   ------------- Slut på receptet för trä tråd (thread)  
  }
  public void question2()
  {
    //        Gör följande 76 gånger
    //           anropa sy (stitch)
    //        Repetera
  }
  public void question3()
  {
    //        Lägg till färgen lime till färghjulet
  }
  public void question4()
  {
    //        Lägg till färgen röd till färghjulet
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
