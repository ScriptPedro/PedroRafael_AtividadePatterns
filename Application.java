public class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.info("Application em andamento.");
        logger.error("falha ao conectar no banco de dados.");
    }

}
