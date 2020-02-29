
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args){
        String str = "ihihhh";
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 1).equals(str.substring(str.length() - 1))){
                containsPair = true;
            }
        }

    }

    public int strDist(String str, String sub){
        if(str.length() < sub.length()){
            return 0;
            if(str.substring(0, sub.length()).equals(sub) &&
            str.substring(str.length() - sub.length()).equals(sub))
                return str.length();

            if(!str.substring(0, sub.length()).equals(sub))
                return strDist(str.substring(1), sub);

            return strDist(str.substring(0, str.length()-1), sub);
        }

    }
