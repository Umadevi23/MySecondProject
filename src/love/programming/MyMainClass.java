package love.programming;

public class MyMainClass {
    public static void main(String[] args) {
        Person personobject1 = new Person();
        Person personobject2= new Person();
        Person personobject3 = new Person();
        Person personobject4 = new Person();
        personobject1.setFirstName("Dog");
        personobject2.setFirstName("sruthi");
        personobject3.setFirstName("vihaan");
        personobject4.setFirstName("pranay");
        personobject1.setLastName("Brown");
        personobject2.setLastName("kaipa");
        System.out.println(personobject1.getFirstName()+personobject1.setLastName());
        System.out.println(personobject2.getFirstName()+personobject2.getLastName());
        System.out.println(personobject3.getFirstName()+personobject3.getLastName());

    }
}
