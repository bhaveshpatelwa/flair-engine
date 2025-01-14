package com.fbi.engine.domain.details;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CockroachdbConnectionDetailsTest {

    @Test
    public void getDetails() {
        CockroachdbConnectionDetails details = new CockroachdbConnectionDetails("localhost", 1234, "dbname");
        assertEquals("localhost", details.getServerIp());
        assertEquals("dbname", details.getDatabaseName());
        assertEquals("jdbc:postgresql://localhost:1234/dbname", details.getConnectionString());
        assertEquals(1234, (int) details.getServerPort());
    }

}
