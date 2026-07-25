package ${package};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ru.senioravanti.commons.loggers.CustomMapMessage;
import ru.senioravanti.commons.loggers.LoggersConfig;
import ru.senioravanti.commons.loggers.LoggersConfigHolder;
import ru.senioravanti.commons.result.Result;
import ${package}.utils.ConfigurationLoader;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    static void main() {
        var configProps = Result
            .from(() -> ConfigurationLoader.loadConfig("config.yaml"))
            .handle(Exception.class, ex -> {
                LOGGER.error(CustomMapMessage.of("failed to load configuration properties", ex));
                System.exit(1);
            })
            .get();
        LoggersConfigHolder.setConfig(new LoggersConfig(
            App.class.getPackageName(),
            configProps.loggers().maxExternalFrames(),
            configProps.loggers().maxCauseDepth()
        ));
    }
}
