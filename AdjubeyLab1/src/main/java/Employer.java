public class Employer extends Customer implements Comparable<Employer> {
    private String position;
    private int sallary;
    private String address;

    public Employer(String name, String surname, String telephoneNumber,  Sex sex, String position, int sallary,  String address) {
        super(name, surname, telephoneNumber, sex);
        this.position = position;
        this.sallary = sallary;
        this.address = address;
    }


    public int compareTo(Employer employer){
        if (this.sallary == employer.sallary) {
            return 0;
        } else if (this.sallary < employer.sallary) {
            return -1;
        } else {
            return 1;
        }
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                this.getSurname() + "  " +
                this.getName() + " ; " +
                 position +
                " \n"
                ;
    }
}
