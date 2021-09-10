package bTrack;
//Лена руководит разработкой тестирующей системы, в которой реализованы интерактивные задачи.
//
//        До заверщения очередной стадии проекта осталось написать модуль, определяющий итоговый вердикт системы для интерактивной задачи. Итоговый вердикт определяется из кода завершения задачи, вердикта интерактора и вердикта чекера по следующим правилам:
//
//        Вердикт чекера и вердикт интерактора — это целые числа от 0 до 7 включительно.
//        Код завершения задачи — это целое число от -128 до 127 включительно.
//        Если интерактор выдал вердикт 0, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым кодом, и вердикту чекера в противном случае.
//        Если интерактор выдал вердикт 1, итоговый вердикт равен вердикту чекера.
//        Если интерактор выдал вердикт 4, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым кодом, и 4 в противном случае.
//        Если интерактор выдал вердикт 6, итоговый вердикт равен 0.
//        Если интерактор выдал вердикт 7, итоговый вердикт равен 1.
//        В остальных случаях итоговый вердикт равен вердикту интерактора.
//
//        Ваша задача — реализовать этот модуль.
import java.util.Scanner;

public class _1A {

    private int finalVerdict(int code, int interactor, int checker) {
        switch (interactor) {
            case 0: if (code == 0) return checker; else return 3;
            case 1: return checker;
            case 4: if (code == 0) return 4; else return 3;
            case 6: return 0;
            case 7: return 1;
            default: return interactor;
        }
    }

    private void run() {
        Scanner s = new Scanner(System.in);
        int finishCode = s.nextInt();
        int interactor = s.nextInt();
        int checker = s.nextInt();
        System.out.println(finalVerdict(finishCode, interactor, checker));
    }

    public static void main(String[] args) {
        new _1A().run();
    }
}
