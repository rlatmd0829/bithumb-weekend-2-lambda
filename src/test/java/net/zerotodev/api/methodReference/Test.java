package net.zerotodev.api.methodReference;

public class Test {
    private String s1;
    private int s2;
    Test(){}
    Test(String s1, int s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
