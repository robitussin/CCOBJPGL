import java.util.List;
import java.util.ArrayList;

class Country {
    private String name;
    List<Fauna> fauna;

    public Country(String name) // to assign Country name
    {
        this.name = name;
    }

    public void setlistofFauna(List<Fauna> fauna) {
        this.fauna = fauna;
    }

    public List<String> getSportPersons() {
        List<Fauna> listOfFauna = this.fauna;
        List<String> names = new ArrayList<String>();
        for (Fauna fauna : fauna) {
            names.add(fauna.getName());
        }
        return names;
    }

    public String getName() {
        return this.name;
    }
}