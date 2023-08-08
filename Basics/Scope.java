public class Scope {
    static String name;
    private int number;
    public void Myprint(int number, String namex) {
        name =namex;
        this.number = number;
        System.out.println(this.number);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scope _Scope = new Scope();
        _Scope.Myprint(99, "kkkkkkkkkkkk");
   _Scope.Xprint(9);
    _Scope.Xprint(10);
      _Scope.Xprint(11);
      _Scope.myloop();
    }

public void Xprint( int z){

if (z<10){
    System.out.println("Z is  smallest than 10");
} else if (z>10){
    System.out.println("Z is  greater than 10");
}else if (z==10){
        System.out.println("Z is  equal to 10");
}
}


public void  myloop (){
int i =0;
int sum =0;
int minus =0;
int mul =1;
for (i=1; i<=100; i++){
System.out.println(i); 
sum += i;  
minus -= i;
mul *= i;
}
System.out.println(sum);
System.out.println(minus);
System.out.println(mul);
}

}
