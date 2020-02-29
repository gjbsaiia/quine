public class PrintSelf{

  static String header = "public class PrintSelf{\n\n";
  static String after = "public static void main(String args[]){\n  methodA(methodB);\n  }\n\n  public static void methodA(String methodB){\n  System.out.print(String.format(\"%s static String header = \"%s\"\n static String after = \"%s\"\n static String close=\"%s\"\n%s%s\n%s\n\n\", header, header, after, close,  after, methodB, close));\n\n";
  static String close = "}";

  public static void main(String args[]){
    methodA(methodB());
  }

  public static void methodA(String methodB){
    System.out.print(String.format("%s static String header = \"%s\"\n static String after = \"%s\"\n static String close=\"%s\"\n%s%s\n%s\n\n", header, header, after, close,  after, methodB, close));
  }

  public static String methodB(){
    String methodString = "public static String methodB(){\n";
    String makingStrings = "return String.format(\"%s    String methodString = \"%s\"\n    String makingStrings = \"%s\"\n %s\", methodString, methodString, makingStrings, makingStrings);\n}";
    return String.format("%s    String methodString = \"%s\"\n    String makingStrings = \"%s\"\n %s", methodString, methodString, makingStrings, makingStrings);
  }
}
