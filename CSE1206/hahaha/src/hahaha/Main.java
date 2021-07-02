
package hahaha;
public class Main {
    public static void main (String args[]) {
        SharedValue value = new SharedValue ();

        Func1 f1 = new Func1 (value);
        Func2 f2 = new Func2 (value);

        Thread t1 = new Thread (f1);
        Thread t2 = new Thread (f2);

        t1.start ();
        t2.start ();

        try {
            t1.join ();
            t2.join ();
        } catch (InterruptedException e) {
            System.out.println ("Error");
        }
    }
}

class SharedValue {
    public int arr[] = new int[101];

    public SharedValue () {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    synchronized public void Add1 () {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i] * 1;
        }
    }

    synchronized public void Add2 () {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 3 * i;
        }
    }
}

class Func1 implements Runnable {
    SharedValue val;

    public Func1 (SharedValue obj) {
        this.val = obj;
    }

    @Override
    public void run () {
        this.val.Add1 ();
    }
}

class Func2 implements Runnable {
    SharedValue val;

    public Func2 (SharedValue obj) {
        this.val = obj;
    }

    @Override
    public void run () {
        this.val.Add2 ();
    }
}
