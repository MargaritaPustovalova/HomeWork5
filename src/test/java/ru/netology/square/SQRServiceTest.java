package ru.netology.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldFindSquare() {
        SQRService service = new SQRService();
        int count  = 25;
        int expected = 3;

        int actual = service.findSquare(count);

        assertEquals(expected, actual);
    }
}