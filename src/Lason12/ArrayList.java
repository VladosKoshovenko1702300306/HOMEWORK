package Lason12;
import java.util.Scanner;
public class ArrayList <T>{
    private Object[] arry;
    private int  size;
    ArrayList (int size){
        this.size=size;
        arry = new Object[size];
    }
    void  add(T element){
        if (size< arry.length){
            arry[size]=element;
            size ++;
        }else {}

    }
    void add (T element, int index ){
        if (index >=0 && index <size ){
            if (size< arry.length){
                for (int i = size - 1; i>= index; i--){
                    arry [i+1] = arry[i];
                }
                arry [index]=element;
                size ++;
            }else {
                throw new IndexOutOfBoundsException("Невірне значення");
            }
        }else {
            throw new IndexOutOfBoundsException("Невірний індекс "+ index);
        }
    }
    int indexoff(T element){
        for (int i = 0; i<size; i++){
            if (arry [i]== element||(element != null && element.equals(arry [i]))){
                return i;
            }
        }
        return  -1;
    }
    boolean isConst (T element) {
        return indexoff(element) !=1;
    }
    public static void  main  (String[] agsr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть розмір масиву");
        int size = scan.nextInt();
        if (size<0){
            throw new IndexOutOfBoundsException("Невірне значення");
        }
        int [] array = new int[size];
        System.out.println("Введіть елементи масиву : ");
        for (int i = 0; i< size; i++){
            array[i]= scan.nextInt();
        }
        System.out.println("Ваш масив: ");
        for (int val:array){
            System.out.println(val);
        }
        System.out.println("Введіть потрібний вам елемент масиву");
        int i = scan.nextInt();
        if(i>0 && i<= array.length){
            System.out.println("Ви вибрали елемент массиву: " + i);
        }else {
            throw new IndexOutOfBoundsException("Невірний індекс "+ i);}

    }

}