import java.util.Deque;
import java.util.LinkedList;

public class Stack {

    private final Deque<Integer> data;
    private final Deque<Integer> min;
    private final Deque<Integer> max;
    Stack(){
        min = new LinkedList<>();
        data = new LinkedList<>();
        max = new LinkedList<>();
    }
    int max(){
        return max.peek();
    }
    int min(){
        return min.peek();
    }
    void pop(){
        if (!data.isEmpty()){
            int temp = data.pop();
            if (temp == min.peek()){
                min.pop();
            }
            if (temp == max.peek()){
                max.pop();
            }
        } else{
            throw new IllegalArgumentException("Стек пустой");
        }
    }
    void push(int x){
        data.push(x);
        if (min.isEmpty() || min.peek() > x){
            min.push(x);
        }
        if (max.isEmpty() || max.peek() < x){
            max.push(x);
        }
    }


}
