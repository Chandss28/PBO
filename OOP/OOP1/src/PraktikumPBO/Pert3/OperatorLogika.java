package PraktikumPBO.Pert3;

public class OperatorLogika {

        public static void main(String[] args) {
            int i = 0;
            int j = 10;
            boolean test = false;
    
            // Demonstrasi &&
            test = (i > 10) && (j++ > 9);
            System.out.println(i);  // 0
            System.out.println(j);  // 10
            System.out.println(test);  // false
    
            // Demonstrasi &
            test = (i > 10) & (j++ > 9);
            System.out.println(i);  // 0
            System.out.println(j);  // 11
            System.out.println(test);  // false
    }
    
    
}
