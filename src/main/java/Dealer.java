public class Dealer extends Conctracting_party {

    public Dealer() {
        nip = "Default";
        street = "Default";
        city = "Default";
        country = "Default";
        name = "Default";
    }

    public Dealer(String nip, String street, String city, String country, String name) {
        super(nip, street, city, country, name);
    }

    @Override
    public void show_me() {

        System.out.println("DEALER:");
        System.out.println("NIP: " + nip);
        System.out.println("country: " + country);
        System.out.println("city: " + city);
        System.out.println("street: " + street);
        System.out.println("name: " + name);

    }
}

