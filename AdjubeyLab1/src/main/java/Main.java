import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer.CustomerBuilder().surname("Adjubey").name("Dmyto").telephoneNumber("+380668921659").sex(Sex.MALE).build();

        SpareParts sparePartsOrder1 = new SpareParts("Peredni ruchah per unit",20,"Germany");
        SpareParts sparePartsOrder2 = new SpareParts("Kolodku peredni",90,"Germany");
        SpareParts sparePartsOrder3 = new SpareParts("Kolodku zadni",30,"Germany");

        List<SpareParts> listSpareParts = new ArrayList<>();
        listSpareParts.add(sparePartsOrder1);
        listSpareParts.add(sparePartsOrder2);
        listSpareParts.add(sparePartsOrder3);



        Employer employer1 = new Employer("Ivan","Adjubey","+3809999999",Sex.MALE,"Mechanick",15000,"Ruska street");

        Employer employer2 = new Employer("Kolya","Adjubey","+3809999999",Sex.MALE,"Electrican",10000,"Golovna street");
        Order order = new Order(listSpareParts,employer1,customer,"Прийшла машина бмв 530 в кузові е39 в які потрібно передивитись ходову частина, при діагностиці виявлено що потрібно замінити передні та задні колодки та  рулевий ричаг");

        System.out.println(order.toString());


        ArrayList<Employer> employerArrayList = new ArrayList<>();
        employerArrayList.add(employer1);
        employerArrayList.add(employer2);

        Collections.sort(employerArrayList);

        System.out.println("\nСортування  за зарплатою робітника Comparable");
        for (Employer emp: employerArrayList
             ) {
            System.out.print(emp);
        }
        System.out.println("\nСортування за вартістю деталі Comparator");

        CostComparator costComparator = new CostComparator();
        listSpareParts.sort(costComparator);
        for (SpareParts list: listSpareParts) {
            System.out.print(list);
        }



    }
}
