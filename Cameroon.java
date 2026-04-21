public class Cameroon extends Country{

    private String country;
    // constructor
    public Cameroon(String country){
        super(country);
    }

    @Override
    public String capital(){
        return "The capital is: Yaounde";

    }

    public String President(){
        return "The current president is Paul Biya. He has been preseident for 45 years.";
    }

    public String toString(){
        return "The country is: " + country;
    }

    public static void main(String[] args){
        Cameroon Cameroon = new Cameroon("Cameroon");
        System.out.println(Cameroon.toString());
        System.out.println(Cameroon.capital());
        System.out.println(Cameroon.President());
    }
}