package com.mercadolivre;

public class Main {

    public static void main(String[] args) {
        String cities[] = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };

        int temperatures[][] = new int[10][2];

        temperatures[0][0] = -2;
        temperatures[1][0] = -3;
        temperatures[2][0] = -8;
        temperatures[3][0] = 4;
        temperatures[4][0] = 6;
        temperatures[5][0] = 5;
        temperatures[6][0] = 0;
        temperatures[7][0] = -7;
        temperatures[8][0] = -1;
        temperatures[9][0] = -10;

        temperatures[0][1] = 33;
        temperatures[1][1] = 32;
        temperatures[2][1] = 27;
        temperatures[3][1] = 37;
        temperatures[4][1] = 42;
        temperatures[5][1] = 43;
        temperatures[6][1] = 39;
        temperatures[7][1] = 26;
        temperatures[8][1] = 31;
        temperatures[9][1] = 35;

        int indexMinTemperature = 0;
        int indexMaxTemperature = 0;
        int minTemperature = 0;
        int maxTemperature = 0;

        for (int l = 0; l < temperatures.length; l++) {
            if (temperatures[l][0] < minTemperature) {
                minTemperature = temperatures[l][0];
                indexMinTemperature = l;
            }
        }

        String cityMinTemperature = cities[indexMinTemperature];

        for (int l = 0; l < temperatures.length; l++) {
            if (temperatures[l][1] > maxTemperature) {
                maxTemperature = temperatures[l][1];
                indexMaxTemperature = l;
            }
        }

        String cityMaxTemperature = cities[indexMaxTemperature];

        System.out.println("A cidade que tem a temperatura mais baixa é " + cityMinTemperature + ", que chegou a " + minTemperature + "° C.");
        System.out.println("A cidade que tem a temperatura mais alta é " + cityMaxTemperature + ", que chegou a " + maxTemperature + "° C.");

    }
}
