import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract_creator {
    public String title;
    private Date date;
    private String place;
    private Conctracting_party buyer, dealer;
    private SimpleDateFormat sdf;
    public List<Article> articles = new ArrayList<Article>();

    public Contract_creator(String title){
        this.title = title;
        date = new Date();
        place = "Default";

        buyer = new Buyer();
        dealer = new Dealer();

        sdf = new SimpleDateFormat("dd - MM - yyyy");
    }

    public void read_me(){
        System.out.println("TITLE -------- " + title);
        System.out.println();
        System.out.println("DATE: " + sdf.format(date));
        System.out.println("PLACE: "+place);
        buyer.show_me();
        dealer.show_me();
        System.out.println("ARTICLES: ");

        for (Article article: articles){
            article.show_me();
        }
    }

    public void set_place(String place){this.place = place;}
    public void set_date(Date date){this.date = date;}

    public void  add_article(String name, double price, int count) {
        Article article = new Article(name, price, count);
        articles.add(article);
    }

    //changeing values od buyer
    public void set_buyer_name(String name){buyer.set_name(name);}
    public void set_buyer_nip(String nip){buyer.set_nip(nip);}
    public void set_buyer_city(String city){buyer.set_city(city);}
    public void set_buyer_coutry(String coutry){buyer.set_country(coutry);}
    public void set_buyer_street(String street){buyer.set_street(street);}

    //changeing values of dealer
    public void set_dealer_name(String name){dealer.set_name(name);}
    public void set_dealer_nip(String nip){dealer.set_nip(nip);}
    public void set_dealer_city(String city){dealer.set_city(city);}
    public void set_dealer_coutry(String coutry){dealer.set_country(coutry);}
    public void set_dealer_street(String street){dealer.set_street(street);}

}
