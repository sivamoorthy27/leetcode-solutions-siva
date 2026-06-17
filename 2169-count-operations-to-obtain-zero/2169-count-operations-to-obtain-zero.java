class Solution {
    public int countOperations(int num1, int num2) {
        int a=num1;
        int b=num2;
        int op=0;
        while(a!=0 && b!=0){
            if(a>=b){
                a-=b;
                op++;
            }
            else{
                b-=a;
                op++;
            }
        }
        return op;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna