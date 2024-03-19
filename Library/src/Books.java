public class Books {
    private String title;
    private String authors;
    private String area;
    private String publisher;
    private int year;
    private String edition;
    private int page_num;
    private boolean loan;

    public Books (String title, String authors, String area, String publisher, int year, String edition, int page_num, boolean loan) {
        this.title = title;
        this.authors = authors;
        this.area = area;
        this.publisher = publisher;
        this.year = year;
        this.edition = edition;
        this.page_num = page_num;
        this.loan = false;
    }

    /*public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}
    public void setAuthors(String authors) {this.authors = authors;}
    public String getAuthors() {return authors;}
    public void setArea(String area) {this.area = area;}
    public String getArea() {return area;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public String getPublisher() {return publisher;}
    public void setYear(int year) {this.year = year;}
    public int getYear() {return year;}
    public void setEdition(String edition) {this.edition = edition;}
    public String getEdition() {return edition;}
    public void setPage_num(int page_num) {this.page_num = page_num;}
    public int getPage_num() {return page_num;}
    public void setLoan(boolean loan) {this.loan = loan;}
    public boolean isLoan() {return loan;}*/
}
