/**
 * 包含min函数的栈
 * 除了原始栈外还要维护一个最小栈，记录每次push pop后的最小值
 * @Author hyx
 * @Date 2020/12/22
 */
class MinStack {
    private int[] mainArray;
    private int[] minArray;
    //不可为0
    private int top = -1;
    private int stackSize = 10000;

    /** initialize your data structure here. */
    public MinStack() {
        mainArray = new int[stackSize];
        minArray = new int[stackSize];
    }

    public void push(int x) {
        top++;
        mainArray[top] = x;
        //栈为空时
        if(top == 0){
            minArray[top] = x;
        }else{
            //和之前的最小值比较
            if(x < minArray[top-1]){
                minArray[top] = x;
            }else{
                minArray[top] = minArray[top-1];
            }
        }
    }

    public void pop() {
        //当又一次为空栈时，top又再一次变为-1
        if(top >= 0){
            top--;
        }
    }

    public int top() {
        return mainArray[top];
    }

    public int min() {
        return minArray[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */