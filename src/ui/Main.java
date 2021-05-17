package ui;

public class Main {

    public final static String ESC = "\u001b[";

    public static void main(String[] args) throws Exception {

        System.out.print(ESC + "2J");// Clear screen

        ColombianUI ct = new ColombianUI();

        ct.initProgram();

    }
}