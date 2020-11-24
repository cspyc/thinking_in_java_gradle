package pyc.ch16.exercise.array;


import java.util.Random;

/**
 * @author pi
 */
public class IceCreamPicker {
    public String[] getDifferentFlavorsIceCream(int countNum) {
        String[] iceCreams = new String[countNum];
        IceCreamFlavors[] iceCreamFlavors = IceCreamFlavors.values();

        //品味选择标志
        boolean[] isPicked = new boolean[iceCreamFlavors.length];

        for (int i = 0; i < countNum; i++) {
            //挑选没有被选中过的品味
            int position ;
            do {
                position = new Random().nextInt(iceCreamFlavors.length);
            }while(isPicked[position]);

            iceCreams[i] = iceCreamFlavors[position].toString();
            System.out.println(iceCreams[i]);
            isPicked[position] = true;
        }
        return iceCreams;

    }
}
