package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private HashMap<Integer, String> months = new HashMap<>();
    public MonthConversion() {
        this.months = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        this.months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return this.months.get(monthNumber);

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        //in    5       out   MAY
        //in   KEY      out  VALUE
        for (Integer key : months.keySet()) {
            if (months.get(key) == monthName) {
                return key;
            }
        }
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        //Does this key hold a value?
        return (this.months.containsKey(monthNumber));
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return (getNumber(monthName) != null);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.months.replace(monthNumber, monthName);

    }
}
