package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void SquareRootCounterTests(String nameTest, int lowerLimit, int upperLimit, int resultSQR) {
        SQRService service = new SQRService();
        int actual = service.SQRService(lowerLimit, upperLimit);
        assertEquals(resultSQR, actual);
    }
}
