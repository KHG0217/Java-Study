package Chepter5.AbstractClass;

abstract class MyClass {
    int num = 3;
    public MyClass(){}
    public MyClass(int num){
        this.num = num;
    }

    public void methodA(){
        System.out.println("methodA");
    }

    public abstract void methodB();
}
