package rocks.zipcode.assessment2.generics;
import rocks.zipcode.assessment2.generics.ageable.Ageable;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> extends Ageable {
    Ageable creature;


    public Shelter() {
        throw new NullPointerException();
    }
    public Shelter(Ageable creature) {
        this.creature = creature;
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return 0;
    }

    public void add(Object object) {

    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}