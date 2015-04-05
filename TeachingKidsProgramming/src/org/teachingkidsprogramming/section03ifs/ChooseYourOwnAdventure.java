package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("En morgon vaknade sköldpaddan upp i en dröm.");
    //
    //      Anropa animera börja historian receptet (animateStartStory) --#38.1
    //
    //      ------------- Recept för att animera börja historien (animateStartStory) --#38.2
    //         Visa sköldpaddan --#37
    //         Nuvaranande färg är svart --#39.2
    //         Gör följande 25 gånger --#41.1
    //              Byt bakgrund till nuvarande penfärg  --#39.1
    //              Gör nuvarande penfärg ljusare (lighter) --#42
    //              Vänta i 100 millisekunder --#40  
    //         Repetera --#41.2
    //      ------------- Slut på animateStartStory recept --#38.3
    //
    String svar = MessageBox.askForTextInput("Vill du 'vakna' eller 'utforska' drömmen?");
    //      Om användaren svarar "vakna" --#6
    if (svar.equalsIgnoreCase("vakna"))
    {
      //          Anropa vakna receptet (wakeUp) --#5.1
      wakeUp();
    }
    //      Annars, om användaren svarar "utforska" --#9
    else if (svar.equalsIgnoreCase("utforska"))
    {
      //          anropa närma dig klet receptet (approachOoze) --#8.1
      approachOoze();
      //
    }
    //      Annars, om svaret är något annat --#12
    else
    {
      //            Anropa fel svar receptet (badAnswer) --#11.1
      badAnswer();
    }
    //
  }
  private static void badAnswer()
  {
    //      ------------- Recept för fel svar (badAnswer) --#11.2
    //         Säg till användaren "Du vet inte hur man läser instruktioner. Du kan inte spela det här spelet.  SLUT!." --#10
    MessageBox.showMessage("Du vet inte hur man läser instruktioner. Du kan inte spela det här spelet.  SLUT!.");
    //      ------------- Slut på fel svar receptet --#11.3    
  }
  private static void approachOoze()
  {
    //      ------------- Recept för närma dig ooz (approachOoze) --#8.2
    //         Säg till användaren "Du närmar dig en hink med lysande, grönt klet. Orolig för att du ska hamna i knipa så tar du upp hinken." --#7
    MessageBox
        .showMessage("Du närmar dig en hink med lysande, grönt klet. Orolig för att du ska hamna i knipa så tar du upp hinken.");
    //         Fråga användaren "Vill du hälla kleten i 'trädgården' eller i 'toaletten'?" --#13
    String svar = MessageBox.askForTextInput("Vill du hälla kleten i 'trädgården' eller i 'toaletten'?");
    //         Om dom svarar "toaletten"  --#16
    if (svar.equalsIgnoreCase("toaletten"))
    {
      //              anropa häll i toaletten receptet (pourIntoToilet) --#15.1
      pourIntoToilet();
    }
    //
    //
    //         Annars, om svaret är "trädgården" --#19
    //         Anroopa receptet för häll i trädgården (pourIntoBackyard) --#18.1
    //
    //         ------------- Recept för  häll i trändgården (pourIntoBackyard) --#18.2
    //            Tala om för användaren "När du går till trädgården blir du fångad i ett nät och en jätte tar dig till en kokande kastrull med vatten." --#17
    MessageBox
        .showMessage("När du går till trädgården blir du fångad i ett nät och en jätte tar dig till en kokande kastrull med vatten.");
    //            Fråga användaren "Medan jätten förbereder dig till som soppa... Vad gör du? 'Skrik' eller 'Svimma'?" --#21
    //            Om svaret är "svimma"" --#24
    //
    //                  Anropa receptet sköldpaddssoppa (tortoiseSoup) --#23.1
    //
    //            ------------- Recept för sköldpaddssoppa (tortoiseSoup) --#23.2
    //               Säg till användaren "Du blev en utmärkt soppa! Smaskens!  SLUT." --#22
    //            ------------- Slut på sköldpaddssoppa (tortoiseSoup) --#23.3
    //
    //            Annars, om svaret är "skrik" --#26
    //                  Anropa receptet starta historien (startStory) --#25.1
    //
    //            Annars, om svaret är något annat --#28
    //                  anropa receptet för fel svar (badAnswer)--#27
    //
    //         ------------- Slut på häll i trädgården receptet (pourIntoBackyard) --#18.3
    //         Annars, om svaret är något annat--#20
    //            anropa fel svar receptet (badAnswer) --#19
    //      ------------- Slut på närma dig ? receptet (approachOoze) --#8.3
    //
  }
  private static void pourIntoToilet()
  {
    //         ------------- Recept för häll i toaletten (pourIntoToilet) --#15.2
    //            Säg till användaren "När du häller kleten i toaletten försvinner det undan gutglar och exploderar över dig med radioaktivt avfall." --#14
    MessageBox
        .showMessage("När du häller kleten i toaletten försvinner det undan gurglar och exploderar över dig med radioaktivt avfall.");
    //            Fråga användaren "Vill du träna för att bli en NINJA? 'Ja' eller 'Givet'?" --#29
    //            Om svaret är "yes" --#32
    //                  Anropa receptet ninjasköldpadda (ninjaTortoise) --#31.1
    //
    //            ------------- Recept för ninjasköldpadda (ninjaTortoise) --#31.2
    //               Säg till användaren "Häftigt!  Du lever resten av ditt liv genom att bekämpa brott och äta pizza!" --#30
    //            ------------- Slut på ninjasköldpadda-receptet (ninjaTortoise) --#31.3
    //
    //            Annars, om svaret är "Givet" --#34
    //            Anropa ninjasköldpadda receptet (ninjaTortoise) --#33
    //
    //            Annars, om svaret är något annat --#36
    //            Anropa fel svar receptet (badAnswer) --#35
    //
    //         ------------- Slut på häll i toaletten receptet (pourIntoToilet) --#15.3
  }
  private static void wakeUp()
  {
    //          ------------- Recept för vakna (wakeUp) --#5.2
    //              Säg till användaren "Du vaknar och har en tråkig dag. Slut på sagan." --#4
    MessageBox.showMessage("Du vaknar och har en tråkig dag. SLUT!");
    //          ------------- Slut på vakna (wakeUp) --#5.3
  }
}
