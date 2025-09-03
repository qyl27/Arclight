package io.izzel.arclight.gradle.util;

import net.fabricmc.tinyremapper.api.TrLogger;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;

public class ArclightTinyRemapperLogger implements TrLogger {

    private static final Logger LOGGER = Logging.getLogger(ArclightTinyRemapperLogger.class);

    public static final ArclightTinyRemapperLogger INSTANCE = new ArclightTinyRemapperLogger();

    @Override
    public void log(Level level, String message) {
        switch (level) {
            case DEBUG -> LOGGER.debug(message);
            case INFO -> LOGGER.info(message);
            case WARN -> LOGGER.warn(message);
            case ERROR -> LOGGER.error(message);
        }
    }
}
