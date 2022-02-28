package Lazarte;

public class RemovingWhiteSpaceFromAString {

public static void main(String[] args) {
  String str = " An  dre  a   La  zar te ";
  
    String str1 = str.replaceAll("\\s", "");
    System.out.println(str1);
}
}