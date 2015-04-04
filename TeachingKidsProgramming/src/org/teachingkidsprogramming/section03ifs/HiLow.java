package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int min = 1;
    int max = 100;
    int svar = NumberUtils.getRandomInt(min, max);
    for (int i = 1; i <= 8; i++)
    {
      int number = MessageBox.askForNumericalInput("Säg ett nummer mellan " + min + " och " + max);
      if (number == svar)
      {
        Sounds.playBeep();
        MessageBox.showMessage("Du har vunit");
        System.exit(0);
      }
      else if (number > svar)
      {
        MessageBox.showMessage("För högt");
      }
      else if (number < svar)
      {
        MessageBox.showMessage("För lågt");
      }
    }
    MessageBox.showMessage("Du har förlorat. Svaret var " + svar);
  }
}
