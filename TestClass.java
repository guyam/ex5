package filesprocessing.filters;

public class TestClass {

    public static void main(String[] args) {
        String s1 = "G.u.y.A.txt";
        //String s = "abcd,fg;ijkl, cas";
        String result = s1.substring(s1.lastIndexOf('.') + 1).trim();
        System.out.println(result);
        //System.out.println(s1);
    }


}
