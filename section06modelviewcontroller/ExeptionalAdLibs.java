package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExeptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdverb();
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb?");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb.");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askEdverb()
  {
    String edVerb = MessageBox.askForTextInput("What is the ed-verb?");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb ending with ed");
      edVerb = askEdverb();
    }
    return edVerb;
  }
}