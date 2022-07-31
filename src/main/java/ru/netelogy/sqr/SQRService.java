package ru.netelogy.sqr;

public class SQRService {
    public int sqrBorder(int low, int high) {
        int check = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= low) {
                if (i * i <= high) {
                    check++;
                }
            }
        }
        return check;
    }

}
