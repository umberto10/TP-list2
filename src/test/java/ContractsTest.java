import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContractsTest {

    private Contracts con_test;

    @Before
    public void setUp() throws Exception {
        try {
            con_test = new Contracts();
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @After
    public void tearDown() throws Exception {
        try {
            con_test = null;
        } catch (Exception e) {System.err.println("ERROR");}
    }

    @Test
    public void add_existing_contract() {
        Contract_creator c = new Contract_creator("TEST");
        con_test.add_existing_contract(c);
        assertEquals("TEST", this.con_test.contracts.get(0).get_title());
    }

    @Test
    public void add_new_contract() {
        con_test.add_new_contract("TEST");
        assertEquals("TEST", this.con_test.contracts.get(0).get_title());
    }

    @Test
    public void show_contracts() {
        Contract_creator c = new Contract_creator("TEST");
        con_test.contracts.add(c);
    }

}