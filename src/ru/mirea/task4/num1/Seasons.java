package ru.mirea.task4.num1;

public class Seasons {

    public enum Season {
        Spring("прохладное время года"),
        Summer("теплое время года"),
        Autumn("прохладное время года"),
        Winter("холодное время года");

        private String description;
        private double averageTemperature;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            if (this == Summer) {
                return "Теплое время года";
            }
            return "Холодное время года";
        }

        public double getAverageTemperature() {
            return averageTemperature;
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.Summer;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Описание: " + favoriteSeason.getDescription());
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());

        System.out.println("\nИнформация о временах года:");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Описание: " + season.getDescription());
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println();
        }
    }
}
