package test;

import org.junit.jupiter.api.Test;
import problemone.XPowerN;

import static org.junit.jupiter.api.Assertions.*;

class XPowerNTest {

    @Test
    void itShouldReturnOneIfBaseIsOne(){
        int base = 1;
        double expected = 1;
        assertEquals(expected, XPowerN.powerExp(base,10));
    }
    @Test
    void itShouldReturnBaseIfExponentIsOne(){
        int exponent = 1;
        double expected = 5;
        assertEquals(expected, XPowerN.powerExp(5,exponent));
    }

    @Test
    void itShouldReturnZeroIfBaseIsZero(){
        int base = 0;
        double expected = 0;
        assertEquals(expected, XPowerN.powerExp(base,2));
    }

    @Test
    void itShouldReturnPositiveNumberIfBaseIsNegativeAndExponentIsEven(){
        double poweredExp = XPowerN.powerExp(-1,2);
        assertTrue(poweredExp > 0);
        assertEquals(1,poweredExp);
    }

    @Test
    void itShouldReturnNegativeNumberIfBaseIsNegativeAndExponentIsOdd(){
        double poweredExp = XPowerN.powerExp(-1,3);
        assertTrue(poweredExp < 0);
        assertEquals(-1, poweredExp);
    }



}