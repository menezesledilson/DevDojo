package javaCore.ZZHpadroesProjeto.dominio;

public class Person {
    //builder
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private Person(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }


    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        private PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder FirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder LastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder UserName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder Email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, userName, email);
        }

    }

    public String getFirstName() {
        return firstName;
    }
}


