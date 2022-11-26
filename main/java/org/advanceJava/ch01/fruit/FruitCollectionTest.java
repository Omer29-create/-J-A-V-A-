package org.advanceJava.ch01.fruit;

public class FruitCollectionTest {

    public static void main(String[] args) {
        FruitCollection coll = new FruitCollection();
        coll.add(new Apple());
        coll.add(new Banana());
        coll.add(new Melon());

        Object o;
        o = coll.get(1);
        Banana b = (Banana) o;
        b.peel();  // Banana is being peeled.
        b.eat();  // Banana is being eaten.

        o = coll.get(0);  // index'i 2 yapinca hata gidiyor
        Melon m = (Melon) o;   // Isn't this risky?
        m.cut();       // Are you sure it is a melon?
        m.eat();


    }
}
