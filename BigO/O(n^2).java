//this is the worse
//Add ing the second for loop would create (0(n^2) + n). Given tha n is not a dominate number we drop the non dominant number
public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
          
            for (int j = 0; j < n; j++) {
                System.out.println(i + " "+ j);
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }