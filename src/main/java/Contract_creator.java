import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract_creator {
    public final Contracting_party buyer;
    public final Contracting_party dealer;
    protected final List<Article> articles = new ArrayList<Article>();
    private String title;
    private Date date;
    private String place;
    private final SimpleDateFormat sdf;

    public Contract_creator(String title) {
        this.title = title;
        date = new Date();
        place = "Default";

        buyer = new Buyer();
        dealer = new Dealer();

        sdf = new SimpleDateFormat("dd - MM - yyyy");
    }

    public void read_me() {
        System.out.println("TITLE -------- " + title);
        System.out.println();
        System.out.println("DATE: " + sdf.format(date));
        System.out.println("PLACE: " + place);
        buyer.show_me();
        dealer.show_me();
        System.out.println("ARTICLES: ");

        for (Article article : articles) {
            article.show_me();
        }
    }

    public String get_title() {
        return this.title;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public String get_place() {
        return this.place;
    }

    public void set_place(String place) {
        this.place = place;
    }

    public String get_date() {
        return this.sdf.format(date);
    }

    public void set_date(Date date) {
        this.date = date;
    }

    public void add_article(String name, double price, int count) {
        Article article = new Article(name, price, count);
        articles.add(article);
    }


}
