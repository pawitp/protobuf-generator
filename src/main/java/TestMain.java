import javax.xml.bind.DatatypeConverter;

public class TestMain {

    public static void main(String[] args) {
        Test.Person john = Test.Person.newBuilder()
                .setName("John Doe")
                .setId(1)
                .setEmail("john@example.com")
                .addPhones(Test.Person.PhoneNumber.newBuilder()
                .setNumber("111-222-333").setType(Test.Person.PhoneType.HOME).build())
                .build();
        Test.Person jane = Test.Person.newBuilder()
                .setName("Jane Doe")
                .setId(2)
                .setEmail("jane@example.com")
                .build();
        Test.AddressBook ab = Test.AddressBook.newBuilder()
                .addPeople(john)
                .addPeople(jane)
                .build();

        System.out.println(DatatypeConverter.printHexBinary(ab.toByteArray()));
    }
}
