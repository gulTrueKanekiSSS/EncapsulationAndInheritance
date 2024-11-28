public class Puffendui extends House {
    final private int hardWork;
    final private int loyalty;
    final private int honesty;

    Puffendui(String name, int hardWork, int loyalty, int honesty, int magicSkill, int transgressionDistanceSkill) {
        super(name, "Puffendui", magicSkill, transgressionDistanceSkill);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork(){
        return hardWork;
    }

    public int getLoyalty(){
        return loyalty;
    }

    public int getHonesty(){
        return honesty;
    }

    public void compareStudents(Puffendui student1, Puffendui student2){
        int totalStudent1 = student1.hardWork + student1.loyalty + student1.honesty + student1.getTransgressionDistanceSkill() + student1.getMagicSkills();
        int totalStudent2 = student2.hardWork + student2.loyalty + student2.honesty + student2.getTransgressionDistanceSkill() + student2.getMagicSkills();

        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getName() + " лучший Пуффендуец чем " + student2.getName());
        }

        else if (totalStudent1 < totalStudent2) {
            System.out.println(student2.getName() + " лучший Пуффендуец чем " + student1.getName());
        }

        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }


    @Override
    void displayCharacteristic() {
        System.out.println("Hard work: " + hardWork);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Honesty: " + honesty);
        System.out.println("Magic Skill: " + getMagicSkills());
        System.out.println("Transgression Skill: " + getTransgressionDistanceSkill());
    }
}
