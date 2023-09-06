package cuales_estan_adentro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CualesEstanDentroTest {

    @Test
    public void testFindSubstringsAndSort() {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] expected = {"arp","live","strong"};
        assertArrayEquals(expected,CualesEstanDentro.findSubstringsAndSort(a1, a2));
    }

    @Test
    public void testFindSubstringsAndSortEmpty() {
        String[] a1 = {"tarp", "mice", "bull"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] expected = {};
        String[] result = CualesEstanDentro.findSubstringsAndSort(a1, a2);
        assertArrayEquals(expected,result);

    }

}
