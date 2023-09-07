package cuales_estan_adentro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CualesEstanDentro {

    public static String[] findSubstringsAndSort(String[] a1, String[] a2) {

        StringBuilder sBuilder = new StringBuilder();

        for (
                int i = 0;
                i < a2.length; i++) {
            sBuilder.append(a2[i] + " ");
        }

        List<String> l = new ArrayList<>();
        for (
                int i = 0;
                i < a1.length; i++) {
            if (sBuilder.indexOf(a1[i]) != -1)
                l.add(a1[i]);
        }

        String arr[] = l.toArray(new String[l.size()]);
        System.out.println(Arrays.toString(l.toArray()));
        return arr;
    }
}
