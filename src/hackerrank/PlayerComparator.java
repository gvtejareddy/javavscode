package hackerrank;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.score > o2.score) {
            return -1;
        } else if (o1.score < o2.score) {
            return 1;
        } else {
            if (o1.name.toLowerCase().compareTo(o2.name.toLowerCase()) > 1) {
                return -1;
            } else if (o1.name.compareTo(o2.name) < 1) {
                return 1;
            }
            else{
                return 0;
            }
        }
    }

}
