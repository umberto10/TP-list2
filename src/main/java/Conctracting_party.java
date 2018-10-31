public abstract class Conctracting_party {
    public String nip;
    public String street;
    public String city;
    public String country;
    public String name;

    public Conctracting_party(){};

    public Conctracting_party(String nip, String street ,String  city ,String  country ,String  name) {
        this.nip = nip;
        this.street = street;
        this.city = city;
        this.country = country;
        this.name = name;
    }
    public void show_me(){};

    public void set_nip(String nip) {this.nip = nip;}
    public void set_street(String street) {this.street = street;}
    public void set_city(String city) {this.city = city;}
    public void set_country(String country) {this.country = country;}
    public void set_name(String name) {this.name = name;}

}
