public abstract class Contracting_party implements Contracting_interface{
    public String nip;
    public String street;
    public String city;
    public String country;
    public String name;

    public Contracting_party(){};

    public Contracting_party(String nip, String street , String  city , String  country , String  name) {
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

    public String get_nip() {return nip;}
    public String get_street() {return street;}
    public String get_city() {return city;}
    public String get_country() {return country;}
    public String get_name() {return name;}
}
