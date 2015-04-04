package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    drawHouse(40);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  /*
   * När du är klar se filmen http://youtu.be/nQlsrnaMeuw
   * 
   * Andra relaterade filmer
   * Underrecept -> Metod : http://youtu.be/C6fnqjceVcs
   */
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
