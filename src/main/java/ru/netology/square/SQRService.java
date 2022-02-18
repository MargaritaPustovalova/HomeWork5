package ru.netology.square;

public class SQRService {
    public int findSquare(int[] count) {
        int min = 200;
        int max = 300;
        int count = 0;
                for (int i = 10; i <= 99; i++) {
            int s = i * i;
            {
                if (s < max && s > min) {
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}


//package ru.netology.square;

//public class SQRTService {
    //public int findSqrt(int num) {
        //int count = 0;
        //for (int i = 10; i <= 99; i++) {
            //if (i * i != num) {
               // count++;
            //}
        //}
        //return 0;
   // }
//}

