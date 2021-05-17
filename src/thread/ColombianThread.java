package thread;

import model.*;
import ui.*;

public class ColombianThread extends Thread {
    private ColorFlag cf;
    private ColombianUI cui;
    private int sleepTime;

    public ColombianThread(ColorFlag cf, ColombianUI cui, int sleepTime) {
        this.cf = cf;
        this.cui = cui;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        setPosition();
    }

    public void setPosition() {
        for (int i = 0; i < cf.getWidth(); i++) {
            cf.avanceHorizontal();
            for (int j = cf.getSavePosition(); j < cf.getHeight(); j++) {
                cui.changeFlag(cf.getHorizontal(), cf.getVertical(), cf.getColor());
                cf.avanceVertical();
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cf.setVerticalPosition();
        }
    }
}
