class Gryffindor extends House{
    final private int nobility;
    final private int honor;
    final private int courage;

    Gryffindor(String name, int nobility, int honor, int courage, int magicSkill, int transgressionDistanceSkill) {
        super(name, "Gryffindor", magicSkill, transgressionDistanceSkill);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility(){
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2){
        int totalStudent1 = student1.nobility + student1.honor + student1.courage + student1.getTransgressionDistanceSkill() + student1.getMagicSkills();
        int totalStudent2 = student2.nobility + student2.honor + student2.courage + student2.getTransgressionDistanceSkill() + student2.getMagicSkills();

        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getName() + " лучший Гриффендорец чем " + student2.getName());
        }

        else if (totalStudent1 < totalStudent2) {
            System.out.println(student2.getName() + " лучший Гриффендорец чем " + student1.getName());
        }

        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }




    @Override
    void displayCharacteristic(){
        System.out.println("nobility: " + nobility);
        System.out.println("honor: " + honor);
        System.out.println("courage: " + courage);
        System.out.println("Magic Skill: " + getMagicSkills());
        System.out.println("Transgression Skill: " + getTransgressionDistanceSkill());
    }
}
