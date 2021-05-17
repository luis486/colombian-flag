package ui;

import model.ColorFlag;
import thread.ColombianThread;

public class ColombianUI {

    public final static String ESC = "\u001b[";
    private ColorFlag[] cf;
    private ColombianThread[] ct;

    private final String yellow = "\u001b[43m";
    private final String blue = "\u001b[44m";
    private final String red = "\u001b[41m";
    private final int sizeFlag = 3;

    public ColombianUI() {
        cf = new ColorFlag[sizeFlag];
        ct = new ColombianThread[sizeFlag];

        initializeColor();
        initilalizeThread();

    }

    public void initProgram() {
        for (int i = 0; i < sizeFlag; i++) {
            ct[i].start();
        }
    }

    public void initializeColor() {
        cf[0] = new ColorFlag("y", 0, 0, 0, 100, 15);
        cf[1] = new ColorFlag("b", 15, 0, 15, 100, 25);
        cf[2] = new ColorFlag("r", 25, 0, 25, 100, 33);
    }

    public void initilalizeThread() {
        ct[0] = new ColombianThread(cf[0], this, 25);
        ct[1] = new ColombianThread(cf[1], this, 45);
        ct[2] = new ColombianThread(cf[2], this, 60);
    }

    public void changeFlag(int horizontal, int vertical, String color) {

        if (color.equals("y")) {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + yellow + " " + ESC);
        } else if (color.equals("b")) {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + blue + " " + ESC);
        } else {
            System.out.print(ESC + horizontal + "G" + ESC + vertical + "d" + red + " " + ESC);
        }
    }
}
