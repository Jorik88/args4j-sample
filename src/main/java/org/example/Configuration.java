package org.example;

import com.google.common.base.MoreObjects;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.BooleanOptionHandler;
import org.kohsuke.args4j.spi.IntOptionHandler;

public class Configuration {

    @Option(name = "-dbName", aliases = "--dbName", usage = "database name", required = true, handler = StringOptionHandler.class)
    private String dbName;

    @Option(name = "-tableName", usage = "table name", handler = StringOptionHandler.class)
    private String tableName = "some_table_name";

    @Option(name = "-enableLogging", handler = BooleanOptionHandler.class, usage = "switch for logging")
    private boolean enableLogging;

    @Option(name = "-counter", usage = "some counter", handler = IntOptionHandler.class)
    private int counter = 2;

    public void parseArguments(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public String getDbName() {
        return dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public boolean isEnableLogging() {
        return enableLogging;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("dbName", dbName)
                .add("tableName", tableName)
                .add("enableLogging", enableLogging)
                .add("counter", counter)
                .toString();
    }
}
