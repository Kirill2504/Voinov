package com.company.Others;


public class SeasonDemo {
    public static void main(String[] args) {
        Season myFavSeason = Season.SUMMER;
        printSeason(myFavSeason);
        System.out.println();
        printAllSeasons();
        System.out.println();
        printSeason("AUTUMN");
        System.out.println();
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printAllSeasons() {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season + " средняя температура:" + season.getTemp()+" "
            +season.getDescription());
        }

    }

    public static void printSeason(String str) {
        Season someSeason = Season.valueOf(str);
        System.out.println(someSeason);
    }
}
