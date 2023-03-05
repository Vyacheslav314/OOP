package hwOOP1;

import java.util.Comparator;

public class VolumeComparator implements Comparator<HotDrink> {

    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        if (o1.volume == o2.volume) {
            return 0;
        } else if (o1.volume < o2.volume) {
            return -1;
        } else {
            return 1;
        }
    }

}
