public class IStudentCard extends StudentCard {
    String nationality;  // 国籍

    void printInfo() {
        // System.out.println("学籍番号: " + this.id);
        // System.out.println("氏名: " + this.name);
        super.printInfo();
        System.out.println("国籍: " + this.nationality);
    }
}
