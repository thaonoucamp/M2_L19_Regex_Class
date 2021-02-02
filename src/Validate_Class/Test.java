package Validate_Class;

public class Test {
    public static void main(String[] args) {
        String class1 = "C0920I1";
        String class2 = "BO8909K";
        String class3 = "1020I";
        String class4 = "C1120I";
        String class5 = "M0990";

        Validate_Class valid = new Validate_Class();

        System.out.println(class1 + " is valid: " + valid.check(class1));
        System.out.println(class2 + " is valid: " + valid.check(class2));
        System.out.println(class3 + " is valid: " + valid.check(class3));
        System.out.println(class4 + " is valid: " + valid.check(class4));
        System.out.println(class5 + " is valid: " + valid.check(class5));


    }
}
