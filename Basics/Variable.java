public class Variable {
    String kx = "Tapendra "; // instance var
    int zx = 99; // instance var
    boolean xb; // instance var
  static  double ddd =  99.999;  // static var
  static float fff = 3.33333f; // static var 
static String jkl = "Hello man , i am  tapendra bista ";
    public static void main(String[] args) {
        String x = "Taple"; // local var
        int y = 9; // local var
System.out.println(x+y);
 // now  objection  of class
 Variable objvar = new Variable();
 // Note : To  use or access instance var we have to make object of class
 // but not in static var 
 objvar.xb= true;
 System.out.println(objvar.kx);
 System.out.println(objvar.zx);
 System.out.println(objvar.xb);
//
 System.out.println(ddd);
 System.out.println(fff);
 System.out.println(jkl);


/*
        way of declaring  variable 
        int x = 99
        int data-type
        x varible-name
        99 value of varible 
        */
// position where we declare variable determine  type of variablle
// local  inside main {}
// static  using static keyword 
// instance   at class
// let's see example above
    }
}
