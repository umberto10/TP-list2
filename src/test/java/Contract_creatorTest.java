import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class Contract_creatorTest {

    private Contract_creator c;

    @Before
    public void setUp() throws Exception {
        try {
            c = new Contract_creator("TEST");
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @After
    public void tearDown() throws Exception {
        try {
            c = null;
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @Test
    public void set_title() throws Exception{
        try {
            c.set_title("CHANGE");
            assertEquals("CHANGE", c.get_title());
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @Test
    public void set_place() throws Exception{
        try {
            c.set_place("Rome");
            assertEquals("Rome", c.get_place());
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @Test
    public void set_date() throws Exception{
        try {
            c.set_date(new Date((2000 - 1900), 0, 1));
            assertEquals("01 - 01 - 2000", c.get_date());
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @Test
    public void  add_article() throws Exception{
        try {
            c.add_article("book", 12.5, 2);
            assertEquals("book", c.articles.get(0).get_name());
            assertEquals(12.50 , c.articles.get(0).get_price(),0);
            assertEquals(2, c.articles.get(0).get_count());
        } catch (Exception e) {System.out.println("Error");}
    }

}
