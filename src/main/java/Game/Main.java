package Game;

import java.util.Scanner;

public class Main {

   // public static Game.User user=new Game.User();

    public static void main(String[] args) {



//        Coffe coffe=new Coffe.Builder()
//                .withSize('L')
//                .withSort("Raf")
//                .withCrepost(15)
//                .build();
//        System.out.println(coffe);





        // Конвертер температуры

        System.out.println("Введите значение Градус Цельсия ");
            Scanner scanner=new Scanner(System.in);
            double a=scanner.nextDouble();

            Converter kelwin=new Converter(){
                public void converter(double celsius) {
                    System.out.println("Значение по Градус Кельвинa (K) = " + (celsius +273.15));
                }
            };

            Converter farengeit = new Converter(){
                public void converter(double celsius) {

                    System.out.println("Значение по Градус Фаренгейта (℉) = " + (celsius * 9/5 + 32));
                }
            };

            Converter njuton = new Converter() {
                public void converter(double celsius) {
                    System.out.println("Значение по Градус Ньютона (°N) " +(celsius * 0.33));
                }
            };

        kelwin.converter(a);
        farengeit.converter(a);
        njuton.converter(a);


        }
    }



