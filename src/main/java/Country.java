import java.util.Arrays;
import java.util.Objects;

public class Country {
    private String name;
    private String code;
    private String county_code;
    private String effective_from;
    private String[] rates;

    public Country(String name, String code, String county_code, String effective_from, String[] rates) {
        this.name = name;
        this.code = code;
        this.county_code = county_code;
        this.effective_from = effective_from;
        this.rates = rates;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCounty_code() {
        return county_code;
    }

    public String getEffective_from() {
        return effective_from;
    }

    public String[] getRates() {
        return rates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) &&
                Objects.equals(code, country.code) &&
                Objects.equals(county_code, country.county_code) &&
                Objects.equals(effective_from, country.effective_from) &&
                Arrays.equals(rates, country.rates);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, code, county_code, effective_from);
        result = 31 * result + Arrays.hashCode(rates);
        return result;
    }
}
