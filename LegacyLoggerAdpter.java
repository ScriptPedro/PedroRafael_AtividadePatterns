public class LegacyLoggerAdpter {
    private LegacyLogger legacyLogger;

    public LegacyLoggerAdpter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    public void info(String message) {
        legacyLogger.Log("INFO", message);
    }

    public void error(String message) {
        legacyLogger.Log("ERROR", message);
    }


}
