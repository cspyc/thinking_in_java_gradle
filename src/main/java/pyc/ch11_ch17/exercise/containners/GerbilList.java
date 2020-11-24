package pyc.ch11_ch17.exercise.containners;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pi
 */
public class GerbilList {

    public List<Gerbil> getGerbilList() {
        List<Gerbil> gerbils = new ArrayList<Gerbil>();
        Gerbil gerbil = new Gerbil(1);
        Gerbil gerbil1 = new Gerbil(2);
        gerbils.add(gerbil);
        gerbils.add(gerbil1);

        for (Gerbil g : gerbils) {
            System.out.println(g.hop());
        }
        return gerbils;
    }


}

class Gerbil {
    public int gerbilNumber;

    public String hop() {
        return "I'm gerbil " + gerbilNumber + " I'm hopping";
    }

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
}
