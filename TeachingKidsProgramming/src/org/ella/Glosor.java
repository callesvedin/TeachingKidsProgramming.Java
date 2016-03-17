package org.ella;

import org.teachingextensions.windows.MessageBox;

public class Glosor {

    public static void main(String[] args) {
	ask("skinka", "ham");
	ask("kall", "cold");
	ask("frukt", "fruit");
	ask("törstig", "thirsty");
	ask("söt", "sweet");
	ask("smak", "taste");
	ask("socker", "suger");
	ask("rostat bröd", "toast");
	ask("smör", "butter");
	ask("hungrig", "hungry");
	ask("smaka", "taste");
	MessageBox.showMessage("DU KLARADE DET!!!!!!");

    }

    private static void ask(String svenska, String engelska) {
	String svar = MessageBox.askForTextInput("Vad heter " + svenska
		+ " på engelska?");
	if (svar.equalsIgnoreCase(engelska)) {
	    correct();
	} else {
	    wrong();
	    ask(svenska, engelska);
	}
    }

    private static void wrong() {
	MessageBox.showMessage("Fell! Testa igen.");

    }

    private static void correct() {
	MessageBox.showMessage("Rät svar!");

    }

}
