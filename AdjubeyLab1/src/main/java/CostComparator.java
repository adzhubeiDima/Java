import java.util.Comparator;

public class CostComparator implements Comparator<SpareParts> {

    public int compare(SpareParts spareParts1 , SpareParts spareParts2){
        if (spareParts1.getCost() == spareParts2.getCost()) {
            return 0;
        } else if (spareParts1.getCost() < spareParts2.getCost()) {
            return -1;
        } else {
            return 1;
        }
    }
}
