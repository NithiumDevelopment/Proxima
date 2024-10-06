package id.nithium.libraries.test.proxima;

import id.nithium.libraries.proxima.Proxima;

import java.util.logging.Logger;

public class MainTest {

    public static void main(String[] args) {
        Logger logger = Proxima.getLogger();

        logger.info("Hey, this is just test!");
        logger.warning("WARNING");
        logger.severe("SEVERE");
    }
}
