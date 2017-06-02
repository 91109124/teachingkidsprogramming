package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    drawHouse();
    Tortoise.move(120);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(120);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
    Tortoise.move(90);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(90);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(20);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouse()
  {
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(40);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(40);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
