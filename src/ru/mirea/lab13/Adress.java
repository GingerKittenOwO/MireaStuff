package ru.mirea.lab13;
import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String block;
    private String appartment;

    public void setLineComma(String line){
        String[] arr = line.split(",");
        country = arr[0].trim();
        region = arr[1].trim();
        city = arr[2].trim();
        street = arr[3].trim();
        house = arr[4].trim();
        block = arr[5].trim();
        appartment = arr[6].trim();

    }
    public void setViaTokenizer(String line){
        StringTokenizer st = new StringTokenizer(line,",;.");
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city= st.nextToken().trim();
        street= st.nextToken().trim();
        house= st.nextToken().trim();
        block= st.nextToken().trim();
        appartment= st.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", block='" + block + '\'' +
                ", appartment='" + appartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Adress adr = new Adress();
        adr.setLineComma("Russia  , Moscow,   Moscow,  Leninskaya,  68,  3,  232");
        System.out.println(adr);
        adr.setViaTokenizer("USA ; Texas, Town.  Green,  72 ; 5 . 786");
        System.out.println(adr);
    }
}
