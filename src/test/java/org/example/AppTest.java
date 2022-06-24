package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AppTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void caseWhenRequiredParameterIsNotProvided() {
        expectedException.expect(IllegalArgumentException.class);
        String[] args = {};
        new Configuration().parseArguments(args);
    }

    @Test
    public void caseGetAllParameters() {
        String[] args = {"-dbName=weather"};
        Configuration configuration = new Configuration();
        configuration.parseArguments(args);

        assertEquals("weather", configuration.getDbName());
        assertEquals("some_table_name", configuration.getTableName());
        assertFalse(configuration.isEnableLogging());
        assertEquals(2, configuration.getCounter());
    }

    @Test
    public void caseOverrideDefaultParameters() {
        String[] args = {
                "-dbName=weather",
                "-tableName=new_table_name"
        };
        Configuration configuration = new Configuration();
        configuration.parseArguments(args);

        assertEquals("weather", configuration.getDbName());
        assertEquals("new_table_name", configuration.getTableName());
        assertFalse(configuration.isEnableLogging());
        assertEquals(2, configuration.getCounter());
    }
}
