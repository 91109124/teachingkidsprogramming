package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.EventUtils.MouseRightClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class ConnectTheDots implements MouseRightClickListener, MouseLeftClickListener
{
  public static void main(String[] args)
  {
    new ConnectTheDots();
  }
  public ConnectTheDots()
  {
    for (int i = 0; i < array.length; i++)
    {
    }
    setUpTheWindow();
    prepareColorPalette();
    //    Listen for left clicks on the window for the tortoise  --#1
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //    Listen for right clicks on the window for the tortoise  --#20.2
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //    addDot at x and y (recipe below) --#5
    //    ------------- Recipe for addDot --#6
    //        createCircle at x and y (recipe below) --#2
    createCircle(x, y);
    //        ------------- Recipe for createCircle --#3.0 (everything in this recipe)
    //           Create a new circle with a radius of 11 using the next color on the color wheel 
    Circle circle = new Circle(11, ColorWheel.getNextColor());
    //           Place the circle on the tortoise's window 
    //           Change the circle to be 60% opaque 
    Circle.setTransparency(40);
    //           Move the circle so that it's center is at the current position of the mouse (x,y) 
    Circle.setCenter(x, y);
    //        ------------- End of createCircle Recipe --#3.1
    //    Move the tortoise to the current position of the mouse (x,y) --#4
    //    ------------- End of addDot Recipe 
    //    Uncomment to write the text "Right click to clear the window" on the screen at position 100, 100 --#8
    //    new Text("Right click to clear the window").setTopLeft(100, 100).addTo(Tortoise.getBackgroundWindow());
  }
  @Override
  public void onRightMouseClick(int x, int y)
  {
    //    Clear everything from the window HINT: Use Tortoise --#7
  }
  private static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Pinks.Pink);
    ColorWheel.addColor(PenColors.Greens.Teal);
  }
  private void setUpTheWindow()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.hide();
  }
}
