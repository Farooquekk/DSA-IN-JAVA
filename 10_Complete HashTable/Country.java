package HashMap_Theory;

public class Country {

    String name, language;
    double area;
    long population;

    public Country(String name, String language, double area, long population) {
        this.name = name;
        this.language = language;
        this.area = area;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
