package FunctionDemo;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "," + getColor() +"猫吃"+ something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
