package com.company;

//      Параметрине массив алган эки метод жазыныз, бириси массивдин
//      эн кичине элементин тапса, экинчиси эн чон элементин
//      табат жана консолго чыгарат.
//      Мисалы:
//      Массив: 1 8 3 3 4 4 9 12
//      Минимальный элемент: 1
//      Максимальный элемент: 12


public class Main {
    public static void main(String[] args) {
        methodmaximum(new int[]{1 ,8, 3, 3, 4, 4, 90, 12});
        methodminimum(new int[] {0 ,8, 3, 3, 4, 4, 9, 12});
    }
    public static void methodmaximum(int [] massive2){
        int max=0;
        for (int i = 0; i < massive2.length; i++) {
            if (massive2[i]>max){
                max=massive2[i];
            }
        }
        System.out.println("Maximum :"+max);
    }
    public static void methodminimum(int[] massive){
        int min=massive[6];
        for (int i = 0; i <massive.length ; i++) {
            if (massive[i]<min) {
               min=massive[i];
            }
        }
            System.out.println("Minimum :"+min);
    }
}












//        multple(); // Tablica umnojenie
//    }
//    static void multple(){
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("\n");
//            for (int j = 1; j < 10; j++) {
//
//                System.out.print(" "+i*j);






//        method("Salam");
//    }
//    public static void method(String name){
//        System.out.println(name+"Nurmuhammad ");
//    }
//}





//        hello(4);
//    }
//    public static void hello(int a) {
//        multiplication(1,6);
//        addition(1,7);
//        }
//        static void multiplication(int a,int b){
//            System.out.println(a*b);
//        }
//        static void addition(int a,int b){
//            System.out.println(a+b);
//        }
//        static void subtraction(int a, int b){
//            System.out.println(a-b);
//        }
//        static void d(int a, int b){
//        System.out.println(a-b);
//    }
//}

