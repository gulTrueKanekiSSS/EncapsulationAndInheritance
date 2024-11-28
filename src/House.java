abstract class House {
    private String name;
    private String houseName;
    private int magicSkills;
    private int transgressionDistanceSkill;

    House(String name, String houseName, int magicSkill, int transgressionDistanceSkill) {
        this.name = name;
        this.houseName = houseName;
        this.magicSkills = magicSkill;
        this.transgressionDistanceSkill = transgressionDistanceSkill;
    }

    public String getName(){
        return name;
    }

    public String getHouseName() {
        return houseName;
    }

    public int getMagicSkills() {
        return magicSkills;
    }

    public int getTransgressionDistanceSkill() {
        return transgressionDistanceSkill;
    }

    void displayStudentInfo() {
        System.out.println(name + " принадлежит факультету " + houseName + ", сила магии: " + magicSkills + ", сила " +
                "трансгрессии: " + transgressionDistanceSkill);
    }

    abstract void displayCharacteristic();

    static void compareMagic(House student1, House student2) {
        if (student1.magicSkills > student2.magicSkills) {
            System.out.println(student1.name + " обладает большей силой магии, чем " + student2.name);
        }

        else if (student1.magicSkills < student2.magicSkills) {
            System.out.println(student2.name + " обладает большей силой магии, чем " + student1.name);
        }

        else {
            System.out.println(student1.name + " и " + student2.name + " обладают равной силой магии.");
        }

        if (student1.transgressionDistanceSkill > student2.transgressionDistanceSkill) {
            System.out.println(student1.name + " может трансгрессировать на большее расстояние, чем " + student2.name);
        }

        else if (student1.transgressionDistanceSkill < student2.transgressionDistanceSkill) {
            System.out.println(student2.name + " может трансгрессировать на большее расстояние, чем " + student1.name);
        }

        else {
            System.out.println(student1.name + " и " + student2.name + " могут трансгрессировать на равное расстояние.");
        }
    }
}
