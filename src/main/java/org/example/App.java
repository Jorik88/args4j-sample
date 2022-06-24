package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.parseArguments(args);

        LOGGER.info("dbName argument value is {}", configuration.getDbName());
        LOGGER.info("tableName argument value is {}", configuration.getTableName());
        LOGGER.info("enableLogging argument value is {}", configuration.isEnableLogging());
        LOGGER.info("counter argument value is {}", configuration.getCounter());
        LOGGER.info("all arguments are {}", configuration.toString());

    }
}
