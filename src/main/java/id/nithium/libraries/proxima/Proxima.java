package id.nithium.libraries.proxima;

import id.nithium.libraries.proxima.logger.ProximaFormatter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Proxima {
    private static final Logger logger = Logger.getLogger("");
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();

    public static Logger getLogger() {
        return getLogger(null);
    }

    public static Logger getLogger(String prefix) {
        for (Handler handler : logger.getHandlers()) {
            if (handler != consoleHandler) {
                logger.removeHandler(logger.getHandlers()[0]);
                consoleHandler.setFormatter(new ProximaFormatter(prefix));
                logger.addHandler(consoleHandler);
            }
        }

        return logger;
    }
}