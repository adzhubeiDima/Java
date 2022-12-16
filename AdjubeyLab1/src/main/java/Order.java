import java.util.List;

public class Order {

     private List<SpareParts> spareParts;
     private Employer employers;
     private Customer customer;
     private String problemText;

    public Order(List<SpareParts> spareParts, Employer employers, Customer customer, String problemText) {
        this.spareParts = spareParts;
        this.employers = employers;
        this.customer = customer;
        this.problemText=problemText;
    }

    public List<SpareParts> getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(List<SpareParts> spareParts) {
        this.spareParts = spareParts;
    }

    public  Employer getEmployers() {
        return employers;
    }

    public void setEmployers(Employer employers) {
        this.employers = employers;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public int cost(){
 int cost = 0;
        for (SpareParts sparepart:
             spareParts) {
           cost += sparepart.getCost();


        }
       return cost;
    }

    @Override
    public String toString() {
        return
                 "Customer data: " + customer.getSurname() + " " + customer.getName() + " " + customer.getTelephoneNumber() + "\n" +
                 "Employer: " + employers.getSurname() + " " + employers.getName() + " " + employers.getPosition() + "\n" +
                 "SpareParts data : \n" + spareParts.toString() + "\n" +
                 "Finish cost: " + cost();
    }
}
