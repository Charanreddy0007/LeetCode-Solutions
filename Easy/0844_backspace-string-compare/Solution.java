class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char word = s.charAt(i);

            if (word != '#'){
                stack1.add(word);
            } 
            else {
                if (!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }

        for (int i = 0; i < t.length(); i++){
            char word = t.charAt(i);

            if (word != '#'){
                stack2.add(word);
            } 
            else {
                if (!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }

        System.out.println(stack1);
        System.out.println(stack2);

        if (stack1.size() == stack2.size()){
            for(int i = 0; i < stack1.size(); i++){
                if (stack1.get(i) != stack2.get(i)){
                    return false;
                }
            }

            return true;
        }

        return false;

    }

}