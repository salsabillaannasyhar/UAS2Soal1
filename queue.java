
package uas2soal.pkg2;
public class queue {
    public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(1);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama Saya Yonif Mayoma");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    } 
}
