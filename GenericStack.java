package W4_2;

public class GenericStack<Type> {

    Type[] array;
    int top;
    int size;

    public GenericStack(int size) {
        top = -1;
        this.size = size;
        array = (Type[]) new Object[size];
    }

    public void push(Type x) {
        if (isFull()) {
            resize(size*2);
            size = size*2;
        }
        array[++top] = x;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(" <-- top");

    }
    
    public Type top(){
        return array[top];
    }

    public Type pop() {
        Type a = (array[top]);
        array[top] = null;
        top--;
        return a;
    }

    public boolean isFull() {
        return (size == top + 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    
    public void resize(int capacity){
        Type[] tmp = (Type[])new Object[capacity];
        for(int i = 0 ; i < array.length ; i++){
            tmp[i] = array[i];
        }
        array = tmp;
    }
    
}
