public class RemoveVowels {
    public  String[] vowelsRemove(String[] instruments) {



        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aeiou]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }
    public String nullPointerException(String s) {

        String str="";
        if (s == "") {
            str = "input string cannot be null";

        }

        return str;
    }
    public String removeVowels(String s) {
        s = s.replaceAll("[aeiou]", "");

        return s;
    }


    public String numericalValues(String s){
        String str="";
        if (!s.matches("[a-zA-Z_]+")) {

            str = "input string should have only characters";

        }

        return str;

    }
}

