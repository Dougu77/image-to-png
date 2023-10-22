import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import javax.swing.JOptionPane;

public class Bot {

    // Bot

    private Robot bot = new Robot();

    // Mouse click

    private int click = InputEvent.BUTTON1_DOWN_MASK;

    // Keys

    private int control = KeyEvent.VK_CONTROL;
    private int alt = KeyEvent.VK_ALT;
    private int letterS = KeyEvent.VK_S;
    private int rightArrow = KeyEvent.VK_RIGHT;
    private int backspace = KeyEvent.VK_BACK_SPACE;
    private int enter = KeyEvent.VK_ENTER;
    private int letterW = KeyEvent.VK_W;

    // Mouse positions

    private int photoshopIconX = 1026;
    private int photoshopIconY = 1056;
    private int centerX = 960;
    private int centerY = 540;
    private int openFileX = 1061;
    private int openFileY = 465;
    private int selectFileTypeX = 240;
    private int selectFileTypeY = 460;
    private int pngX = 240;
    private int pngY = 737;
    private int renameX = 240;
    private int renameY = 436;

    // Bot constructor

    public Bot() throws AWTException {}

    // Functions

    public int numberOfTimes() {
        String input = JOptionPane.showInputDialog("How many images will be converted?");
        return Integer.parseInt(input);
    }

    public void selectPhotoshopIcon() {
        bot.mouseMove(photoshopIconX, photoshopIconY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.delay(500);
    }

    public void moveMouseToCenter() {
        bot.mouseMove(centerX, centerY);
    }

    public void openFile() {
        bot.mouseMove(openFileX, openFileY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.delay(1500);
    }

    public void saveFileShortcut() {
        bot.keyPress(control);
        bot.keyPress(alt);
        bot.keyPress(letterS);
        bot.keyRelease(control);
        bot.keyRelease(alt);
        bot.keyRelease(letterS);
        bot.delay(500);
    }

    public void selectFileType() {
        bot.mouseMove(selectFileTypeX, selectFileTypeY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.delay(500);
        bot.mouseMove(pngX, pngY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.delay(500);
    }

    public void renameFile() {
        bot.mouseMove(renameX, renameY);
        bot.mousePress(click);
        bot.mouseRelease(click);
        bot.keyPress(rightArrow);
        bot.keyRelease(rightArrow);
        deleteName();
        bot.keyPress(enter);
        bot.keyRelease(enter);
        bot.delay(500);
        bot.keyPress(enter);
        bot.keyRelease(enter);
        bot.delay(1500);
    }

    private void deleteName() {
        for(int i = 0; i < 11; i++) {
            bot.keyPress(backspace);
            bot.keyRelease(backspace);
        }
    }

    public void closeProject() {
        bot.keyPress(control);
        bot.keyPress(letterW);
        bot.keyRelease(control);
        bot.keyRelease(letterW);
        bot.delay(1500);
    }

    public void finish() {
        JOptionPane.showMessageDialog(null, "Finished");
    }

}
