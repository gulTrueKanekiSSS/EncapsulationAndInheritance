class Slytherin extends House {
    final private int ambition;
    final private int cunning;
    final private int leadership;

    Slytherin(String name, int ambition, int cunning, int leadership, int magicSkill, int transgressionDistanceSkill) {
        super(name, "Slytherin", magicSkill, transgressionDistanceSkill);
        this.ambition = ambition;
        this.cunning = cunning;
        this.leadership = leadership;
    }

    public int getAmbition(){
        return ambition;
    }

    public int getCunning(){
        return cunning;
    }

    public int getLeadership(){
        return leadership;
    }

    public void compareStudents(Slytherin student1, Slytherin student2){
        int totalStudent1 = student1.ambition + student1.cunning + student1.leadership + student1.getTransgressionDistanceSkill() + student1.getMagicSkills();
        int totalStudent2 = student2.ambition + student2.cunning + student2.leadership + student2.getTransgressionDistanceSkill() + student2.getMagicSkills();

        if (totalStudent1 > totalStudent2) {
            System.out.println(student1.getName() + " лучший Слизеринец чем " + student2.getName());
        }

        else if (totalStudent1 < totalStudent2) {
            System.out.println(student2.getName() + " лучший Слизаринец чем " + student1.getName());
        }

        else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши");
        }
    }


    @Override
    void displayCharacteristic() {
        System.out.println("Ambition: " + ambition);
        System.out.println("Cunning: " + cunning);
        System.out.println("Leadership: " + leadership);
        System.out.println("Magic Skill: " + getMagicSkills());
        System.out.println("Transgression Skill: " + getTransgressionDistanceSkill());
    }
}
