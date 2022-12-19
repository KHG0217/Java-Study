package Chepter8.Generic;

public class Box<T> { // 타입을 제네릭으로 선언
    T obj;

    public void setValue(T obj){
        this.obj = obj;
    }

    public T getValue(){
        return obj;
    }
}
