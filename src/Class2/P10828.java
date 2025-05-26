package Class2;

import java.io.*;
import java.util.StringTokenizer;

//스택
public class P10828 {
    public static void main(String[] args) throws IOException {
        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int OpNum = Integer.parseInt(br.readLine());
        for(int i = 0; i <OpNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String Op = st.nextToken();
            int data = 0;
            if(st.hasMoreTokens()) data = Integer.parseInt(st.nextToken());
            if (Op.equals("push")) stack.push(data);
            if (Op.equals("pop")) stack.pop();
            if (Op.equals("size")) stack.size();
            if (Op.equals("empty")) stack.empty();
            if (Op.equals("top")) stack.top();
        }
    }
}

class Stack {
    int top;
    int[] stack;
    int size;
    public Stack(){
        this.top = -1;
        this.stack = new int[10];
        this.size = 10;
    }
    public Stack(int size){
        this.top = -1;
        this.stack = new int[size];
        this.size = size;
    }
    public void push(int data){
        if(this.top == this.size -1){
            int[] temp = new int[size*2];
            System.arraycopy(this.stack,0,temp,0,this.size);
            this.stack = temp;
            size = size*2;
        }
        this.top++;
        this.stack[top] = data;
    }

    public void pop(){
        if (top == -1) {
            System.out.println(-1);
            return;
        }
        int temp = this.stack[top];
        top--;
        System.out.println(temp);
    }

    public void size(){
        System.out.println(top+1);
    }

    public void empty(){
        if(this.top== -1) System.out.println(1);
        else System.out.println(0);
    }

    public void top(){
        if(top== -1) System.out.println(-1);
        else System.out.println(this.stack[top]);
    }
}