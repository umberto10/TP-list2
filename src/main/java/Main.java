import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Contract_creator c = new Contract_creator("XD");
        c.set_buyer_name("Kowalski");
        c.add_article("heh",12.50,3);
        c.add_article("kek",10.0,10);

        c.set_place("Columbia");

        c.set_date(new Date(1,1,1));

        Contracts cd = new Contracts();

        cd.add_existing_contract(c);
        cd.add_new_contract("LOL");

        cd.show_contracts();

        cd.contracts.get(1).set_buyer_city("Downtown");


        cd.read_contract("LOL");



    }
}
