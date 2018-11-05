import java.util.ArrayList;
import java.util.List;

public class Contracts {
    public List<Contract_creator> contracts = new ArrayList<Contract_creator>();


    public void add_existing_contract(Contract_creator contract) {
        contracts.add(contract);
    }

    public void add_new_contract(String name) {
        Contract_creator contract = new Contract_creator(name);
        contracts.add(contract);
    }



    public void show_contracts() {
        int i = 0;
        for (Contract_creator contract : contracts) {
            System.out.println(i+") Contract --> " + contract.get_title());
            i++;
        }
        System.out.println();
    }

    public void read_contract(String title) {
        for (Contract_creator contract : contracts) {
            if (title.equals(contract.get_title())) {
                contract.read_me();
                break;
            }

        }
    }
}
