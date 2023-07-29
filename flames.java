import java.util.*;
import java.lang.*;

public class flames {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String str = "flames";
        System.out.print(s1 + " and " + s2 + " going to be");
        for (int i = 0; i < s1.length(); i++) {
            String t = Character.toString(s1.charAt(i));
            if (s2.contains(t)) {
                s1 = s1.replaceFirst(t, " ");
                s2 = s2.replaceFirst(t, "");
            }
        }

        s1 = s1.replaceAll(" ", "");
        String st = s1 + s2;
        while (str.length() > 1) {
            int h = st.length() % str.length();
            if (h == 0) {
                String k = Character.toString(str.charAt(str.length() - 1));
                str = str.replaceAll(k, "");

            } else {
                h--;
                String k = Character.toString(str.charAt(h));
                str = str.replaceAll(k, "");
                str = str.substring(h, str.length()) + str.substring(0, h);
            }
        }

        if (str.charAt(0) == 'f')
            System.out.print(" friends.");
        else if (str.charAt(0) == 'l')
            System.out.print(" lovers.");
        else if (str.charAt(0) == 'a')
            System.out.print(" affectionate.");
        else if (str.charAt(0) == 'm')
            System.out.print(" marriage.");
        else if (str.charAt(0) == 'e')
            System.out.print(" enemies.");
        else
            System.out.print(" sisters.");

    }
}
