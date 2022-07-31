package ru.netelogy.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void EmptyInSide() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrBorder(0, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EverythingInside() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.sqrBorder(100, 9801);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SomethingInSide() {
        SQRService service = new SQRService();
        int expected = 7;
        int actual = service.sqrBorder(120, 300);
        Assertions.assertEquals(expected, actual);
    }
}
