class A {
void add() {
int a=10,b=20;
int c=a+b;
System.out.println("sum="+c);
}
void add(int x,int y) {
int z=x+y;
System.out.println("sum="+z);
}
}
class MethodOverload {
public static void main(String args[]) {
A obj=new A();
obj.add();
obj.add(40,50);
}
}
