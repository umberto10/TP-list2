import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    private Contracting_party d;

    @Before
    public void setUp() throws Exception {
        try {
            d = new Buyer();
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @After
    public void tearDown() throws Exception {
        try {
            d = null;
        } catch (Exception e) { System.err.println("ERROR");}
    }

    @Test
    public void set_nip() {
        d.set_nip("11111");
        assertEquals("11111", d.get_nip());
    }

    @Test
    public void set_street() {
        d.set_street("street");
        assertEquals("street", d.get_street());
    }

    @Test
    public void set_city() {
        d.set_city("city");
        assertEquals("city", d.get_city());
    }

    @Test
    public void set_country() {
        d.set_country("country");
        assertEquals("country", d.get_country());
    }

    @Test
    public void set_name() {
        d.set_name("name");
        assertEquals("name", d.get_name());
    }
}
