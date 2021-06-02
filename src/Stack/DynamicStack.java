package Stack;

public class DynamicStack extends CustomStack{
    @Override
    public void push(int n) {
        if (isFull()){
            int[] temp = new int[data.length * 5];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            this.data = temp;
        }
        super.push(n);
    }
}
