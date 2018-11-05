public class Main {

    public static void main(String[] args) {



        Contracts cd = new Contracts();

        cd.add_new_contract("LOL");

        cd.show_contracts();

        cd.contracts.get(0).buyer.set_city("Downtown");
        cd.contracts.get(0).buyer.set_street("1st street");
        cd.contracts.get(0).add_article("coca cola",12.50,3);
        cd.contracts.get(0).add_article("frytki",10.0,3);


        cd.read_contract("LOL");



    }
}
