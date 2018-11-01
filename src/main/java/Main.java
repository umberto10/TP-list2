import java.util.Date;

public class Main {

    public static void main(String[] args) {



        Contracts cd = new Contracts();

        cd.add_new_contract("LOL");

        cd.show_contracts();

        cd.contracts.get(1).buyer.set_city("Downtown");


        cd.read_contract("LOL");



    }
}
