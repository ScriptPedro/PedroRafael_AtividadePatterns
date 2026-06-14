public class App {
    public static void main(String[] args) throws Exception {
        LegacyLogger legacyLogger = new LegacyLogger();
        LegacyLoggerAdpter loggerAdpter = new LegacyLoggerAdpter(legacyLogger);
        Application application = new Application(loggerAdpter);
        application.run();
    }
}
