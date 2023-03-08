public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge < 0 && vasyaAge > 120 ||
            katyaAge < 0 && katyaAge > 120 ||
            mishaAge < 0 && mishaAge > 120) {
            System.out.println("Такого возраста не существует!");
        } else if (vasyaAge <= katyaAge && katyaAge <= mishaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        } else if (vasyaAge <= mishaAge && mishaAge <= katyaAge) {
            min = vasyaAge;
            middle = mishaAge;
            max = katyaAge;
        } else if (katyaAge <= vasyaAge && vasyaAge < mishaAge) {
            min = katyaAge;
            middle = vasyaAge;
            max = mishaAge;
        } else if (katyaAge <= mishaAge && mishaAge <= vasyaAge) {
            min = katyaAge;
            middle = mishaAge;
            max = vasyaAge;
        } else if (mishaAge <= vasyaAge && vasyaAge <= katyaAge) {
            min = mishaAge;
            middle = vasyaAge;
            max = katyaAge;
        } else if (mishaAge <= katyaAge && katyaAge <= vasyaAge) {
            min = mishaAge;
            middle = katyaAge;
            max = vasyaAge;
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
