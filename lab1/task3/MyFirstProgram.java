class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(34, 56);
        System.out.println(o.minus());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.SetA(i);
                o.SetB(j);
                System.out.print(o.minus());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass{
    private int a;
    private int b;

    public int GetA() {return a;}
    public int GetB() {return b;}

    public void SetA(int A) {this.a = A;}
    public void SetB(int B) {this.b = B;}

    MySecondClass (int A, int B){
        this.a = A;
        this.b = B;
    }

    public int minus (){
        return a - b;
    }
}

        
