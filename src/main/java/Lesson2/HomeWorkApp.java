package Lesson2;

public class HomeWorkApp {
    public static void main (String[] args) {
           System.out.println( "Задание № 1: " + checkSumSign(20, 15));
           checkNumber(0);
           System.out.println( "Задание № 3: " + checkTrueFalse (-9));
           printNTimes("Слово", 5);
    }

    public static boolean checkSumSign (int a, int b){
           int result = (a + b);
            return (result <= 20) && (result >= 10);
            }

    public static void checkNumber(int a) {
        System.out.print("Задание № 2: ");
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean checkTrueFalse (int a){
        return (a<0);
    }
    public static void printNTimes(String w, int t){
//        String o = w.indent(14);
        System.out.println("Задание № 4: ");
        for (int i = 0; i < t; i++){
            System.out.println (w);
        }
    }
}



/*           System.out.println( "Result: " + checkSumSign(20, 15));
                   }

public static int checkSumSign (int a, int b){
        int result = (a + b);
        return result;
        }

        }
*/


