public class Planet {
    public String name;
    public int age;
    public Human[] population;

    public void rotateSun() {

    }
    public void aveAge() {
        int sum = 0;

        for (int i = 0; i < population.length; i++) {
            sum+=population[i].age;
        }
        int avg = sum/population.length;
        System.out.println(avg);
    }
    public void countMale() {
        int males = 0;
        for (Human clovek : population) {
            if (clovek.gendar) {
                males++;
            }
        }
        System.out.println(males);
    }
    public void countFemale() {
        int females = 0;
        for (Human clovek : population) {
            if (!clovek.gendar) {
                females++;
            }
        }
        System.out.println(females);
    }
}
