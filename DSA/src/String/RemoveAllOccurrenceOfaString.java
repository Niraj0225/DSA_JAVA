package String;

public class RemoveAllOccurrenceOfaString {
    static String removeExtraString(String s, String sub){

        // Replacing all occurrences of
        // Sub in Str by empty spaces
        s=s.replaceAll(sub," ");
//        System.out.println(s);

        // Removing unwanted spaces in the
        // start and end of the string
        s=s.trim();
//        System.out.println(s);
        return s;
    }
    static String removeOccurrence(String s, String sub){

        while (s.contains(sub)){
            int index=s.indexOf(sub);

            s = s.substring(0, index) + s.substring(index + sub.length());
        }

        return s;
    }
    static void main() {
        String str = "LIELIEILIEAMLIECOOL", sub = "LIE";
        System.out.println("brute force: "+removeExtraString(str,sub));
        System.out.println("optimise force: "+removeOccurrence(str,sub));
    }
}
