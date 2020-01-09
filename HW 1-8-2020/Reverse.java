/**
 * makes reverseList methods
 * @author Arin Gadre
 * @version 1-8-2020
 */
import java.util.ArrayList;
import java.util.Random;
public class Reverse
{
    public Reverse(){
        ArrayList<String> list1 = loadArrayList();
        String[] list2 = loadArray();
        ArrayList<String> list3 = reverseList(list1);
        String[] list4 = reverseArr(list2);
        
        System.out.println(list1);
        System.out.println(list3);
        printArray(list2);
        printArray(list4);
    }

    public ArrayList<String> reverseList(ArrayList<String>  list){
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++)
            result.add(list.get(i));
        return result;
    }

    public void printArray(String[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1] + "]");
        System.out.println();
    }

    public String[] loadArray(){
        String[] result = new String[10];
        for(int i = 0; i < 10; i++)
            result[i] = randomStringGen();
        return result;
    }

    public ArrayList<String> loadArrayList(){
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < 10; i++)
            result.add(randomStringGen());
        return result;
    }

    public String[] reverseArr(String[] list){
        String[] result = new String[list.length];
        for(int i = 0; i < list.length; i++)
            result[i] = list[i];
        return result;
    }

    public String randomStringGen(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random r = new Random();
        int targetStringLength = r.nextInt(9) + 1;
        String generatedString = r.ints(leftLimit, rightLimit + 1)
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
        return generatedString;
    }

    public static void main(String[] args){
        Reverse r = new Reverse();
    }
}
