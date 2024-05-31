package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestMediana {
    private static int[] array1;
    private static int[] array2;
    private static int[] array3;

    @BeforeAll
    public static void setUp() {
        array1 = new int[]{5, 8, 7, 9, 10};
        array2 = new int[]{4, 6, 6, 8};
        array3 = new int[]{-225, 18, 12, 19, 10};
    }

    @Test
    void testMedianaNotas1() {
        float medianaEsperada1 = 8.0f;
        float medianaObtenida1 = MisArrays.medianaNotas(array1);
        assertEquals(medianaEsperada1, medianaObtenida1,0001);
    }

    @Test
    void testMedianaNotas2() {
        float medianaEsperada2 = 6.0f;
        float medianaObtenida2 = MisArrays.medianaNotas(array2);
        assertEquals(medianaEsperada2, medianaObtenida2,0001);
    }

    @Test
    void testMedianaNotas3() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.medianaNotas(array3);
        });
    }

}
