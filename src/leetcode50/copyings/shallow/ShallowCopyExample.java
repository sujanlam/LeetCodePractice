package leetcode50.copyings.shallow;

class Address{
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person implements Cloneable{
    String name;
    Address address;
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //Shallow Copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "NY");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone();

        System.out.println(person1.address.city+" "+person1.name);
        System.out.println(person2.address.city+" "+person2.name);

        person2.address.city = "Los Angeles";

        System.out.println(person1.address.city+" "+person1.name);
        System.out.println(person2.address.city+" "+person2.name);


    }


}
