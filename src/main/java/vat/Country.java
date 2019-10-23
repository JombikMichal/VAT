package vat;

import java.util.Arrays;
import java.util.Objects;

public class Country {
    private String name;
    private String code;
    private String county_code;
    private String effective_from;
    private String[] rates;

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCounty_code(String county_code) {
        this.county_code = county_code;
    }

    public void setEffective_from(String effective_from) {
        this.effective_from = effective_from;
    }

    public void setRates(String[] rates) {
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
