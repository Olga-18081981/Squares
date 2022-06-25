package ru.netology.sqr;

public class SQRService {
    public int SQRService(int lowerLimit, int upperLimit) {
        int numberSQR = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                //System.out.print("i= " + i + ", i^2 = " + i * i + "\n");
                numberSQR++;
            }
        }
        //System.out.println("Количество вхождений: " + numberSQR + "\n");
        return numberSQR;
    }
}
