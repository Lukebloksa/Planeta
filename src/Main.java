public class Main {
    public static void main(String[] args) {
        
        Human jezus = new Human();
        jezus.name = "Kristus";
        jezus.ppVolume = Integer.MAX_VALUE;
        jezus.age = 2000;
        jezus.height = 200;
        jezus.gendar = true;
        
        Human eva = new Human();
        eva.ppVolume = -10;
        eva.name = "Eva";
        eva.gendar = false;
        eva.age = 3;
        eva.height = 50;

        Planet kundiHvizd = new Planet();
        kundiHvizd.age = 100000000;
        kundiHvizd.name = "Kundi Hvizd";
        kundiHvizd.population = new Human[]{jezus, eva};

        kundiHvizd.aveAge();
        kundiHvizd.countMale();
        kundiHvizd.countFemale();

    }
}