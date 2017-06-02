package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    // adVerb
    private String adVerb;
    //edVerb
    private String edVerb;
    //bodyPart
    private String bodyPart;
  }
  public static void main(String[] args)
  {
    Words Words = new Words();
    Words.adVerb = MessageBox.askForTextInput("Enter an adverb");
    Words.edVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    Words.bodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = Parser.parseRtfFile("view.rtf", Words);
    Viewer.displayRtfFile(currentStory);
  }
}