package HW5;

public class Exercise66 {

    public static boolean canSpell(String word, String tiles) {
        String check = "";
        int j = 0;
        for (int i = 0; i < word.length(); i++) {
            if (tiles.indexOf(word.charAt(i)) >= 0) {
                j = tiles.indexOf(word.charAt(i));
                tiles = tiles.substring(0, j) + tiles.substring(j + 1, tiles.length());
                check = check + word.charAt(i);
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("panda", "panddddhyefeifheofegj"));
        System.out.println(canSpell("soccer", "rehikfoosuidcghfhfc"));


        // Student: add more test cases
    }
}

