package org.teachingkidsprogramming.section03ifs;

import org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuizGrader;

public class HiLowQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HiLowQuiz
{
  public void question1()
  {
    //        Om sköldpaddans Y-position är 115    
    //
    //          Vänd sköldpaddan 63 grader åt höger 
  }
  public void question2()
  {
    //        om sköldpaddans x-position är mindre än sköldpaddans Y-position     
    //
    //          Vänd sköldpaddan 54 grader åt vänster
    //
    //        annars sväng sköldpaddan 22 grader åt höger
  }
  public void question3()
  {
    //        display the message "elcomeway omehay!"
    //        visa meddelandet "elcomeway omehay!"
  }
  public void question4()
  {
    //        Om sköldpaddans Y-position är större än 50
    //
    //         Sväng sköldpaddan 177 grader åt vänster
  }
  public static void main(String[] args)
  {
    new HiLowQuizGrader().grade(new HiLowQuiz());
  }
}
