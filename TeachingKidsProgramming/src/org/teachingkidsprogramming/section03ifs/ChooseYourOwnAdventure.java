package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
	startStory();
    }

    private static void startStory() {
	MessageBox.showMessage("En morgon vaknade sköldpaddan upp i en dröm.");
	//
	// Anropa animera börja historian receptet (animateStartStory) --#38.1
	//
	// ------------- Recept för att animera börja historien
	// (animateStartStory) --#38.2
	// Visa sköldpaddan --#37
	// Nuvaranande färg är svart --#39.2
	// Gör följande 25 gånger --#41.1
	// Byt bakgrund till nuvarande penfärg --#39.1
	// Gör nuvarande penfärg ljusare (lighter) --#42
	// Vänta i 100 millisekunder --#40
	// Repetera --#41.2
	// ------------- Slut på animateStartStory recept --#38.3
	//
	String svar = MessageBox
		.askForTextInput("Vill du 'vakna' eller 'utforska' drömmen?");
	if (svar.equalsIgnoreCase("vakna")) {
	    wakeUp();
	} else if (svar.equalsIgnoreCase("utforska")) {
	    approachOoze();
	} else {
	    badAnswer();
	}
    }

    private static void badAnswer() {
	MessageBox
		.showMessage("Du vet inte hur man läser instruktioner. Du kan inte spela det här spelet. SLUT!");
    }

    private static void approachOoze() {
	MessageBox
		.showMessage("Du närmar dig en hink med lysande, grönt klet. Orolig för att du ska hamna i knipa så tar du upp hinken.");
	String svar = MessageBox
		.askForTextInput("Vill du hälla kleten i 'trädgården' eller i 'toaletten'?");
	if (svar.equalsIgnoreCase("toaletten")) {
	    pourIntoToilet();
	} else if (svar.equalsIgnoreCase("trädgården")) {
	    pourIntoBackyard();
	} else {
	    badAnswer();
	}
	//
    }

    private static void pourIntoBackyard() {
	MessageBox
		.showMessage("När du går till trädgården blir du fångad i ett nät och en jätte tar dig till en kokande kastrull med vatten.");
	String svar = MessageBox
		.askForTextInput("Medan jätten förbereder dig till soppa... Vad gör du? 'Skrik' eller 'Svimma'?");
	if (svar.equalsIgnoreCase("svimma")) {
	    tortoiseSoup();
	}
	//
	//
	//
	else if (svar.equalsIgnoreCase("skrik")) {
	    startStory();
	} else {
	    badAnswer();
	}
	//
    }

    private static void tortoiseSoup() {
	MessageBox.showMessage("Du blev en utmärkt soppa! Smaskens!  SLUT.");
    }

    private static void pourIntoToilet() {
	MessageBox
		.showMessage("När du häller kleten i toaletten försvinner det undan gurglar och exploderar över dig med radioaktivt avfall.");
	// Fråga användaren
	// "Vill du träna för att bli en NINJA? 'Ja' eller 'Givet'?" --#
	// Om svaret är "yes" --#32
	// Anropa receptet ninjasköldpadda (ninjaTortoise) --#31.1
	//
	// ------------- Recept för ninjasköldpadda (ninjaTortoise) --#31.2
	// Säg till användaren
	// "Häftigt!  Du lever resten av ditt liv genom att bekämpa brott och äta pizza!"
	// --#30
	// ------------- Slut på ninjasköldpadda-receptet (ninjaTortoise)
	// --#31.3
	//
	// Annars, om svaret är "Givet" --#34
	// Anropa ninjasköldpadda receptet (ninjaTortoise) --#33
	//
	// Annars, om svaret är något annat --#36
	// Anropa fel svar receptet (badAnswer) --#35
	//
    }

    private static void wakeUp() {
	MessageBox.showMessage("Du vaknar och har en tråkig dag. SLUT!");
    }
}
