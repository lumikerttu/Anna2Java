package kool;

public class Main {

    public static void main(String[] args) {
        Ring ring1 = new Ring();
        Ring ring2 = new Ring(5);
        Ring ring3 = new Ring(10, "punase");

        System.out.println(ring1.toString());
        System.out.println(ring2.toString());
        System.out.println(ring3.toString());

        System.out.println(ring1.varv + " ring1 ringjoone pikkus  = " + ring1.ringjoonePikkus());
        System.out.println(ring2.varv + " ring2 ringjoone pikkus  = " + ring2.ringjoonePikkus());
        System.out.println(ring3.varv + " ring3 ringjoone pikkus  = " + ring3.ringjoonePikkus());

        System.out.println(ring1.varv + " ring1 pindala  = " + ring1.ringiPindala());
        System.out.println(ring2.varv + " ring2 pindala  = " + ring2.ringiPindala());
        System.out.println(ring3.varv + " ring3 pindala  = " + ring3.ringiPindala()
        );
    }
}
