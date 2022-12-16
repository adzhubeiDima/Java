
public class Customer {

    private String name;
    private String surname;
    private String telephoneNumber;
    private Sex sex;

    public Customer(String name, String surname, String telephoneNumber, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                name + " " +
                surname + " " +
                sex + "  " + "\n";


    }

    public static class CustomerBuilder{
        private String name;
        private String surname;
        private String telephoneNumber;
        private Sex sex;

        public CustomerBuilder surname(String surname){
            this.surname=surname;
            return this;
        }
        public CustomerBuilder name(String name){
            this.name=name;
            return this;
        }
        public CustomerBuilder telephoneNumber(String telephoneNumber){
            this.telephoneNumber=telephoneNumber;
            return this;
        }

        public CustomerBuilder sex(Sex sex){
        this.sex=sex;
           return this;
        }

        public Customer build(){
            return new Customer(surname,name,telephoneNumber,sex);

        }
    }
}
