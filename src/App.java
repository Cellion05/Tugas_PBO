// abstract
// inheritance
// encapsulation
// overriding
// overloading

abstract class Peminjaman {
    void denda(){}
    void pengembalian(){}
}

class PBO extends Peminjaman{
    @Override
    void denda(){
        
    }
}

class Parent{
    public int x;
    
    void print(String tipeanggota, int bayar){
        System.out.println("abcd");
    }

    void print(String tipeanggota){
        System.out.println("efgh");
    }

    void print(){
        System.out.println("Class Parent");
    }
}

class A extends Parent{
    @Override
    void print(){
        System.out.println("Class A");
    }
    void test(){
        print();
        x = 5;
    }
}

class B extends A{
    @Override
    void print(){
        System.out.println("Class B");
    }
    void test2(){
        print();
    }
}

public class App extends Parent {
    
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();
        parent.print("mahasiswa");
        parent.print("mahasiswa", 0);

        A a = new A();
        a.print();

        B b = new B();
        b.print();
    }
}
