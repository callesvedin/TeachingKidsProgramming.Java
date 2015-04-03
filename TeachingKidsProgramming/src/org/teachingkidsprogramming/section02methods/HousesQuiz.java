package org.teachingkidsprogramming.section02methods;

import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends HousesQuizAdapter
{
  public void questions1Thru6()
  {
    // Fråga 1 
    //   small (recept nedanför) 
    //   ------------- Recept för liten (small) 
    length = 7;
    //   ------------- Slut på small receptet
    //
    //   Fråga 2
    //   medium (recipe below) 
    //   ------------- Recept för mellan (medium ) 
    //      sätt nuvarande längd till 21
    //   ------------- Slut på medium receptet
    //
    //   Fråga 3
    //   large (recipe below) 
    //   ------------- Recept för stor (large) 
    //      sätt nuvarande längd till 63
    //   ------------- Slut på large receptet
    //
    //   Fråga 4
    //   moveTheLength (recipe below) 
    //   ------------- Recept för flyttaLängd(moveTheLength) 
    //      Flytta sköldpaddan nuvarande längd
    //   ------------- Slut på moveTheLength receptet
    //
    //   Fråga 5
    //   turnTheCorner (recipe below) 
    //   ------------- Recept för vändRuntHörnet (turnTheCorner) 
    //      Sväng sköldpaddan 1/3 av ett varv (360grader) till vänster          
    //   ------------- Slut på turnTheCorner receptet
    //
    //   Fråga 6
    //   drawASide (recipe below) 
    //   ------------- Recept för ritaEnSida (drawASide) 
    //      Ropa på moveTheLength och turnTheCorner
    //   ------------- Slut på drawASide receptet
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
