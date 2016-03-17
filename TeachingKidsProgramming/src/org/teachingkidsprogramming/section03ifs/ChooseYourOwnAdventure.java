package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
	startStory();

    }

    private static void startStory() {
	MessageBox.showMessage("En morgon vaknade sköldpaddan upp i en dröm.");
	//

	animateStartStory();
	//
	// ------------- Recept för att animera börja historien

	Tortoise.show();

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

    private static void animateStartStory() {
	Tortoise.setPenColor(Color.BLACK);
	// Nuvaranande färg är svart --#39.2
	// Gör följande 25 gånger --#41.1
	// Byt bakgrund till nuvarande penfärg --#39.1

	// Gör nuvarande penfärg ljusare (lighter) --#42
	// Vänta i 100 millisekunder --#40
	// Repetera --#41.2
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

	String svar = MessageBox
		.askForTextInput("Vill du träna för att bli en NINJA? 'Ja' eller 'Givet'?");

	if (svar.equalsIgnoreCase("Ja"))

	    ninjaTotoise();
	else if (svar.equalsIgnoreCase("Givet")) {
	    ninjaTotoise();
	}

	else {
	    badAnswer();
	}
	//
    }

    private static void ninjaTotoise() {
	MessageBox
		.showMessage("Häftigt! Du lever resten av dit liv genom att bekämpa brott och äta pizza!");

    }

    private static void wakeUp() {
	MessageBox.showMessage("Du vaknar och har en tråkig dag. SLUT!");
    }
}
