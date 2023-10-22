public class Main {
    public static void main(String[] args) throws Exception {
        Bot bot = new Bot();
        int times = bot.numberOfTimes();
        bot.selectPhotoshopIcon();
        bot.moveMouseToCenter();
        for(int i = 0; i < times; i++) {
            bot.openFile();
        }
        for(int i = 0; i < times; i++) {
            bot.moveMouseToCenter();
            bot.saveFileShortcut();
            bot.selectFileType();
            bot.renameFile();
            bot.closeProject();
        }bot.finish();
    }
}
