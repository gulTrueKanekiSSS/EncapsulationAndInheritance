public class Kogtevran extends House{
    final private int mind;
    final private int wisdom;
    final private int wit;
    final private int creativity;

    Kogtevran(String name, int mind, int wisdom, int wit, int creativity, int magicSkill, int transgressionDistanceSkill) {
        super(name, "Kogtevran", magicSkill, transgressionDistanceSkill);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind(){
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity(){
        return creativity;
    }

    public void compareStudents(Kogtevran student1, Kogtevran student2){
        int totalStudent1 = student1.mind + student1.wisdom + student1.wit + student1.creativity + student1.getTransgressionDistanceSkill() + student1.getMagicSkills();
        int totalStudent2 = student2.mind + student2.wisdom + student2.wit + student2.creativity + student2.getTransgressionDistanceSkill() + student2.getMagicSkills();

        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getName() + " лучший Когтевранец чем " + student2.getName());
        }

        else if (totalStudent1 < totalStudent2) {
            System.out.println(student2.getName() + " лучший Когтевранец чем " + student1.getName());
        }

        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }

    @Override
    void displayCharacteristic(){
        System.out.println("Mind: " + mind);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Wit: " + wit);
        System.out.println("Creativity: " + creativity);
        System.out.println("Magic Skill: " + getMagicSkills());
        System.out.println("Transgression Skill: " + getTransgressionDistanceSkill());
    }
}
