import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> logger.info("Terminating the program...")));
        UDPClient client = new UDPClient();
        client.run();
    }
}