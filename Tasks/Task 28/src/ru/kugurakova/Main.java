package ru.kugurakova;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        // TODO: генерируете массив чисел
        int array[] = new int[numbersCount];
        Random random = new Random();
        int sumArray = 0;
        int SumResult = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            sumArray = sumArray + array[i];
        }
        // TODO: выводите их сумму
        System.out.println("sumArray: " + sumArray);
        // TODO: создаете массив потоков
        List<Counter> ptkArray = new ArrayList();
        // TODO: каждому потоку назначете свой участок
        int from=0;
        int to = numbersCount/threadsCount;
        int count = 0;
        while (count < threadsCount) {
            ptkArray.add(count, new Counter(from, to, array));
            // TODO: запускаете каждый поток
            ptkArray.get(count).start();
//            System.out.println("getSumResult("+count+"): " + ptkArray.get(count).getSumResult());
//            ptkArray.get(count).join();
//            SumResult = SumResult + ptkArray.get(count).getSumResult();
            count++;
            from = to+1;
            if (count < threadsCount-1) {
              to = to+numbersCount/threadsCount;
            }
            else {to = numbersCount-1;}
        }
        // TODO: здесь у каждого потока берете sumResult и складываете, смотрите результат.
        for(int i = 0; i < threadsCount; i++){
//            ptkArray.get(i).join();
//            System.out.println("getSumResult("+i+"): " + ptkArray.get(i).getSumResult());
            SumResult = SumResult + ptkArray.get(i).getSumResult();
        }
        System.out.println("SumResult: " + SumResult);
    }
}
