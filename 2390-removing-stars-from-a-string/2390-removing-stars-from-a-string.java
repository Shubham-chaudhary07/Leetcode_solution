class Solution {

    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char i: s.toCharArray()){
            if(i!='*'){
                stack.push(i);
                

            }
            else{
                stack.pop();
            }

        }
        for(char c: stack){
            str.append(c);
        }
        return str.toString();

    }
}