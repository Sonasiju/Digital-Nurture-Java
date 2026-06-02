public class TypeCasting
{
  public static void main(String[] args)
  {
          double d = 3.1414;
          int a = (int) d; // Explicit

        System.out.println("Double value :" + d);
        System.out.println("Integer value of that value(Explicit Type Casting) :" + a);
    
    int x = 5;
    double y = x;

    System.out.println("Integer value :" + x);
    System.out.println("Double value of that (Implicit Type Casting): " + y);
  
  }


}