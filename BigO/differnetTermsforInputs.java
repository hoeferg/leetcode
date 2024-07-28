//This is a catcha question. We cannot use n here. Instead this is O(a+b). This is because we dont know what a and b are. They can be completly different.  This is the most simbilified version it can be

public static void printItems (int a, int b) {
    for (int i = 0; i < a; i++) {
        System.out.println(i);
    }
    for (int i = 0; i < b; i++) {
        System.out.println(i);
    }
}

//This becomes O(a * b)
public static void printItems (int a, int b) {
    for (int i = 0; i < a; i++) {
        System.out.println(i);
        for (int i = 0; i < b; i++) {
            System.out.println(i);
        }
    }
}