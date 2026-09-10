package ${package};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ru.senioravanti.commons.loggers.CustomMapMessage;
import ru.senioravanti.commons.loggers.LoggersConfig;
import ru.senioravanti.commons.loggers.LoggersConfigHolder;
import ${package}.utils.ConfigurationLoader;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    static void main() {
        var props = ConfigurationLoader.loadConfig("config.yaml");
        LoggersConfigHolder.setConfig(new LoggersConfig(
            App.class.getPackageName(),
            props.loggers().maxExternalFrames(),
            props.loggers().maxCauseDepth()
        ));
    }
}
