class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        
        int result = 0;
        int var1 = 0;
        int var2 = 0;
        for (String s : tokens) {
            if (s.equals("+")) {
                var1 = stack.pop();
                var2 = stack.pop();
                result = var2 + var1;
                stack.push(result);
            } else if (s.equals("-")) {
                var1 = stack.pop();
                var2 = stack.pop();
                result = var2 - var1;
                stack.push(result);
            } else if (s.equals("*")) {
                var1 = stack.pop();
                var2 = stack.pop();
                result = var2 * var1;
                stack.push(result);
            } else if (s.equals("/")) {
                var1 = stack.pop();
                var2 = stack.pop();
                result = var2 / var1;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();

    }
}
