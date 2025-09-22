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
