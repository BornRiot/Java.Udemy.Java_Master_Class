package code_blocks_methods_statements;

public class Person {
    public static void main(String[] args) {
        Person new_person = new Person("Mike");
        new_person.personName = "Moran";
        new_person.setName("Virgil");

    }
    private String personName; // private = restricted access

    public Person(String name ){
        personName = name;
    }

    // Getter
    public String getName() {
        return personName;
    }

    // Setter
    public void setName(String newName) {
        this.personName = newName;
    }
}