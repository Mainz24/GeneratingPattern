public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("No name");
        } else this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        if (surname == null || surname.isEmpty()) {
        throw new IllegalStateException("No surename");
    } else this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null) {
            throw new IllegalStateException("No name build");
        }
        if (age < 0) {
            person = new Person(name, surname);
            person.setAddress(address);
            return person;
        }
        else
            person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
    }
}
