import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyerTest {

    private Contracting_party b;

    @Before
    public void setUp() throws Exception {
        try {
            b = new Buyer();
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @After
    public void tearDown() throws Exception {
        try {
            b = null;
        } catch (Exception e) { System.err.println("ERROR");}
    }

    @Test
    public void set_nip() {
        b.set_nip("11111");
        assertEquals("11111", b.get_nip());
    }

    @Test
    public void set_street() {
        b.set_street("street");
        assertEquals("street", b.get_street());
    }

    @Test
    public void set_city() {
        b.set_city("city");
        assertEquals("city", b.get_city());
    }

    @Test
    public void set_country() {
        b.set_country("country");
        assertEquals("country", b.get_country());
    }

    @Test
    public void set_name() {
        b.set_name("name");
        assertEquals("name", b.get_name());
    }
}