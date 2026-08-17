class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '['){
                stack.add(current);
            }

            else {

                if (stack.isEmpty()){
                    return false;
                }

                if (
                    current == ')' && stack.peek() == '(' ||
                    current == '}' && stack.peek() == '{' ||
                    current == ']' && stack.peek() == '['
                ){
                    stack.pop();
                }

                else {
                    return false;
                }

            }

            

        }


        return stack.isEmpty();
    }
}