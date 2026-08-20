class MinStack {

    int size = 10;
    int[] data = new int[size];
    int ptr = -1;

    public MinStack() {
        
    }
    
    public void push(int value) {
        if (ptr == size-1){
            size = size * 2;

            int[] temp = new int[size];

            for (int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        ptr++;
        data[ptr] = value;
    }
    
    public void pop() {
        if (ptr > -1){
            ptr--;
        }
    }
    
    public int top() {
        if (ptr > -1){
            return data[ptr];
        }

        return -1;
    }
    
    public int getMin() {

        if (ptr > -1){
            int min = data[0];

            for (int i = 0; i <= ptr; i++){
                if (min > data[i]){
                    min = data[i];
                }
            }

            return min;
        }

        return -1;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */