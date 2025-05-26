package Class2;
//큐
import java.io.*;
import java.util.*;
public class P10845 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        MyQue que = new MyQue();
        int OpNum = Integer.parseInt(br.readLine());
        for(int i = 0; i <OpNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String Op = st.nextToken();
            int data=0;
            if(st.hasMoreTokens()) data = Integer.parseInt(st.nextToken());
            switch (Op){
                case "push": que.push(data);
                break;
                case "pop": bw.write(que.pop() + "\n");
                break;
                case "size": bw.write(que.size() +"\n");
                break;
                case "empty": bw.write(que.empty()+"\n");
                break;
                case "back": bw.write(que.back()+"\n");
                break;
                case "front": bw.write(que.front()+"\n");
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}

class MyQue{
    int top;
    int[] que;
    public MyQue(){
        this.top = -1;
        this.que = new int[10];
    }

    public void push(int data){
        if(top+1 == que.length){
            int[] temp = new int[que.length*2];
            System.arraycopy(que,0,temp,0,que.length);
            que = temp;
        }
        top++;
        que[top] = data;
    }

    public int pop(){
        if(top== -1) return -1;
        int temp = que[0];
        for(int i=1; i<que.length; i++){
            que[i-1] = que[i];
        }
        top--;
        return temp;
    }

    public int size(){
        return top+1;
    }

    public int empty(){
        if(top == -1) return 1;
        else return 0;
    }

    public int front(){
        if (top == -1) return -1;
        else return que[0];
    }

    public int back(){
        if(top == -1) return -1;
        else return que[top];
    }
}