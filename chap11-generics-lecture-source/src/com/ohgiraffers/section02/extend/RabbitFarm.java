package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> {} 에러남
//public class RabbitFarm<T extends Animal> {} 정상
public class RabbitFarm<T extends Rabbit> {
//public class RabbitFarm<T extends Rabbit & Animal> {} 클래스와 인터페이스 상속
//public class RabbitFarm<T extends Rabbit, Animal> {} 클래스와 클래스, 에러는 안나지만 권장x

    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

}